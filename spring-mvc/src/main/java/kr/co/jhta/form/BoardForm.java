package kr.co.jhta.form;

import org.springframework.web.multipart.MultipartFile;

// VO는 DB값을 담을려고 만든 클래스
// 폼입력값을 담을려고 만든 클래스
// DB에 파일을 담을수 없기때문에
public class BoardForm {
	private String title;
	private String writer;
	private String content;
	private String password;
	private MultipartFile upfile; // 
	
	public BoardForm() {}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public MultipartFile getUpfile() {
		return upfile;
	}

	public void setUpfile(MultipartFile upfile) {
		this.upfile = upfile;
	}
	
}
