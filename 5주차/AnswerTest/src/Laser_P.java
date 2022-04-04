public class Laser_P extends Printer {
	private int toner;
	Laser_P(String modelN, String madeC, String interF, int printing, int toner) {
		super(modelN, madeC, interF, printing); this.toner = toner;
	}
	int inkdec(int printI) {
		if (this.toner - printI <= 0) {
			return 0;
		} else {
			this.toner = this.toner - printI;
			return 1;
		}
	}
	public void print() {
		super.print();
		System.out.print("Åä³Ê ÀÜ·® : " + toner + "]\n");
	}
}
