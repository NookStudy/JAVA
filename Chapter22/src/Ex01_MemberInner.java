
/*
 * 내부클래스
 * 클래스안에 저으이도니 클래스로 static이 없는 클래스.
 * -외부 클래스의 모든 멤버 사용가능.
 * -정적멤버는 가질수 없다.
 * -컴피알시 "'외부클래스명'$'내부클래스명'.class" 파일 생성됨
 * -이벤트 기반의 프로그래밍에서 많이 사용된다.
 */

class Outer1{
	//멤버변수
	private int speed = 10;
	
	//멤버 내부 클래스
	// Outer1$MemberInner1.class 생성.
	//bin에서 확인.
	class MemberInner1{
		public void move()
		{
			/*
			 * 내부클래스에서는 외부클래스의 모든 멤버에 접근가능
			 */
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n",speed);
		}
	}
	
	public void getmarine()
	{	
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
}
public class Ex01_MemberInner
{

	public static void main(String[] args)
	{
		Outer1 outVariable = new Outer1();
		
		outVariable.getmarine();
		
		/*추가
		 * - 외부클래스가 아닌 다른 클래스에서는 내부멤버클래스가 보이지 않음. 직접 생성불가.
		 */
		
//		MemberInner1 inners = new MemberInner1();//불가능
		/*
		 * 외부클래스의 인스턴트를 생성후에 내부클래스를 생성해야함.
		 * nook-사실상 멤버변수의 생성과 같다
		 */
		
		
		//바깥 클래스의 멤버클래스MemberInner1 선언.
		Outer1.MemberInner1 inner = outVariable.new MemberInner1();
		
		inner.move();
	}

}
