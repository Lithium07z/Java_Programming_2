package w13TestPack22;

class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer drop) {
		this.buffer = drop;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = buffer.get(); // 버퍼에서 케익을 가져 온다
			System.out.println("소비자: " + data + "번 케익을 소비하였습니다.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}