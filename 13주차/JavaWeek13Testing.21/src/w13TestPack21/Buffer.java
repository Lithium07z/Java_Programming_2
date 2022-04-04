package w13TestPack21;

class Buffer {
	private boolean empty = true; // �����ڰ� ��ٸ��� true, �۽��ڰ� ��ٸ��� false

	public synchronized void get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true; // ���¸� ����Ѵ�
		notifyAll(); // �۽��ڸ� �����
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
