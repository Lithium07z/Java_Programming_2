class Word {
	private String eng; 
	private String kor; 

     Word(String eng, String kor) {
    	 this.eng = eng; this.kor = kor;
     }
     String getEng() {
    	 return eng;
     }
     String getKor() {
    	 return kor;
     }
     public String toString() {
    	 return "Word [eng = " + eng + ", kor = "+ kor + "]";
     }	
}