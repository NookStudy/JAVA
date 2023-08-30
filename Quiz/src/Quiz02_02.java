import java.util.Scanner;

public class Quiz02_02
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 :");
//		try
//		{
			int num = sc.nextInt();
			
//		} catch ( e)
//		{
//			// TODO: handle exception
//		}
		int result=1;
		for (int i = 1; i < num; i++)
		{
			result *=num; 
		}
		System.out.println(result);
	}


}
