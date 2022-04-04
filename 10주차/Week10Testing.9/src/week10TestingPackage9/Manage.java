package week10TestingPackage9;


import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;
import java.util.StringTokenizer;
public class Manage {
	
	public <T> void splitString(T[] str, String num) {
		StringTokenizer stk = new StringTokenizer(num, "-");
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + stk.nextToken());
			if (i == 2 ) {
				System.out.print(" " + stk.nextToken());
			}
			System.out.println();
		}
	}
	
	public void dateWrite() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);           
	    int month = now.get(Calendar.MONTH) + 1;   
	    int date = now.get(Calendar.DATE);   
	    System.out.println(year + "년 " + month + "월 " + date + "일");
	}
	
	public void startChar() {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int rNum = 0;
		
		randomLoop:
		for (int j = 0; j < 3; j++) {
			while (rNum < 65 || rNum > 90) {
				rNum = random.nextInt(100);
			}
			if (rNum >= 65 && rNum <= 90) {
				System.out.print((char)rNum + "로 시작하는 단어 >>");
				char iWord = input.next().charAt(0);
				if (iWord == (char)rNum || iWord == (char)(rNum+32)){
					rNum = 0;
					continue randomLoop;
				} else {
					rNum = 0;
					j -= 1;
					System.out.println("틀렸습니다. ");
					continue randomLoop;
				}
			}
		}
	}
	
	public int calChar(String cal) {
		StringTokenizer stk2 = new StringTokenizer(cal, "+-*");
		int[] cArr = new int [stk2.countTokens()];
		int i = 0;
		while(stk2.hasMoreTokens()) {
			cArr[i] = Integer.parseInt(stk2.nextToken().trim());
			i += 1;
		}
		return ((cArr[0] + cArr[1] - cArr[2]) * cArr[3]);
	}
}
