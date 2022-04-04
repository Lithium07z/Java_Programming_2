package week10TestingPackage6;

public class MyArrayAlg<T> {
	public static <T> void swap(T[] a, int n1, int n2) {
		T tmp = a[n1];
		a[n1] = a[n2];
		a[n2] = tmp;
	}
	public static <T> void write(T[] a) {
		for (int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
