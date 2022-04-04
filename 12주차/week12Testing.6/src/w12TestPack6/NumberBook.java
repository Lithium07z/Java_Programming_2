/*프로그램 작성일자: 2019.11.14
 *프로그램 설명: HashMap을 이용해  간단한 주소록을 처리하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.14 PM 09:03
 */
package w12TestPack6;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class NumberBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Person> person = new HashMap<String, Person>();
		person.put("Lithium", new Person("김준호", "010-0000-0000"));
		person.put("SoftWare", new Person("김지호", "010-1111-1111"));
		person.put("Computer", new Person("김광호", "010-2222-2222"));
		String id;
		
		while(true) {
			System.out.print("id를 입력하세요 : ");
			id = input.next();
			if (person.containsKey(id) == true) {
				System.out.println(person.get(id));
				break;
			} else {
				System.out.println("해당 id는 존재하지 않습니다.");
				continue;
			}
		}
		Set<Map.Entry<String, Person>> set = person.entrySet();
		for (Entry<String, Person> et : set) {
			System.out.println(et);
		}
	}
}
