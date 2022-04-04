/*프로그램 작성일자: 2019.09.19
 *프로그램 설명: 통학 거리가 가장 긴 학생과 짧은 학생, 그리고 거리 차이를 계산하여 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.09.19 
 */
import java.util.Scanner;

public class DistanceTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Distance[] dist;   
		Distance longdist = null, shortdist = null;
		
		System.out.println(">> 생성하고자 하는 객체의 수를 입력하세요 : ");
		int cnt = in.nextInt();
		dist = new Distance[cnt]; 
		
		for(int i = 0; i < cnt; i++){
			System.out.println(">> 이름과 통학거리를 입력하세요 : ");
			dist[i] = new Distance(in.next(), in.nextInt()); 
		}
			
			int minus = DistanceComp.longdistance(dist).getDist()-DistanceComp.shortdistance(dist).getDist(); 
			
			System.out.println("통학거리가 가장 긴 학생 : "+DistanceComp.longdistance(dist).getName()+", 통학거리 : " +DistanceComp.longdistance(dist).getDist() );
			System.out.println("통학거리가 가장 짧은 학생 : "+DistanceComp.shortdistance(dist).getName()+", 통학거리 : " +DistanceComp.shortdistance(dist).getDist() );
			System.out.println("거리차이 : "+ minus);
	}
}
	
class Distance{
	private String name;  
	private int dist;        
	
	Distance(String name, int dist) {
		this.name = name; this.dist = dist;
	}
	String getName() { 
		return this.name;
	}
	int getDist() { 
		return this.dist;
	}
	void setName(String name) { 
		this.name = name;
	}
	void setDist(int dist) { 
		this.dist = dist;
	}
	public String toString() { 
		return name + dist;
	}
}

class DistanceComp{
	static Distance longdistance(Distance[] dist) {
		int max = dist[0].getDist();
		int maxdist = 0;
			for (int i = 0; i < dist.length; i++) {
				if (max < dist[i].getDist()) { 
					max = dist[i].getDist(); 
					maxdist = i; 
				}
			}
		return dist[maxdist]; 
	}
	static Distance shortdistance(Distance[] dist) {
		int mini = dist[0].getDist();
		int minidist = 0;
			for(int j = 0; j < dist.length; j++) {
				if (mini > dist[j].getDist()) { 
					mini = dist[j].getDist(); 
					minidist = j; 
				}
			}
		return dist[minidist]; 
	}
}