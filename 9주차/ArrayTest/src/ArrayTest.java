//람다식을 위한 함수인터페이스 임을 나타내는 anotation
@FunctionalInterface  
interface Func1{
     int calc(int a, int b); 
}

@FunctionalInterface  
interface Func2{
    void sayHello();
}

public class ArrayTest {
    public static void main(String[] args) {
	Func1 sub = (a, b) -> a - b;   //Func1 인터페이스의 추상메소드를 람다식으로 재정의
	Func1 add2 = (int a, int b) -> { return a + b; };  //
	Func2 hello = () -> System.out.println("Hello Lambda!"); 
	// or {System.out.println("Hello Lambda!"); }
	int result = sub.calc(3,4)+add2.calc(5,2);	
	System.out.println("result = " + result);
	hello.sayHello();
    }
}