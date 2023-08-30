/*
함수형 인터페이스
 : 람다식을 사용하기 위해서는 먼저 interface를 만들고 람다식으로 구현할 추상메서드 선언.
 이를 람다식으로 만들기 위한 함수형 ㅣㄴ터페이스이다.
  +++함수형 인터페이스에는 오직 하나의 추상메소드만 선언할 수 있다.
  
  @FunchihonalInterface
   	: 함수형 인터페이스 맞는지 컴파일 확인.
 */



@FunctionalInterface // <=람다식
interface Unit11
{
	String move(); // 매개변수 없음, 반환형 String
	// void attack(); //@FunctionalInterface에러라고 알라줌
}

public class Ex11_Functional
{

	public static void main(String[] args)
	{
		Unit11 unit = () -> {
			return "인간형 유닛 이동";
		};
		System.out.println(unit.move());
	}

}
