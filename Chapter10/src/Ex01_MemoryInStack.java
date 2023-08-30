//디버깅 확인하기
public class Ex01_MemoryInStack
{
	
	public static void main(String[] args)
	{
		int num1=10;//step over	다음으로
		int num2=20;
		int num3=adder(num1, num2);//step into 메소드안으로
		System.out.println(num3);
		
	}

	
	public static int adder(int n1, int n2)
	{
		int result = n1+n2;
		return result;
	}
}
