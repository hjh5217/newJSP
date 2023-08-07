package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gallery/*")
public class ImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ImageController() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String serviceStr = request.getRequestURI().substring(
				(request.getContextPath()+"/gallery/").length()
				);
		System.out.println(serviceStr);
		try {
			request.setCharacterEncoding("utf-8");
			request.setAttribute("mainPage", "gallery/"+serviceStr);
			ImageService service = (ImageService)Class.forName("ser_i."+serviceStr).newInstance();
			service.execute(request, response);
			
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
