package w15TestPack4;

import java.io.*; // Serializable ������ ���� �ݵ�� �ʿ�

public class Book implements Serializable {
	private String name; // ������
	private String author; // ���ڸ�
	private String number; // ������ȣ

	public Book(String name, String author, String number) {
		this.name = name;
		this.author = author;
		this.number = number;
	}

	String getAuthor() {
		return this.author;
	}

	public void disPlay() {

		System.out.print("������ : " + name);
		System.out.print("\t���ڸ� : " + author);
		System.out.println("\t������ȣ : " + number);

	}
}
