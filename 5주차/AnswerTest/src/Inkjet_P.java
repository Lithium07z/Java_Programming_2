public class Inkjet_P extends Printer {
	private int ink;
	Inkjet_P(String modelN, String madeC, String interF, int printing, int ink) {
		super(modelN, madeC, interF , printing); this.ink = ink;
	}
	int inkdec(int printI) {
		if (this.ink - printI <= 0) {
			return 0;
		} else {
			this.ink = this.ink - printI;
			return 1;
		}
	}
	public void print() {
		super.print();
		System.out.print(" À×Å© ÀÜ·® : " + ink + "]\n");
	}
}
