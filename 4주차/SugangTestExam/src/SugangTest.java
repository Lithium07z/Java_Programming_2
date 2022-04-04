/*프로그램 작성일자: 2019.09.22
 *프로그램 설명: 수강신청을 처리하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.09.22
 */
import java.util.Scanner;

public class SugangTest {
	public static void main(String[] args) {
		Sugang[] sugang= {new Sugang(28, "web"),  new Sugang(25, "java"),  new Sugang(35, "python"),  
						new Sugang(30, "script")};
		Scanner in = new Scanner(System.in);
		
		int check = 0; // 번호 저장용 변수
		int equals = -1; // 과목명이 같은지 확인하는 변수 
		String classname;
		while (check != 3) {
			System.out.print("1. 신청하기 2. 출력하기 3. 종료하기 :");
        	check = in.nextInt();
        	equals = -1;
        	
        	if (check == 1) { 
        		System.out.print("과목명을 입력하세요 : ");
        		classname = in.next();
        		for (int i = 0; i < sugang.length; i++) {
        				if (classname.equals(sugang[i].getClassname()) == true && sugang[i].getSeat() != 0) {
        						sugang[i].setCount(1); // 잔여 좌석을 한 자리 뺌
        						System.out.println("수강완료\n");
        						equals += 1;
        				}
        				else if (classname.equals(sugang[i].getClassname()) == true && sugang[i].getSeat() == 0){
        						System.out.println("잔여 좌석이 없습니다.\n");
        						equals += 1;
        				}
        		}
        		if (equals == -1) {
        			System.out.println("일치하는 과목이 없습니다.\n");
        		}
        	} else if (check == 2) {
        		for (int j = 0; j <sugang.length; j++) {
        			System.out.print(sugang[j].toString() + "\n");
        		}
        		System.out.println();
        	} else if (check == 3) {
        		System.out.println("프로그램을 종료합니다.");
        	} else {
        		System.out.println("해당 번호의 기능은 없습니다.\n");
        	}
		}
	}
}