package ser_i;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.ImageService;
import model_i.ImageDAO;
import model_i.ImageDTO;

public class GWriteReg implements ImageService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getRealPath("upload");
		path = "C:\\green_project\\newJSP\\mvcProj\\src\\main\\webapp\\upload";
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request, 
					path,
					10*1024*1024,
					"utf-8",
					new DefaultFileRenamePolicy()
					);
			
			ImageDTO dto = new ImageDTO();
			dto.setTitle(mr.getParameter("title"));
			dto.setContent(mr.getParameter("content"));
			dto.setPname(mr.getParameter("pname"));
			dto.setPw(mr.getParameter("pw"));
			dto.setUpfile(mr.getFilesystemName("upfile"));
			
			new ImageDAO().writeGallery(dto);
			
			request.setAttribute("mainPage", "inc/alert");
			request.setAttribute("msg", "입력되었습니다.");
			request.setAttribute("goUrl", "GList");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
