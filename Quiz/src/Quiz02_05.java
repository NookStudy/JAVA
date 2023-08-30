import java.util.Scanner;
import java.lang.Math;
// 정수 2개 받아서 곲한값의 결과를 절대값으로 출력해라
public class Quiz02_05
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하시면 두개의 곲을 절대값으로 알려드려요");
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
		
		int result = 1;
		result = num1*num2;
		System.out.println(Math.abs(result));
	}


}
