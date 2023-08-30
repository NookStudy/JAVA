package ex18lambda;

/*
 * 기본적인 람다식
 */
interface ISchool3
{
	void studyLambda(String str);
}

public class Ex03Lambda
{

	public static void main(String[] args)
	{
		// 람다식 원형
		/*
		 * 1.함수명 제거.(생성자제거)
		 * 2.메소드명 제거. 
		 * 클래스 변수이름 = (매개변수) -> 함수몸체(오버라이딩)
		 */
		ISchool3 sch1 = (String str) ->
		{
			System.out.println(str + "을 드디어 써보네요...!");
		};
		sch1.studyLambda("람다식");

		// 매개변수의 소괄호 생략, 구현식의 중괄호 생략
		// sch1과 다른 오버라이드.
		// 추상메서드를 통해 매개변수 타입도 알수 있으므로 생략
		// 변수는 써줘야하고...
		ISchool3 sch2 = str -> System.out.println(str + "완전 간단...!");
		sch2.studyLambda("람다식");

	}
}
