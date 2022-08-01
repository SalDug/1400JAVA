package Ch21Collection;

import java.util.ArrayList;
import java.util.List;

class BoardDTO{
	private int no;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + "]";
	}
	public BoardDTO(int no, String title, String content, String writer, String regdate) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof BoardDTO) {
			BoardDTO down = (BoardDTO)obj;
			
			return this.no == down.no;
		}
		return false;
	}
	
	
}

public class C02ArrayListMain {
	
	public static void addDTO(List<BoardDTO> list, BoardDTO DTO) {
		list.add(DTO);
	}
	public static void showInfo(List<BoardDTO> list) {
		for(BoardDTO DTO : list) {
			System.out.println(DTO.toString());
		}
	}

	public static void main(String[] args) {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		addDTO(list, new BoardDTO(1, "제목1", "내용1", "작성자1", "2022-08-01"));
		addDTO(list, new BoardDTO(2, "제목2", "내용2", "작성자2", "2022-08-01"));
		addDTO(list, new BoardDTO(3, "제목3", "내용3", "작성자3", "2022-08-01"));
		addDTO(list, new BoardDTO(4, "제목4", "내용4", "작성자4", "2022-08-01"));
		
		BoardDTO search =  new BoardDTO(2, "제목2", "내용2", "작성자2", "2022-08-01");
		
		if(list.contains(search)) {
			System.out.println("존재합니다");
		}else {
			System.out.println("존재안합니다");
		}
		
		showInfo(list);
//		BoardDTO a = new BoardDTO(1, "h", "a", "l", "o");
//		list.add(a);
//		for(int i = 0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
	}

}
