public class Printer {
	protected String modelN;
	protected String madeC;
	protected int printing;
	protected String interF;
	Printer(String modelN, String madeC, String interF, int printing) {
		this.modelN = modelN; this.madeC = madeC; this.interF = interF; this.printing = printing; 
	}
	public void print() {
		System.out.print("Printer [모델명 : " + modelN + " 제조회사명 : " + madeC + " 인터페이스 종류 : " +
				interF + " 인쇄매수 : " + printing);
	}
} 
