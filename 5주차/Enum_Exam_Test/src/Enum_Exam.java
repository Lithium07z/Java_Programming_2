import java.util.Calendar;

enum Week { 일요일, 월요일,화요일, 수요일, 목요일, 금요일, 토요일}
 public class Enum_Exam {
    public static void main(String[] args) {
	Week[] days=Week.values();  //열거 객체를 배열로 반환
	Week tomorrow=null;      //열거형 변수 선언과 초기화
	Calendar cr = Calendar.getInstance();
	int week = cr.get(Calendar.DAY_OF_WEEK); //일(1) ~토(7)까지 숫자 리턴
	String today = days[week].name(); //열거 객체의 문자열 반환
	System.out.println("오늘은 " + today + " 입니다");
   	tomorrow = Week.valueOf(today);  //주어진 문자열의 열거 객체로 반환
   	if(tomorrow == Week.토요일 || tomorrow == Week.일요일)
  		 System.out.println("주말입니다");
   	else
   		System.out.println("평일 입니다");
   	System.out.println(tomorrow.ordinal());  //열거 객체의 순번 반환
        }
}