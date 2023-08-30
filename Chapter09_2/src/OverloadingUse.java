/*
 * 메서드 오버로딩(Method Overloading): 동일한 이름의 메소드2개이상 정의.
 * -매개변수의 갯수가 다르거나 자료형이 다를 때 성립
 * -반환타입만 다른것은 허용하지 않는다.
 * -컴파일러는 메서드 호출시 전달되는 인수(파라미터)를 통해 호출할 메서드를 구분한다.
 * -자바에서는 메서드명+매개변수 = 1개의 메서드명
 * 
 */

class Calc
{
//	생성자가 생략되있는거. 앞에 void가 없으면 생성자라고 보면됌.
	Calc(){
		
	}
	int add(int a, int b)
	{
		return a + b;
	}

	// 리턴값이 다르다고 다른 메서드로 성립 불가.
//	void add(int a)
//	{
//		return ;
//	}
	int add(int a)
	{
		return a + 1;
	}

	double add(double a, double b)
	{
		return a + b;
	}

}

public class OverloadingUse
{
	public static void main(String[] agrs)
	{
		Calc calc = new Calc();// 객체 생성
		// 매개변수가 정수 2개인 메스드 호출
		int nRtn1 = calc.add(3, 9);
		// 매개변수가 정수1개인 메스드 호출
		int nRtn2 = calc.add(3);
		// 매개변수가 실수 2개인 메스드 호출
		double nRtn3 = calc.add(3.0, 9.0);
		//출력을 위한 PRINT()문이 대표적인 오버로딩
		System.out.println("Rtn1 = " + nRtn1);
		System.out.println("Rtn2 = " + nRtn2);
		System.out.println("Rtn4 = " + nRtn3);
	}
}
