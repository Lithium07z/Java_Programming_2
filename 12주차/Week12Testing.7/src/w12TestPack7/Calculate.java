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
			System.out.println("�ߴ��Ϸ��� ������ �Է��ϼ��� ");
			System.out.print("�л���ȣ : ");
			sNum = input.nextInt();
			if (sNum < 0) {
				break;
			}
			System.out.print("�������� : ");
			lNum = input.nextInt();
			if (lNum < 0) {
				break;
			}
			System.out.print("�������� : ");
			eNum = input.nextInt();
			if (eNum < 0) {
				break;
			}
			System.out.print("�������� : ");
			mNum = input.nextInt();
			if (mNum < 0) {
				break;
			}
			list.add(cNum, new Student(sNum, lNum, eNum, mNum));
			cNum += 1;
		}
	}
	
	void sortList() {
		System.out.println("     ��ȣ    ����    ����    ����    ����    ���");
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		for (int j = 0; j < list.size(); j++) {
			tLNum += list.get(j).getLNum();
			tENum += list.get(j).getENum();
			tMNum += list.get(j).getMNum();
		}
		System.out.println("�����հ� : " + tLNum + "  " + tENum + "  " + tMNum);
		System.out.print("������� : " + tLNum / list.size() + "   " + tENum / list.size() + "   "+ tMNum / list.size());
	}	
}
