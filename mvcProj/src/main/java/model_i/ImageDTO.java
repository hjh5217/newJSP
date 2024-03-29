package model_i;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class ImageDTO {
	String title,pname,pw,upfile,content;
	Date reg_date;
	int id,cnt;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) HH:mm");
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getUpfile() {
		
		if(upfile==null 
				|| upfile.trim().equals("") 
				|| upfile.trim().equals("null")) {
			upfile = "";
		}
		
		return upfile;
	}
	
	public boolean isImg() {
		// [.] . 한글자
		boolean res = Pattern.matches(".*[.](jpg|bmp|png|gif)", getUpfile().toLowerCase());
		
		return res;
	}
	
	public void setUpfile(String upfile) {
		this.upfile = upfile;
	}
	public String getContent() {
		return content;
	}
	public String getContentBr() {
		return content.replaceAll("\n", "<br/>");
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getReg_dateStr() {
		return sdf.format(reg_date);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
