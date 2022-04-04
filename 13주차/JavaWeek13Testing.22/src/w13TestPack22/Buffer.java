package w13TestPack22;

class Buffer {
	private int data; // �����ڷκ��� �Һ��ڷ� �������� ������
	private boolean empty = true; // �Һ��ڰ� ��ٸ��� true, �����ڰ� ��ٸ��� false

	public synchronized int get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true; // ���¸� ����Ѵ�
		notifyAll(); // �����ڸ� �����
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
