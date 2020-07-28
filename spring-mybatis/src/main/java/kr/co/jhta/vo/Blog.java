package kr.co.jhta.vo;

import java.util.Date;

public class Blog {
	
	private int no;
	private String title;
	private User writer;
	private String content;
	private int likes;
	private int commentCounts;
	private Date createDate;
	
	public Blog() {}
	
	public Blog(String title, User writer, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	int getNo() {
		return no;
	}
	void setNo(int no) {
		this.no = no;
	}
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
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
	int getLikes() {
		return likes;
	}
	void setLikes(int likes) {
		this.likes = likes;
	}
	int getCommentCounts() {
		return commentCounts;
	}
	void setCommentCounts(int commentCounts) {
		this.commentCounts = commentCounts;
	}
	Date getCreateDate() {
		return createDate;
	}
	void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
