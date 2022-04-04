package w13TestPack21;

class Buffer {
	private boolean empty = true; // 수신자가 기다리면 true, 송신자가 기다리면 false

	public synchronized void get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true; // 상태를 토글한다
		notifyAll(); // 송신자를 깨운다
	}

	public synchronized void put() {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		notifyAll();
	}
}
