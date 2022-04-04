package w12TestPack4;

import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
public class Count {
	static Map<Integer, Integer> count() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Random random = new Random();
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
		for (int i = 0; i < 100; i++) {
			int rNum = random.nextInt(6) + 1;
			if (rNum == 1) {
				num1 += 1;
			} else if (rNum == 2) {
				num2 += 1;
			} else if (rNum == 3) {
				num3 += 1;
			} else if (rNum == 4) {
				num4 += 1;
			} else if (rNum == 5) {
				num5 += 1;
			} else if (rNum == 6) {
				num6 += 1;
			}
		}
		map.put(1, num1);
		map.put(2, num2);
		map.put(3, num3);
		map.put(4, num4);
		map.put(5, num5);
		map.put(6, num6);
		return map;
	}
	static void write(Map map) {
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		for (int j = 1; j < 7; j++) {
			System.out.println("ÁÖ»çÀ§ ´« = " + j + ", ºóµµ¼ö = " + map.get(j));
		}
	}
}
