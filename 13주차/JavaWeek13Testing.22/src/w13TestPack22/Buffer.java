package w13TestPack22;

class Buffer {
	private int data; // 생산자로부터 소비자로 전해지는 데이터
	private boolean empty = true; // 소비자가 기다리면 true, 생산자가 기다리면 false

	public synchronized int get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true; // 상태를 토글한다
		notifyAll(); // 생산자를 깨운다
		return data;
	}

	public synchronized void put(int data) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		this.data = data;
		notifyAll();
	}
}
