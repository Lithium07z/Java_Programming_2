import java.util.*; 
public class SetTest { 
public static void main(String args[]) { 
 // TreeSet, LinkedHashSet ���� ������ �� ������ �ݵ�� Ȯ���� ��
    Set<String> set = new TreeSet<>(); 
     
    set.add("Milk"); 
    set.add("Bread"); 
    set.add("Butter"); 
    set.add("Cheese"); 
    set.add("Ham");    
    set.add("Ham"); //�ߺ��� ���Ҵ� �߰����� ����
 
    System.out.println(set); //���ҵ��� ������ ��û���� ����
  } 
}
