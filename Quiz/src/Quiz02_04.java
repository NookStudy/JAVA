import java.util.Scanner;

//사용자로부터 두개의 정수를 입력받아서 큰 값을 출력
public class Quiz02_04
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하시면 큰값을 알려드립니다.");
		System.out.print("첫번째 정수를 입력하세요 : ");
		while (!sc.hasNextInt())
		{
			sc.next();
			System.err.println("에러! 숫자가 아닙니다.");
			System.out.print("재 선택 : ");
		}
		int num1 = sc.nextInt();

		System.out.print("두번째 정수를 입력하세요 : ");
		while (!sc.hasNextInt())
		{
			sc.next();
			System.err.println("에러! 숫자가 아닙니다.");
			System.out.print("재 선택 : ");
		}
		int num2 = sc.nextInt();

		if (num1 > num2)
		{
			System.out.println(num1 + "이(가) 더 큰 정수입니다.");
		} else if (num2 > num1)
		{
			System.out.println(num2 + "이(가) 더 큰 정수입니다.");

		} else
		{
			System.out.println(num1 + "과" + num2 + "는 같은 값입니다.");
		}

	}

}
