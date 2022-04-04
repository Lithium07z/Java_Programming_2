package w13TestPack1;

class MultithreadExample1 {
    public static void main(String args[]) {
        Thread thread = new DigitThread();     // 스레드 생성   
           thread.start();                          // 스레드를 시작
        for (char ch = 'A'; ch <= 'Z'; ch++) 
            System.out.print(ch);
  }
}
class DigitThread extends Thread {
    public void run() {
        for (int cnt = 0; cnt < 10; cnt++) 
            System.out.print(cnt); }}
