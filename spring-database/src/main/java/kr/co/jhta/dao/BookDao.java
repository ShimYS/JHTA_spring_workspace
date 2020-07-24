package kr.co.jhta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import kr.co.jhta.vo.Book;

public class BookDao {
	
	// DB Connection Pool 받을 '객체'
	private DataSource dataSource;
	// 객체에 연결하기 위한 '잭'
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private Book resultsetToBook(ResultSet rs) throws Exception {		
		Book book = new Book();
		
		book.setNo(rs.getInt("book_no"));
		book.setTitle(rs.getString("book_title"));
		book.setWriter(rs.getString("book_writer"));
		book.setGenre(rs.getString("book_genre"));
		book.setPublisher(rs.getString("book_publisher"));
		book.setPrice(rs.getInt("book_price"));
		book.setDiscountPrice(rs.getInt("book_discount_price"));
		book.setRegisteredDate(rs.getDate("book_registered_date"));
		book.setStock(rs.getInt("book_stock"));
		book.setPoint(rs.getDouble("book_point"));
		book.setLikes(rs.getInt("book_likes"));
		
		return book;
	}
	
	public void insertBook(Book book) throws SQLException {
		String sql = "insert into sample_books(book_no, book_title, book_writer, book_genre, book_publisher, book_price, book_discount_price)"
				+ "values(sample_book_seq.nextval, ?, ?, ?, ?, ?, ?)";
		
		Connection connection = dataSource.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, book.getTitle());
		pstmt.setString(2, book.getWriter());
		pstmt.setString(3, book.getGenre());
		pstmt.setString(4, book.getPublisher());
		pstmt.setInt(5, book.getPrice());
		pstmt.setInt(6, book.getDiscountPrice());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	public void deleteBook(int bookNo) throws SQLException {
		String sql = "delete from sample_books where book_no = ?";
		
		Connection connection = dataSource.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, bookNo);
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
	}
	
	public void updateBook(Book book) throws SQLException {
		String sql = "update sample_books"
				+ "set book_price = ?, book_discount_price = ? where book_no = ?";
		
		Connection connection = dataSource.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, book.getPrice());
		pstmt.setInt(2, book.getDiscountPrice());
		pstmt.setInt(3, book.getNo());
		
		
		pstmt.executeUpdate();
		
		pstmt.close();
		connection.close();
		
	}
	
	public Book getBookByNo(int bookNo) throws Exception {
		String sql = "select * from smaple_books where book_no = ?";
		Book book = null;
		
		Connection connection = dataSource.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, bookNo);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			book = resultsetToBook(rs);
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return book;
	}
	
	public List<Book> getAllBooks() throws Exception {
		String sql = "select * from sample_books";
		List<Book> books = new ArrayList<Book>();
		
		Connection connection = dataSource.getConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Book book = resultsetToBook(rs);
			books.add(book);
		}
		rs.close();
		pstmt.close();
		connection.close();
		
		return books;
	}
}









































