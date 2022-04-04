package w15TestPack4;

import java.io.*; // Serializable 구현을 위해 반드시 필요

public class Book implements Serializable {
	private String name; // 도서명
	private String author; // 저자명
	private String number; // 관리번호

	public Book(String name, String author, String number) {
		this.name = name;
		this.author = author;
		this.number = number;
	}

	String getAuthor() {
		return this.author;
	}

	public void disPlay() {

		System.out.print("도서명 : " + name);
		System.out.print("\t저자명 : " + author);
		System.out.println("\t관리번호 : " + number);

	}
}
