package w12TestPack7;

public class Student implements Comparable<Student>{
	private int sNum;
	private int lNum;
	private int eNum;
	private int mNum;
	Student(int sNum, int lNum, int eNum, int mNum) {
		this.sNum = sNum; this.lNum = lNum; this.eNum = eNum; this.mNum = mNum;
	}
	
	int getSNum() {
		return this.sNum;
	}
	int getLNum() {
		return this.lNum;
	}
	int getENum() {
		return this.eNum;
	}
	int getMNum() {
		return this.mNum;
	}
	
	void setSNum(int sNum) {
		this.sNum = sNum;
	}
	void setLNum(int lNum) {
		this.lNum = lNum;
	}
	void setENum(int eNum) {
		this.eNum = eNum;
	}
	void setMNum(int mNum) {
		this.mNum = mNum;
	}
	 
	public String toString() {
		return "    " + sNum + "   " + lNum + "   " + eNum + "   " + mNum + "   " +
				(lNum + eNum + mNum) + "  " + ((lNum + eNum + mNum)/3);
	}

	@Override
	public int compareTo(Student s) {
		return this.getSNum() - s.getSNum();
	}
}
