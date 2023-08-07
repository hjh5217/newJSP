package ser_i;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ImageService;
import model_i.ImageDAO;
import model_p.BoardDAO;

public class GList implements ImageService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","갤러리");
		System.out.println("GList execute() 실행");
		
		request.setAttribute("mainData", new ImageDAO().list());
	}

}
