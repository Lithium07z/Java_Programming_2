package week11TestingPackage8;

import java.util.Calendar;

public class Customer {
	private String name;  //ȸ����
	private String cnum;  //id
	private int year, month; //���Գ��
	public Customer(String name, String cnum) {
		this.name = name;
		this.cnum = cnum;
		dateCreat();
	}
	void dateCreat() {
	   Calendar now = Calendar.getInstance();     //Calendar ��ü ����
	    year = now.get(Calendar.YEAR);           //��
	    month = now.get(Calendar.MONTH) + 1;   //�� ������ 0
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