package ex18lambda;

import java.util.Random;

@FunctionalInterface
interface StringConcat
{
	//매개변수 O 반환값 x
	public void makeString(String s1, String s2);
}

@FunctionalInterface
interface RandomNumber
{
	//매개변수 x 반환값 o
	public int randomNum();
}

@FunctionalInterface
interface GugudanRange
{
	//매개변수 o 반환값 o
	public String[][] guguString(int n1, int n2);
}

@FunctionalInterface
interface MenuPrint
//매개변수 x 반환값 x
{
	public void onlyPrint();
}

public class Ex05ParamNReturn
{

	public static void main(String[] args)
	{
		System.out.println("###람다식1");
		//매개변수 O 반환값 x
		String s1 = "안녕하세요";
		String s2 = "람다식입니다.";
		StringConcat sc = (a, b) ->
		//String까지는 생략.메서드명 제거 후 화살표.
		{
			System.out.println(a + " " + b);
		};
		//오버라이딩된 람다식 호출
		sc.makeString(s1, s2);

		System.out.println("###람다식2");
		//매개변수 x 반환값 o
		//매개변수가 없음. (). 반환자 온
		RandomNumber randomNumber = () ->
		{
			Random random = new Random();
			return random.nextInt(100);
		};
		//반환값을 좌측항 변수에 삽입
		int rNumber = randomNumber.randomNum();
		System.out.println("생성된 난수" + rNumber);

		System.out.println("###람다식3");
		//매개변수 o 반환값 o
		GugudanRange gugudanRange = (num1, num2) ->
		{
			//2차원배열 선언 후 구구단을 각 원소에 삽입. 2단~9단까지 죄다.
			String[][] gugudan = new String[9][9];
			for (int i = num1; i <= num2; i++)
			{
				for (int j = 1; j <=9; j++)
				{
					gugudan[i - 1][j - 1] = i + "*" + j + "=" + (i * j);
				}
			}
			//배열의 참조값이 반환된다.
			return gugudan;
		};
		String[][] returnStr = gugudanRange.guguString(4, 6);
		//4~6단까지의 구구단 소환하여 returnStr에 삽입
		//소환.
		for (int i = 4; i <= 6; i++)
		{
			for (int j = 1; j <= 9; j++)
			{
				System.out.print(returnStr[i - 1][j - 1] + " ");
			}
			System.out.println();
		}

		System.out.println("###람다식4");
		//매개변수 x 반환값 x
		MenuPrint menuPrint = () ->
		{
			System.out.println("메뉴를 출력합니다");
		};
		menuPrint.onlyPrint();

	}

}
