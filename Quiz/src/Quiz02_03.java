import java.util.Scanner;

public class Quiz02_03
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요 : ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.err.println("에러! 숫자가 아닙니다.");
			System.out.print("재 선택 : ");
		}
		//스캐너에서 입력값을 받아 주소로 저장
		int num1 = sc.nextInt();//num1이 sc에서 주소를 받고 찾아가서 가져옴. stack에 저장.
		int num2 = sc.nextInt();
		System.out.printf("%d 나누기 %d의 몫은 %d 입니다.\n",num1,num2,num1/num2);
		System.out.printf("%d 나누기 %d의 나머지는 %d 입니다.",num1,num2,num1%num2);
		
	}

}
