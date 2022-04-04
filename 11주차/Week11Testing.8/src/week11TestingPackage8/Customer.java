package week11TestingPackage8;

import java.util.Calendar;

public class Customer {
	private String name;  //회원명
	private String cnum;  //id
	private int year, month; //가입년월
	public Customer(String name, String cnum) {
		this.name = name;
		this.cnum = cnum;
		dateCreat();
	}
	void dateCreat() {
	   Calendar now = Calendar.getInstance();     //Calendar 객체 생성
	    year = now.get(Calendar.YEAR);           //년
	    month = now.get(Calendar.MONTH) + 1;   //월 시작이 0
	}
	@Override
	public String toString() {
	  return "Customer [name = " + name + ", id = " + cnum + 
			  ", year = " + year + ", month = " + month + "]";
	}
	public String getCnum() {
		return cnum;
	}
}