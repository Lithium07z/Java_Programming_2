package w12TestPack8;

public class Book {
	private String number; // ������ȣ
	private String title; // ����
	private String author; // ����
	private boolean status = false; // ���� ����(���� ��-> true, ���Ⱑ�� -> false)
	
	Book(String number, String title, String author, boolean status) {
		this.number = number; this.title = title; this.author = author; this.status = status;
	}
	
	public String toString() {
		return "������ȣ : " + this.number + " ���� : " + this.title + " ���� : " + this.author + 
				" ���� ���� : " + this.status;
	}
	
	void rentBook() {
		if (this.status == false) {
			this.status = true;
			System.out.println("����Ϸ�");
		} else {
			System.out.println("���� �Ұ�(���� ��)");
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
