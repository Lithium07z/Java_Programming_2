public class StringExample {
      public static void main(String[] args) {
	String str1=new String("자바 프로그래밍");
	String str2="자바 프로그래밍", str3="java programming";
	System.out.println("1) charAt(4) : " + str1.charAt(4));
	System.out.println("2) equals() : " + str1.equals(str3));
	System.out.println("3) indexOf() : " + str1.indexOf("프로"));  //문자열이 포함되어 있지 않으면 -1 반환
	System.out.println("4) length() : " + str2.length());
	System.out.println("5) replace() : " + str2.replace("자바", "java"));
	System.out.println("6) substring() : " + str2.substring(3));
	System.out.println("7) substring() : " + str3.substring(5,10));
	System.out.println("8) toUpperCase() : " + str3.toUpperCase());
	System.out.println("9) trim() : " + "  blank  ".trim());
	System.out.println("10) valueOf() : " + String.valueOf(true));
     }
}