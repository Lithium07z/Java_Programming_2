package week10TestingPackage2;

import java.util.Calendar;
public class CalendarTest {
   public static void main(String[] args) {
       Calendar now = Calendar.getInstance();     //Calendar 객체 생성
       System.out.println(now.getTime());
       int year = now.get(Calendar.YEAR);            //년
       int month = now.get(Calendar.MONTH) + 1;   //월 시작이 0
       int date = now.get(Calendar.DATE);           //일
       int hour = now.get(Calendar.HOUR_OF_DAY);   //시
       int minute = now.get(Calendar.MINUTE);      //분
       int second = now.get(Calendar.SECOND);     //초
       System.out.println(year + "년 " + month + "월 " + date + "일");
       System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}