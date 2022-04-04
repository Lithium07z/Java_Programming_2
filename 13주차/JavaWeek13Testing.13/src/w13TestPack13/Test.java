package w13TestPack13;

class Test implements Runnable {
	public static void main(String args[]) {
		Test test = new Test();
		Thread t1 = new Thread(test);
		t1.start();
	}

	public void run() {
	}
}
