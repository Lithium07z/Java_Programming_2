package w13TestPack22;

class Producer implements Runnable {
	private Buffer buffer;
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
		    buffer.put(i);  //���ۿ� ������ ������ ���´�
		    System.out.println("������: " + i + "�� ������ �����Ͽ����ϴ�.");
		   try {
			Thread.sleep((int) (Math.random() * 100));
		         } catch (InterruptedException e) {	}
		}
	}
}
