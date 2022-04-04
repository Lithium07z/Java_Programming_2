import java.util.*;
public class HashSetTest {
	public static void main(String args[]) { 
			Set<String> s = new HashSet<String>();
			String[] sample = { "단어", "중복", "구절", "중복" };
			for (String a : sample)
				//중복되는 단어는 저장되지 않으며 false 반환
				if (!s.add(a))  
					System.out.println("중복된 단어==> " + a);
					System.out.println("HashSet에 저장된 단어 개수 : " + s.size());
					System.out.println("중복되지 않은 단어: " + s);
	} 
}
