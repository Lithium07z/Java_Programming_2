/*���α׷� �ۼ�����: 2019.12.03
 *���α׷� ����: ���� ����, �˻� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.12.04 PM 12:00
 */
package w15TestPack4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<Book> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		ObjectOutputStream out = null;
		String book;
		String cNum;
		String author;
		int check = -1;
		int menu;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"))) {
			System.out.println("===����Ʈ ���� ���===");
			list = (ArrayList<Book>) in.readObject();
			for (Book bk : list) {
				bk.disPlay();
			}
		} catch (EOFException e) { // ���Ͽ� ����� �����Ͱ� ������ EOFException ���� �߻�
			System.out.println("����� ����Ʈ�� �����ϴ�");
		}

		out = new ObjectOutputStream(new FileOutputStream("object.dat"));
		while (true) {
			System.out.print("1: ����Ʈ�� ���� 2: ���ڰ˻� 3: ���� -----> ");
			menu = input.nextInt();
			if (menu == 1) {
				System.out.print("������, ����, ������ȣ�� �Է��ϼ��� : ");
				book = input.next();
				author = input.next();
				cNum = input.next();
				list.add(new Book(book, author, cNum));
			} else if (menu == 2) {
				System.out.print("���ڸ��� �Է��ϼ��� : ");
				author = input.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getAuthor().equals(author) == true) {
						list.get(i).disPlay();
						check += 1;
					}
				}
				if (check == -1) {
					System.out.println("�ش� ���ڸ� ã�� �� �����ϴ�.");
				}
			} else if (menu == 3) {
				System.out.println("����Ʈ�� ���Ͽ� �����մϴ�.");
				out.writeObject(list);
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ش� ��ȣ�� ����� �����ϴ�.");
				break;
			}
		}
		out.close();
	}
}
