/*
 * Object
 * 자바 최상위 클래스.
 * 별도의 선언없이 오브젝트에 정의된 모든 메서드를 사용할 수 있다.
 * 개발자가 ㅏ정의한 모든 클래스는 object의 참조변수로 참조할 수 있다.
 */


public class Ex01_Object extends Object  //extends Object 생략된 것임.
{
	String name;

	String getName()
	{
		return name;
	}
}
