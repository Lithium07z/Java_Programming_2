public class MySqlDao implements DataAccessObject{
	public void select() {
		System.out.println("MySqlDao DB에서 검색");
	};
	public void insert() {
		System.out.println("MySqlDao DB에 삽입");
	};
	public void update() {
		System.out.println("MySqlDao DB를 수정");
	};
	public void delete() {
		System.out.println("MySqlDao DB에서 삭제");
	};
}
