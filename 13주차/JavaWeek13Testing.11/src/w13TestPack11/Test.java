package w13TestPack11;

public class Test {
	public static void main(String[] args) {
		try {
			sub();
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("�迭 ���̰� ���� �ʽ��ϴ�.");
		}
	}

	public static void sub() throws ArrayIndexOutOfBoundsException {
			int[] array = new int[10];
			int i = array[10];
			throw new ArrayIndexOutOfBoundsException();
	}
}
