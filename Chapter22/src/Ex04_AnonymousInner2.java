interface Unit4{
	void move();
}
class HumanCamp4
{
	private int speed = 10;

	public Unit4 getMarine()
	{
//		class Marine4 implements Unit4 //앞의예제
//		{
//			@Override
//			public void move()
//			{
//				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
//			}
//
//		}
//		//내부클래스 사용
//		return new Marine4();
		
		//이름이 없으므로 부모 클래스나 인터페이스의 이름을 사용
		return new Unit4() { //<= 익명 클래스 위에 클래스가 생략됨. 부모이름으로 new
								//굳이 클래스를 만들필요가 없음.
			@Override
			public void move()
			{
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
				
			}
		};//하나의 실행문 이므로 세미콜론으로 끝남
	
	
	}
	
	
}




public class Ex04_AnonymousInner2
{

	public static void main(String[] args)
	{
		//객체생성
		HumanCamp4 hc = new HumanCamp4();
		
		/*
		 * 인터페이스를 구현하여 생성한 익명클래스.
		 * 추상메서드는 기능이 없지만 
		 * 오버라이딩 목적으로 생성하므로 아래처럼 구현
		 */
		Unit4 unit = hc.getMarine();
		unit.move();
	}
	/*
	 결론]
	  	상속의 목적은"확장"
	  	익명클래스의 목적은 '오버라이딩'
	  	일반적으로 익명클래스는 주로 interface를 통해 구현.
	 */

}
