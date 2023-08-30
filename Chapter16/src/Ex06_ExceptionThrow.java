
public class Ex06_ExceptionThrow
{
	public static void myMethod1(int n)
	{
		myMethod2(n,0);
	}
	public static void myMethod2(int n1, int n2)
	{
		int r = n1/n2; //예외 발생지점
	}
		
	
	public static void main(String[] args)
	{
		myMethod1(3);//예외 처리 없음 . 예외를 JVM에 던짐. 실행종료.
		System.out.println("Exception Thorw !!!");
	}

}
