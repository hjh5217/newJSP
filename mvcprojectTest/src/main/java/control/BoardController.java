package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// getContextPath() - 프로젝트 경로만 가져옴
		// getRequestURI() - 프로젝트/파일명 까지 가져옴
		// getRequestURL() - localhost/프로젝트/파일명 전부 가져옴
		String serviceStr = request.getRequestURI().substring(
				(request.getContextPath()+"/board/").length()
				);
	
		System.out.println(serviceStr); // 클래스명만 나옴.
		
		try {
			//Object service = Class.forName("ser_p."+serviceStr).newInstance();
			BoardService service = (BoardService)Class.forName("ser_p."+serviceStr).newInstance();
			service.execute(request, response);
			
			request.setAttribute("mainPage", serviceStr);
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/views/template.jsp");
			
			dispatcher.forward(request, response);
			
		}  catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
