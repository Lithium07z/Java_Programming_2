public class Printer {
	protected String modelN;
	protected String madeC;
	protected int printing;
	protected String interF;
	Printer(String modelN, String madeC, String interF, int printing) {
		this.modelN = modelN; this.madeC = madeC; this.interF = interF; this.printing = printing; 
	}
	public void print() {
		System.out.print("Printer [�𵨸� : " + modelN + " ����ȸ��� : " + madeC + " �������̽� ���� : " +
				interF + " �μ�ż� : " + printing);
	}
} 
