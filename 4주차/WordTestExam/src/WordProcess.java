class WordProcess {
	static Word str[];
	WordProcess(Word str[]) {
		this.str = str;
	}
	
	static String search(String eng) {
		for (int i = 0; i < str.length; i++) {
			if((str[i].getEng().equals(eng)) == true) { // 객체 배열의 영단어와 입력받은 영단어가 같으면
				return str[i].getKor(); // 한글 뜻 반환 
			}
		}
		return "해당 단어가 없습니다.";
	}
	static void search(char wrd) {
		int check = -1;
		System.out.println(wrd + "로 시작하는 단어를 출력합니다.");
		for (int j = 0; j < str.length; j++) {
			if(str[j].getEng().charAt(0) == wrd) { // 객체 배열의 영단어 중 입력받은 영단어와 첫 스펠링이 같으면
				 System.out.println(str[j].toString()); // 영단어 정보 출력 
				 check += 1;
			}
		}
		if (check == -1) {
			System.out.println("해당 단어가 없습니다.");
		}
	}
}