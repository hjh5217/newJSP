package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ser_p.BList;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 * System.out.println(request.getRequestURI());
		 * System.out.println(request.getContextPath()+"/board/");
		 */
		
		  
		  
		String serviceStr = request.getRequestURI().substring(
				(request.getContextPath()+"/board/").length()
				);
		System.out.println(serviceStr);
		try {
			System.out.println("1"+request.getRequestURI());
			  System.out.println("2"+request.getContextPath()+"/board/");
			  System.out.println("3 "+request.getRequestURL());
			  System.out.println("4 "+(request.getContextPath()+"/board/").length());
			  System.out.println("5 "+Class.forName("ser_p."+serviceStr));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
