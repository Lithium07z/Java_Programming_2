package w13TestPack7;

public class NumberArrayForm {
	public static void main(String[] args) {
		try {
			int[] array=new int[-10];
			System.out.println("try");
			}
			catch (NumberFormatException e){ 
			System.out.println("���� ���� ����"); 
			}
			catch (NegativeArraySizeException e){ 
			System.out.println("�迭 ũ�� ���� ����"); 
			} 
			catch (Exception e){ 
			System.out.println("����"); 
			} 

	}
}
