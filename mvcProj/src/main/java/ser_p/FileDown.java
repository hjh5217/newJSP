package ser_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class FileDown implements BoardService{
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String fName = request.getParameter("fName");
		System.out.println("FileDown.execute() 실행 "+fName);
		
		// 실제 배포시에는 RealPath 를 쓰는게 맞음.
		String path = request.getRealPath("up");
		// 이클립스 작업용 주소
		path = "C:\\green_project\\newJSP\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileInputStream fis = new FileInputStream(path+"\\"+fName);
			String encFName = URLEncoder.encode(fName, "utf-8");
			System.out.println(fName + "->" + encFName);
			response.setHeader("Content-Disposition", "attachment;filename="+encFName);
			ServletOutputStream sos = response.getOutputStream();
			byte [] buf = new byte[1024];
			
			//int cnt = 0;
			while(fis.available()>0) { // 보낼게 남아있다면 
				int len = fis.read(buf); // 읽어서 -> buf 에 넣음 -> 넣은 byte 길이가 len
				
				sos.write(buf,0,len); // 보낸다 : buf 의 0부터 len 만큼
				//cnt ++;
				//System.out.println(cnt + ":" + len + "kb");
			}
			
			// 열었으면 닫자.
			sos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
