package w13TestPack20;

class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer drop) {
		this.buffer = drop;
	}
	
	public void run() {
		String[] str = new String[] {"thread", "signal send","network", "synchronizaion"};
		for (int i = 1; i < 5; i++) {
			int data = buffer.get(); 
			System.out.println("������: " + data + " ��° " + str[i-1] + " �޽����� �����Ͽ����ϴ�.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}