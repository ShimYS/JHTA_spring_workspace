package kr.co.jhta.vo;

import java.util.Date;

public class Comment {
	private int no;
	private User writer;
	private String content;
	private Blog blog;
	private Date createDate;
	
	public Comment () {}
	
	public Comment(User writer, String content, Blog blog) {
		super();
		this.writer = writer;
		this.content = content;
		this.blog = blog;
	}

	int getNo() {
		return no;
	}

	void setNo(int no) {
		this.no = no;
	}

	User getWriter() {
		return writer;
	}

	void setWriter(User writer) {
		this.writer = writer;
	}

	String getContent() {
		return content;
	}

	void setContent(String content) {
		this.content = content;
	}

	Blog getBlog() {
		return blog;
	}

	void setBlog(Blog blog) {
		this.blog = blog;
	}

	Date getCreateDate() {
		return createDate;
	}

	void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
