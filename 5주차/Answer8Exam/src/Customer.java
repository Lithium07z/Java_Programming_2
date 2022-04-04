class Customer extends Person{
	private String gubun;
	private int point;
	
	Customer(String name, int age, int point, String gubun) {
		super(name, age); this.point = point; 
		if(gubun.equals('g') || gubun.equals('G')) {
			this.gubun = "일반";
		} else if (gubun.equals('v') || gubun.equals('V')) {
			this.gubun = "우수";
		} else if (gubun.equals('s') || gubun.equals('S')) {
			this.gubun = "최우수";
		} else {
			this.gubun = "등급 미분류";
		}
	}
	
	int getPoint() {
		return this.point;
	}
	void setPoint(int point) {
		this.point = point;
	}
	void setGubun(String gubun) {
		if(gubun.equals("g") || gubun.equals("G")) {
			this.gubun = "일반";
		} else if (gubun.equals("v") || gubun.equals("V")) {
			this.gubun = "우수";
		} else if (gubun.equals("s") || gubun.equals("S")) {
			this.gubun = "최우수";
		} else {
			this.gubun = "등급 미분류";
		}
	}
	
	@Override
	void disPlay() {
		super.disPlay(); 
		System.out.println(" 구분 : " + this.gubun + " 포인트 : " + point);
	}
	
	void addPoint(int addP) {
		this.point += addP;
	}
}
