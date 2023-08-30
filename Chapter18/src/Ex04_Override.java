interface Unit4
{
	public void move(String str);// 추상 메서드
}

/*
 * 자바의 어노테이션은 소스코드에 추가해서 사용할 수 있는 메타데이터의 일종.
 * 메타데이터 : 컴파일 과정과 실행과정에서 코드 처리방법을 알려주는 추가정보(앱처리 데이터아님)
 * 어노테이션은 주석이라는 의미를 가짐.
 * 용도 - 컴파일러한테 코드 작성 문법 에러 체크
 * 	- 소프트위어 개발툴이 빌드나 배치시 코드를 자동으로 생성할 수 있도록 정보 제공
 * 	- 실행시(런타임시) 특정 기능을 실행하도록 정보를 제공
 */

class Human4 implements Unit4
{
	@Override //오타방지를 위해서 사용
	public void move(String str)// 메서드 오버라이딩//오타나면 알려준다.
//	public void move(Sting str)//Sting 오타 찾음
	{
		System.out.println(str);
	}
}

public class Ex04_Override
{

	public static void main(String[] args)
	{
		Unit4 unit = new Human4();
		unit.move("인간형 유닛이 이동합니다.");
	}

}
