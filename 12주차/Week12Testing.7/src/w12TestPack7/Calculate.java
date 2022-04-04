package w12TestPack7;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Calculate{
	Scanner input = new Scanner(System.in);
	List<Student> list = new ArrayList<Student>();
	int sNum;
	int lNum;
	int eNum;
	int mNum;
	int cNum;
	int tLNum;
	int tENum;
	int tMNum;
	
	void saveScore() {
		while(true) {
			System.out.println("중단하려면 음수를 입력하세요 ");
			System.out.print("학생번호 : ");
			sNum = input.nextInt();
			if (sNum < 0) {
				break;
			}
			System.out.print("국어점수 : ");
			lNum = input.nextInt();
			if (lNum < 0) {
				break;
			}
			System.out.print("영어점수 : ");
			eNum = input.nextInt();
			if (eNum < 0) {
				break;
			}
			System.out.print("수학점수 : ");
			mNum = input.nextInt();
			if (mNum < 0) {
				break;
			}
			list.add(cNum, new Student(sNum, lNum, eNum, mNum));
			cNum += 1;
		}
	}
	
	void sortList() {
		System.out.println("     번호    국어    영어    수학    총점    평균");
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		for (int j = 0; j < list.size(); j++) {
			tLNum += list.get(j).getLNum();
			tENum += list.get(j).getENum();
			tMNum += list.get(j).getMNum();
		}
		System.out.println("과목합계 : " + tLNum + "  " + tENum + "  " + tMNum);
		System.out.print("과목평균 : " + tLNum / list.size() + "   " + tENum / list.size() + "   "+ tMNum / list.size());
	}	
}
