package w13TestPack20;

class Buffer {
	private int data; // 송신자로부터 수신자로 전해지는 데이터
	private boolean empty = true; // 수신자가 기다리면 true, 송신자가 기다리면 false

	public synchronized int get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true; // 상태를 토글한다
		notifyAll(); // 송신자를 깨운다
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