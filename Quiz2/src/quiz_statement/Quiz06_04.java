package quiz_statement;

// do while 1~1000더하는 프로그램 작성
public class Quiz06_04
{

	public static void main(String[] args)
	{
		int i = 0;
		int result = 0;

		do
		{
			i++;
			result = result + i;
			System.out.print(i + "+");
		} while (i < 1000);
		System.out.println();
		System.out.println("결과값은" + result + "입니다");
	}

}
