package w12TestPack8;

public class Book {
	private String number; // 관리번호
	private String title; // 제목
	private String author; // 저자
	private boolean status = false; // 대출 상태(대출 중-> true, 대출가능 -> false)
	
	Book(String number, String title, String author, boolean status) {
		this.number = number; this.title = title; this.author = author; this.status = status;
	}
	
	public String toString() {
		return "관리번호 : " + this.number + " 제목 : " + this.title + " 저자 : " + this.author + 
				" 대출 상태 : " + this.status;
	}
	
	void rentBook() {
		if (this.status == false) {
			this.status = true;
			System.out.println("대출완료");
		} else {
			System.out.println("대출 불가(대출 중)");
		}
	}

	String getNumber() {
		return this.number;
	}
	String getTitle() {
		return this.title;
	}
	String getAuthor() {
		return this.author;
	}
	String getStatus() {
		return this.getStatus();
	}
	
	void setNumber(String number) {
		this.number = number;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void setStatus(boolean status) {
		this.status = status;
	}
}
