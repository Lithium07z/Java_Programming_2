/*���α׷� �ۼ�����: 2019.10.10
 *���α׷� ����: ������ �������̽��� �����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.10 AM 11:52
 */
public class Answer2 {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

interface DataAccessObject { // �������̽� DataAccessObject
	 void select(); // �߻� �޼ҵ� select 
	 void insert(); // �߻� �޼ҵ� insert
	 void update(); // �߻� �޼ҵ� update
	 void delete(); // �߻� �޼ҵ� delete 
}
