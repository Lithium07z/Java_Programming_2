/*���α׷� �ۼ�����: 2019.09.28
 *���α׷� ����: ������ �ﰢ��, ��ٸ��� ���� �� ����ڰ� ������ ������ ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.09.29 PM 06.38
 */
import java.util.Scanner;

public class TestDraw {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ShapeDraw sd;
		
		int check = 0;
		int line = 0;
		char shape;
		System.out.print("1. Rectangle 2. Triangle 3. Ladder 4. Finish\n�޴��� �Է��ϼ��� : ");
		check = input.nextInt();
		if (check == 1) {
			System.out.print("��ũ�⸦ �Է��ϼ��� : ");
			line = input.nextInt();
			System.out.print("���ڸ� �Է��ϼ��� : ");
			shape = input.next().charAt(0);
			sd = new Rectangle(); // RectangleŸ���� sdŬ������ ����
			sd.draw(line, shape); // �����ǵ� draw�޼ҵ�� ���� ����
		} else if (check == 2) {
			System.out.print("��ũ�⸦ �Է��ϼ��� : ");
			line = input.nextInt();
			System.out.print("���ڸ� �Է��ϼ��� : ");
			shape = input.next().charAt(0);
			sd = new Triangle(); // TriangleŸ���� sdŬ������ ����
			sd.draw(line, shape); // �����ǵ� draw�޼ҵ�� ���� ����
		} else if (check == 3) {
			System.out.print("��ũ�⸦ �Է��ϼ��� : ");
			line = input.nextInt();
			System.out.print("���ڸ� �Է��ϼ��� : ");
			shape = input.next().charAt(0);
			sd = new Ladder(); // LadderŸ���� sdŬ������ ����
			sd.draw(line, shape); // �����ǵ� draw�޼ҵ�� ���� ����
		} else if (check == 4) {
			System.out.println("�ý����� �����մϴ�.");
			System.exit(0);
		}else {
			System.out.println("�ش� ��ȣ�� ����� �������� �ʽ��ϴ�. ");
		}
	}
}
