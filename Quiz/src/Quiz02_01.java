import java.io.IOException;
import java.util.Scanner;

public class Quiz02_01
{
		
	public static void main(String[] args) throws IOException
	{
		char exitcode;
		do {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하시면 사칙연산을 알려드려요~");
		System.out.print("첫번째 정수를 입력하세요 : ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.err.println("에러! 숫자가 아닙니다.");
			System.out.print("재 선택 : ");
		}
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.err.println("에러! 숫자가 아닙니다.");
			System.out.print("재 선택 : ");
		}
		int num2 = sc.nextInt();
		
		System.out.println("a + b = "+(num1+num2));
		System.out.println("a - b = "+(num1-num2));
		System.out.println("a + b = "+(num1*num2));
		System.out.println("a / b = "+(num1/num2));
		System.out.println("a % b = "+(num1%num2));
		System.out.println("계속하려면 아무키나 누르세요");
		System.out.println("종료하려면 'x'혹은 'X' 키를 누르세요");
			
		exitcode = (char)System.in.read();
		}while(!(exitcode == 'x'|| exitcode=='X'));
		exitcode = 3;
		
				
	}

}
