/*
 * 추상클래스
 * - 상속을 목적으로 제작.
 * - 객체생성 불가
 * - 변수는 다 불러올수 있음.
 */
//추상메소드를 멤버로 포함한 클래스는 반드시 abstract로 선언.
abstract class Unit
{
	abstract void doMove();
}
//일반 클래스
//class Unit
//{
//	void doMove();
//}

class Marine extends Unit
{
	//추상클래스 상속 시 추상메서드도 그대로 상속.
	//밑처럼 오버라이딩 하지 않으면 이 클래스도 객체생성 불가능.
//	@override
	void doMove()
	{
		System.out.println("마린은 두 발로 이동합니다.");

	}
}

class Zergling extends Unit
{
	void doMove()
	{
		System.out.println("저글링은 네 발로 이동합니다.");
	}
}

public class MyStarcraft
{

	public static void main(String[] args)
	{
//		Unit unit= new Unit();
		//불가능.추상클래스는 객체생성 불가
		
		//추상클래스를 상속한 sub클래스는 객체생성을 할수 있다.
		//물론 오버라이딩을 한 경우에 가능하다.
		Marine unit1 = new Marine();
		unit1.doMove();

		Zergling unit2 = new Zergling();
		unit2.doMove();

	}

}
