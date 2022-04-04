package w13TestPack5;

public class ArrayTryCatch {
	public static void main(String[] args) {
		double[] d = new double[10];
		try {
			for (int i = 0; i < 15; i++) {
				d[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException  arrayEx) {
			System.out.println("배열의 크기를 벗어났습니다.");
		}
	}
}
