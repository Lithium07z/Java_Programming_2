/*���α׷� �ۼ�����: 2019.10.31
 *���α׷� ����: ���ù��� 5���� ���ʸ� Ŭ������ ���� �� ����
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.31 AM 11:54
 */
package week10TestingPackage6;

public class MyArrayAlgTest {
	public static void main(String[] args) {
		String[] language = { "C++", "C#", "JAVA" };
		Integer[] integer= {4,2,7,30,55,21};
		MyArrayAlg<String> str = new MyArrayAlg<>();
		MyArrayAlg<Integer> digit = new MyArrayAlg<>();
		str.swap(language, 0,2);
		str.write(language);
		digit.swap(integer, 2, 4);
		digit.write(integer);
	}
}
