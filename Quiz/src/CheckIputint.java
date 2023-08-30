import java.util.Scanner;

public class CheckIputint
{
	public static void checkInt() {
	Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
		sc.next();
		System.err.println("에러! 숫자가 아닙니다.");
		System.out.print("재 선택 : ");
	}
	}
}
