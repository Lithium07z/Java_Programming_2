class Sugang {
	private int maxcount, count, seat;  //수강최대인원, 현재 수강신청한 인원, 잔여좌석
	private String classname;
	
	Sugang(int maxcount, String classname) {
		this(maxcount, 0, maxcount,classname);
	}
	Sugang(int maxcount, int count, int seat, String classname) {
		this.maxcount = maxcount; this.count = count; this.seat = seat; this.classname = classname;
	}
	
	int getMaxcount() {
		return this.maxcount;
	}
	int getCount() {
		return this.count;
	}
	int getSeat() {
		return this.seat;
	}
	String getClassname() {
		return this.classname;
	}
	void setCount(int count) {
		this.seat = this.seat - count; 
		this.count += count;
	}
	 
	public String toString() {
		return "과목명 : " + classname + " 수강제한 : " + maxcount + 
				" 수강인원 : " + count + " 잔여좌석 : " + seat;
	}
}