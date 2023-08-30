import java.io.IOException;
import java.util.Scanner;
public class Ex02_switch_dowhile
{
	public static void main(String[] args) throws IOException
	{
		int i;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하세요:");
			int n = sc.nextInt();
			System.out.println(n % 3);

			switch (n % 3)// 스위치의 조건문은 정수식이여야함.
			{
			case 1:
				System.out.println("나머지가 1");
				break; // break문이 없으면 밑의 모든 실행문이 실행된다.
			case 2:
				System.out.println("나머지가 2");
				break;

			default:
				System.out.println("나머지가 0");
			}
			System.out.println("계속 하려면 아무키나 입력하십시오.");
			System.out.print("종료하시려면 'x'키 혹은 'X'키를 입력하세요...");
			i = (char) System.in.read();
		} while (!(i == 'x' || i == 'X'));
	}
}
