package ser_i;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ImageService;

public class GWriteForm implements ImageService{
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","이미지 업로드");
		
	}
}
