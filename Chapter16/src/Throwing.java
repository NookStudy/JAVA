
public class Throwing
{
	public static void method2() throws Exception
	{
		throw new Exception();
	}
	public static void method1()throws Exception
	{
		method2();
	}
	
	public static void main(String[] args) throws Exception//쓰로우 안하면 컴파일에러
	{
		method1();
		System.out.println("예외처리해야 나옴.");
	}

}
