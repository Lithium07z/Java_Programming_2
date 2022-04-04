public class MemberServiceTest {
	public static void main(String[] args) {
		   MemberService ms = new MemberService();
		   ms.login("hong", 12345); // login 메소드로 id와 비밀번호 전달 
		   ms.logout("hong");
	}
}

class MemberService{
        boolean login(String id, int password) {
    	if (id.equals("hong") && password == 12345) { // 문자열의 비교이므로 equals메소드 사용
    		System.out.println("로그인 되었습니다.");
    		return true; // 일치하는 경우 true 리턴 
    	}
    	return false; // 나머지 모든 경우 false 리턴 
    }
    void logout(String id) {
    	System.out.println(id + ": 로그아웃 되었습니다.");
    }
}
