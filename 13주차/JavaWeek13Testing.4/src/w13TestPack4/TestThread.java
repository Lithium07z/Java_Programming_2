package w13TestPack4;

public class TestThread {
	public static void main(String[] args) {
		Runnable t1 = () -> {
			for (int cnt = 0; cnt < 10; cnt++) {
				System.out.print("lamda" + cnt);
				try {
					Thread.sleep(500); // InterruptedException 예외처리가 반드시 있어야 함
				} catch (InterruptedException e) {
				}
			}
		};
		new Thread(t1).start();
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
	}
}
