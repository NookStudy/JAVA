import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_CatchConcat
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/*
		 * 예외가 발생할 수 잇는 지역을 try문으로 먼저 묶어줌.
		 */
		try
		{
			int num1 = sc.nextInt();
			int num2 = 10/num1;
			//예외가 발생되는 지점.
			//예외 발생시 프로그램을 던짐.
			System.out.println(num2);
		} catch (ArithmeticException | //여러개 예외 실행가능 
				InputMismatchException e)
		{
//			System.out.println(e.getMessage());
			//간략한 메세지
//			e.printStackTrace();
			//예외 표시 많이사용됌
//			String str = e.getMessage();
			System.out.println("잘못 입력하셨습니다."); 
		
		}
		System.out.println("Good bye~~");
	}

}
