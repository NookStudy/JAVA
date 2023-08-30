//정수 하나를 입력받은 후 구 수의 팩토리얼함수의 결과 출력. while문 쓸것
package quiz_statement;

import java.util.Scanner;

public class Quiz06_03
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		int i= 0;
		int result=1;
//		int fr =1;//확인용
		while (i<a)
		{
			result *=(a-i);
			i++;
		}
		System.out.println(result);
//		for (int j = 1; j <= a; j++)
//		{
//			fr*=j;
//		}
//		System.out.println(fr);//확인용
		
		
	}	
}
