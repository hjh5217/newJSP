package ser_i;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ImageService;
import model_i.ImageDAO;

public class GDetail implements ImageService{
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","이미지 보기");
		System.out.println("GDetail execute() 실행");
		
		int id = Integer.parseInt(request.getParameter("id"));
		new ImageDAO().addCount(id);
		request.setAttribute("mainData", new ImageDAO().detail(id));
	}
	
}
