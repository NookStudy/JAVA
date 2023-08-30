package quiz_statement;

import java.util.Scanner;

/*
 * 두개정수 입력 받아서 두수의 차를 출력하는 프로그램 작성.
 * 다만 결과는 항상 양수여야 함.
 */
public class Quiz06_01
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int b = sc.nextInt();
		if (a>b)
		{
			System.out.println(a-b);
		} else if(b>a)
		{
			System.out.println(b-a);
		}
		
	}

}
