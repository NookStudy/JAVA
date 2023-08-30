import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_ThrowsInMethod
{

	public static void main(String[] args) throws Exception
	{
		try
		{
			myMethod1();
		} catch (ArithmeticException| InputMismatchException e)
		{
			e.printStackTrace();
		}
		/*
		 * 앞에서 예외가 발생하더라도 예외처리를 했으므로 프로글매은 정상종료.
		 * 실행의 흐름이 마지막까지 이어지게 하는 것이 예외처리의 목적이다.
		 */
		System.out.println("--------------");
	}
	
	public static void myMethod1()
	{
		myMethod2();
	} 
	
	
	public static void myMethod2()throws ArithmeticException, InputMismatchException
	{
		Scanner sc  = new Scanner(System.in);
		
		int num1 = sc.nextInt();	//에러발생지점
		int num2 = 10/num1;			//에러발생지점
		System.out.println(num2);
	}
}
