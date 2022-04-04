/*프로그램 작성일자: 2019.10.10
 *프로그램 설명: 각각의 인터페이스를 구현하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.10 AM 11:52
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

interface DataAccessObject { // 인퍼페이스 DataAccessObject
	 void select(); // 추상 메소드 select 
	 void insert(); // 추상 메소드 insert
	 void update(); // 추상 메소드 update
	 void delete(); // 추상 메소드 delete 
}
