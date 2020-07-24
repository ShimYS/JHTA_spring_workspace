package kr.co.jhta.step2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.dao.BookDao;
import kr.co.jhta.vo.Book;

public class Main {
	
	public static void main(String[] args) throws Exception {
		String conf = "classpath:/spring/context.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		BookDao bookDao = ctx.getBean(BookDao.class);
		List<Book> books = bookDao.getAllBooks();
		for(Book book : books) {
			System.out.println(book.getNo() + " | " + book.getTitle());
		}
	}
}
