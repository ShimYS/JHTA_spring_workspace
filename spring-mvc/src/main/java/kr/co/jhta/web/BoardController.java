package kr.co.jhta.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.jhta.form.BoardForm;
import kr.co.jhta.service.BoardService;
import kr.co.jhta.vo.Board;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Value("${directory.save.freeboard}")
	private String saveDirectory;
	
	@RequestMapping("/list.do")
	public String boardList(Model model) {
		// 게시글 전체 조회
		List<Board> boards = boardService.getAllBoards();
		// 조회된 게시글을 Model에 담아서 뷰 페이지에 전달하기
		model.addAttribute("boards", boards);
		// 내부이동할 JSP 페이지의 경로 및 이름 반환
		return "board/list"; //WEB-INF/view/board/list.jsp
	}
	
	@RequestMapping("/form.do")
	public String form() {	
		return "board/form";
	}
	
	@RequestMapping("/add.do")
	public String addBoard(BoardForm boardForm) throws FileNotFoundException, IOException {
		Board board = new Board();
		// title, writer, content, password 값이 boardForm에서 board로 복사된다.
		// boardForm을 board에 복사한다. (이름과 타입이 일치해야 정상적인 복사가 된다. 이름이 같은데 타입이 다르면 에러 발생함)
		BeanUtils.copyProperties(boardForm, board);
		// 첨부파일 다루기
		// 파일을 업로드 하던 안하던 MultipartFile은 언제나 null이 아니다. 객체가 존재한다. form에 enctype 설정을 안할때만 null이다.
		MultipartFile upfile = boardForm.getUpfile();
		if(!upfile.isEmpty()) { // 첨부파일 존재여부
			String filename = upfile.getOriginalFilename(); // 업로드된 첨부파일 이름 알아내기 
			filename = System.currentTimeMillis() + filename; // 파일이름 중복방지를 위해 업로드 순간의 시간을 파일이름에 추가해준다.
			File file = new File(saveDirectory, filename);
			FileCopyUtils.copy(upfile.getInputStream(), new FileOutputStream(file)); // getInputStream으로 첨부파일 내용 읽어오기
			board.setFilename(filename);
		}
		boardService.addNewBoard(board);
		return "redirect:list.do";
	}
	
	@RequestMapping("/likes.do")
	public String likesBoard(@RequestParam("no") long boardNo, RedirectAttributes redirectAttributes) { // 요청파라미터에서 쿼리스트링 값을 읽어올때 '@RequestParam("쿼리스트링네임") 담고싶은 변수'을 사용한다.
		boardService.increaseBoardLikes(boardNo); 
		redirectAttributes.addAttribute("no", boardNo); // 리다이렉트에 쿼리스트링을 직접쓰지않고 'redirectAttributes'를 사용해서 보낼 수 있다.
		// 쿼리스트링으로 보내야 할 값이 많을경우 아래와 같이 값을 담아서 보내면 된다.
		//redirectAttributes.addAttribute("pageNo", 38);
		//redirectAttributes.addAttribute("row", 10);
		//redirectAttributes.addAttribute("opt", title);
		//redirectAttributes.addAttribute("keyword", java);
		return "redirect:detail.do"; // insert, update, delete 작업 후에는 재요청 url을 보낸다.
	}
	
	@RequestMapping("/detail.do")
	public String detailBoard(@RequestParam("no") long boardNo, Model model) {
		model.addAttribute("board", boardService.getBoardDetail(boardNo)); // View로 보내줄때는 model에 담아서 보낸다.
		return "board/detail";
	}
}






















