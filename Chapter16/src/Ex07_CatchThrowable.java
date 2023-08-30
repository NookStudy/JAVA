import java.util.Scanner;

public class Ex07_CatchThrowable
{
	public static void myMethod1()
	{
		myMethod2();	//예외 넘어옴
	}
	
	public static void myMethod2()
	{
		Scanner sc  = new Scanner(System.in);
		
			int num1 = sc.nextInt();	//에러발생지점
			int num2 = 10/num1;			//에러발생지점
			System.out.println(num2);
	}
	
	public static void main(String[] args)
	{
		try
		{
			myMethod1();
		} catch (Throwable e)
		{
//			e.printStackTrace();//에러 확인
//			System.out.println(e.getMessage());//에러확인 간단버젼
			System.out.println("에러!!!");
		}
	}





}
