package w13TestPack21;

public class CharThread implements Runnable{
	private Buffer buffer;
	private char[] cymbol;
	private int num1;
	CharThread(char[] cymbol, int num1, Buffer buffer) {
		this.cymbol = cymbol; this.num1 = num1; this.buffer = buffer;
	}
 	public void run() {
 		buffer.put();
 		for (int i = 0; i < this.num1; i++) {
 			for (char pCymbol : cymbol) {
 				System.out.print(pCymbol);
 			}
 		}
	}
}
