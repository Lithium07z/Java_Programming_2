package w13TestPack2;

public class MultithreadExample1 {
	public static void main(String args[]) {
		Thread thread = new Thread( () -> {
			for (int cnt = 0; cnt < 10; cnt++)
				System.out.print(cnt);       //���ٽ� ���
		});
		thread.start(); // �����带 ����
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
	}
}
