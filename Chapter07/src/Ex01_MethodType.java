public class Ex01_MethodType
{
	/*static으로 선언된 메서드는 static선언언된 메서드만 호출가능.
	 * 메서드 호출후 반환값은 호출한 위치로 반환된다.
	 */
	public static void main(String[] args)
	{
		/*메서드 호출시 함수의원형을 그대로 기술
		 * -매개변수는 갯수만큼. 
		 * -매개변수 에러 or 타입에러 =>에러
		 * -ex> addTwoNum1(1,2,3) , sayHello(5);//에러!
		 */

		// 매개변수 없고 반환 없는 메서드
		sayHello();
		// 매개변수 있고 반환 없는 메서드
		// 문자열 전달받고 출력만함. void의 경우 Main 원흐름으로 돌아간다.
		addTwoNum1(5, 2);
		// 반환값이 없으므로 메소드내의 변수는 메인흐름으로 꺼낼수 없다.
///		System.out.println(nResult);불가능

		// 매개변수 없고 반환 있는 메서드
		// 결과값을 반환하는 형태의 기능이 필요할때 사용.
		// 주로 난수생성등에 적합. 메서드 자체로 값생성.
		// 반환값이 있는경우 결코 void선언하면 안됌.
		int age = getAge();
		System.out.println(age);
		System.out.println(getAge());

		// 매개변수 있고 반환 있는 메서드
		int sum = addTwoNum2(1, 2);
		System.out.println("합은 " + sum);
		/*
		 * Main 종료시 프로그램 종료.
		 */
	}

	public static void sayHello()
	{
		System.out.println("hello");
	}

	public static void addTwoNum1(int num1, int num2)
	{
		int nResult = num1 + num2;
		System.out.println(nResult);
	}

	public static int getAge()
	{
		return 20; // 메서드 가다가 리턴이 오면 매서드 종료. (break와 비슷한역할?)
	}

	public static int addTwoNum2(int num1, int num2)
	{
		return num1 + num2;
	}

}
