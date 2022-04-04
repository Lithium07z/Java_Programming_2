package w13TestPack20;

class Buffer {
	private int data; // �۽��ڷκ��� �����ڷ� �������� ������
	private boolean empty = true; // �����ڰ� ��ٸ��� true, �۽��ڰ� ��ٸ��� false

	public synchronized int get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true; // ���¸� ����Ѵ�
		notifyAll(); // �۽��ڸ� �����
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