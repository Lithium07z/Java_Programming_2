package w13TestPack5;

public class ArrayTryCatch {
	public static void main(String[] args) {
		double[] d = new double[10];
		try {
			for (int i = 0; i < 15; i++) {
				d[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException  arrayEx) {
			System.out.println("�迭�� ũ�⸦ ������ϴ�.");
		}
	}
}
