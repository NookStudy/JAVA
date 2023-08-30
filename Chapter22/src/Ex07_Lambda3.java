/*
 * 람다식으로 구현하기
 * 	:메스드를 서언하기 위해 반드시 클래스를 정의해야함.
 *  너모 불편해서 함수형 프로그래밍(Functional Programming)의 장점이 대두됌.
 *  그래서 이거 보완하려고 자바8부터 람다식을 지원함.
 * 
 */

//람다식을 위한 인터페이스 정의
interface Unit7
{
	void move(String s);
}

public class Ex07_Lambda3
{
	public static void main(String[] args)
	{
		/*
		 * 앞의 예제의 익명클래스를 다음과 같은 람다식으로 표현가능.
		 1. 함수명 제거. 어차피 부모한테 오버라이딩이니까.
		 2.람다식표현을 위해 소괄호와 중괄호 사이에 화살표 삽입.
		 좌측의 부모참조변수가 우측의 자식영역을 참조한다는 개념으로 이해해라.
		 */
//		Unit7 unit = new Unit7()
//		{
//			@Override
//			public void move(String s)
//			{
//				System.out.println(s);
//			}
//		};
		Unit7 unit = (String s) ->  //좌측 부모인 유닛이 자식영역 익명클래스를 참조
			//오버라이딩이니까 패스, 메소드인거 아니까 패스 '매개변수 -> 구상부' 로 오버라이딩 확인.
			{//여기서부터 함수
				System.out.println(s);
			};//함수 끝
		//추상메소드의 이름을 통해 람다식을 호출한다.
		unit.move("Lambda : Unit 7");
	}
}
