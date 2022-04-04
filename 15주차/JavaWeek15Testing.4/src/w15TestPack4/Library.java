/*프로그램 작성일자: 2019.12.03
 *프로그램 설명: 도서 저장, 검색 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.12.04 PM 12:00
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
			System.out.println("===리스트 원소 출력===");
			list = (ArrayList<Book>) in.readObject();
			for (Book bk : list) {
				bk.disPlay();
			}
		} catch (EOFException e) { // 파일에 저장된 데이터가 없으면 EOFException 예외 발생
			System.out.println("저장된 리스트가 없습니다");
		}

		out = new ObjectOutputStream(new FileOutputStream("object.dat"));
		while (true) {
			System.out.print("1: 리스트에 저장 2: 저자검색 3: 종료 -----> ");
			menu = input.nextInt();
			if (menu == 1) {
				System.out.print("도서명, 저자, 관리번호를 입력하세요 : ");
				book = input.next();
				author = input.next();
				cNum = input.next();
				list.add(new Book(book, author, cNum));
			} else if (menu == 2) {
				System.out.print("저자명을 입력하세요 : ");
				author = input.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getAuthor().equals(author) == true) {
						list.get(i).disPlay();
						check += 1;
					}
				}
				if (check == -1) {
					System.out.println("해당 저자를 찾을 수 없습니다.");
				}
			} else if (menu == 3) {
				System.out.println("리스트를 파일에 저장합니다.");
				out.writeObject(list);
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("해당 번호는 기능이 없습니다.");
				break;
			}
		}
		out.close();
	}
}
