import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_TryCatch
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int num1 = sc.nextInt();
			int num2 = 10/num1;
			System.out.println(num2);
			System.out.println("Good bye~~!");
		} catch (ArithmeticException e)
		{
			String str = e.getMessage();
			System.out.println(str); //str이 뭔지 확인
			if (str.equals("/ by zero"))	//우리가 만든 메세지가 나감.
				System.out.println("0으로 나눌 수 없습니다.");
			
				
			
		} catch(InputMismatchException e) //import 안하면 에러,정수값이 아니면 실
		{ 
			System.out.println(e.getMessage());
			e.printStackTrace();//개발자를 위한 메세지
			
			
			System.out.println("숫자가 아닙니다.");
		}
		
	}

}
