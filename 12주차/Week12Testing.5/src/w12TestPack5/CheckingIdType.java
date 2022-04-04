package w12TestPack5;

import java.util.Scanner;

public class CheckingIdType {
	static void inputId() {
		Scanner input = new Scanner(System.in);
		String id = null;
		char[] idCut;
		int idInt;
			while(true) {
				System.out.print(">> id를 입력하세요 _ ");
				id = input.next();
				idCut = id.toCharArray();
				idInt = idCut[0];
				try {
					if (idCut.length <= 8) {
						throw new Exception(id + "는 사용할 수 없는 아이디 입니다.\n첫 글자는 영문자 이거나 길이는 8 이상 이어야 합니다.");
					} else if (idInt < 65 || (idInt > 90 && idInt <97) || idInt > 122) {
						throw new Exception(id + "는 사용할 수 없는 아이디 입니다.\n첫 글자는 영문자 이거나 길이는 8 이상 이어야 합니다.");
					} else {
						System.out.println(id + "는 사용 가능한 아이디 입니다.");
						System.out.println("program finish");
						System.exit(0);
					}
				} catch(Exception e) {
					String msg = e.getMessage();
					System.out.println(msg);
					continue;
			}
		}
	}
}
