import java.util.*; 
public class SetTest { 
public static void main(String args[]) { 
 // TreeSet, LinkedHashSet 으로 변경한 후 실행결과 반드시 확인할 것
    Set<String> set = new TreeSet<>(); 
     
    set.add("Milk"); 
    set.add("Bread"); 
    set.add("Butter"); 
    set.add("Cheese"); 
    set.add("Ham");    
    set.add("Ham"); //중복된 원소는 추가되지 않음
 
    System.out.println(set); //원소들의 순서가 일청하지 않음
  } 
}
