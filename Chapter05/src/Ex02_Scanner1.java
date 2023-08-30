import java.util.Scanner;

public class Ex02_Scanner1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Scanner 객체생성. 입력

		System.out.print("숫자를 1 2 3 입력후 엔터를 입력하세요 : ");
		//스캐너에서 입력값을 받아 주소로 저장
		int num1 = sc.nextInt();//num1이 sc에서 주소를 받고 찾아가서 가져옴. stack에 저장.
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.print("숫자를 1 입력하고 엔터를 입력하세요 : ");
		int num4 = sc.nextInt();
		System.out.print("숫자를 2 입력하고 엔터를 입력하세요 : ");
		int num5 = sc.nextInt();
		System.out.print("숫자를 3 입력하고 엔터를 입력하세요 : ");
		int num6 = sc.nextInt();

		System.out.printf("(%d %d %d %d %d %d)%n", num1, num2, num3, num4, num5, num6);
//		sc.close();
		//메인 종료후 모두 사라짐.
		System.out.println(num1+"");
	}

}
