package w13TestPack21;

public class NumThread implements Runnable{
	private Buffer buffer;
	private int num1;
	private int num2;
	NumThread(int num2, int num1, Buffer buffer) {
		this.num2 = num2; this.num1 = num1; this.buffer = buffer;
	}
 	public void run() {
 		buffer.get();
		for (int i = 0; i < num1; i++) {
			System.out.print(num2);
		}
	}
}
