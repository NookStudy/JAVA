/*
 * 다형성(Polymorphism)
 * 하나의 객체를 여러 타입의 참조변수로.
 * 
 * -Super 참조변수로 sub 객체를 참조
 * 1. 부모타입의 참조변수는 부모가 상속한 멤버까지만 접근가능
 * 2. 자식에서 오버라이딩한 메서드가 먼저 호출
 * 3. 자식에서 새롭게 정의된 멤버는 접근불가.
 * 4. 이결우 이질화(Heterogeneous)라고 함
 * 
 * - 같은 타입의 참조변수로 객체를 참조
 * 1. 객체 전체 접근 가능. 일반적인경우이다.
 * 2. 동질화(Homogeneous)라고 함.
 */


abstract class Calc{
	int a=5;
	int b=6;
	
	abstract void plus();
}

class MyCalc extends Calc{
	//plus- 오버라이딩으로 재정의
	@Override
	void plus() {System.out.println(a+b);}
	//minus - 새로운 구상메소드
	void minus() {System.out.println(a-b);}
}

public class Ex01_Polymorphism1
{
	public static void main(String[] agrs)
	{
		//동질화 : 자신의 참조변수로 자신의 객체를 참조.
		MyCalc myCalc1 = new MyCalc();
		//객체의 모든 참조변수에 접근가능.
		myCalc1.plus();
		myCalc1.minus();
		
		//하위클래스 객체를 상위클래스 타입으로 형변환 
		//업 캐스팅(Super클래스로 sub생성자)
		//Calc(Super의 클래스)로 정의한 myCalc2
		Calc myCalc2= new MyCalc();
		myCalc2.plus();
		//다음 메서드는 설계도에 없다. 사용불가.
		//myCalc2.minus();
		
		//Super클래스의 myCalc2를 sub클래스로 강제타입변환.
		//다운캐스팅
		((MyCalc)myCalc2).minus();
	}
}
