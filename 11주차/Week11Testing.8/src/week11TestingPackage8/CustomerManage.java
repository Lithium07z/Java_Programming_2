package week11TestingPackage8;

import java.util.LinkedList;

class CustomerManage {
	static LinkedList<Customer> list = new LinkedList<>();
		static void saveCustomer(Customer cst) {
			list.add(cst);
		}
		static void printList() {
			System.out.println(list);
		}
		static boolean findID(String id) {
			boolean check = false;
			for(int i = 0; i < list.size(); i++) {
				if (list.get(i).getCnum().equals(id) == true) {
					list.remove(i);
					check = true;
				}
			}
			return check;
		}
}