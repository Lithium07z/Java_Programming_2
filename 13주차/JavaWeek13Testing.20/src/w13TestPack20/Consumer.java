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
			System.out.println("수신자: " + data + " 번째 " + str[i-1] + " 메시지를 수신하였습니다.");
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}