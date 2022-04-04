package w13TestPack16;

class Job extends Thread {
	Job(String threadName) {
		System.out.println(threadName);
	}

	public void run() {
		byte n = 0;
		while (true) {
			System.out.println("" + n++);
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Thread t = new Thread(new Job("t"));
		Thread t2 = new Thread(new Job("t2"));
		t.start();
		t2.start();
	}
}
