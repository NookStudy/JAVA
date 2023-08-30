import java.util.Scanner;

public class Ex05_Exception
{

	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		
		try {
			int num1 = sc.nextInt();
			int num2 = 10/num1;
			System.out.println(num2);
		}catch (Exception e) //한거번에 처리가능
		{
			/*
			 * Exception 클래스는 모든예외클래스의 부모.
			 * 가장 마지막에 기술해야함. 중간에 하면 에러
			 */
			System.out.println(e.getMessage());
			e.printStackTrace();
			String str = e.getMessage();
			System.out.println("잘못 입력하셨습니다."); 
		}
		System.out.println("Goodbye");
		
	}

}
