package w13TestPack20;

class Producer implements Runnable {
	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for (int i = 1; i < 5; i++) {
			buffer.put(i); 
			System.out.println("�۽���: " + i + " ��° �޽����� �۽��Ͽ����ϴ�.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
