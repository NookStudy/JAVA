//정수 5개 받고 합 구해서 출력
//숫자가 1미만이면 재입력 요구
package quiz_statement;

import java.util.Scanner;

public class Quiz06_10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int result = 0;
		System.out.println("5개의 양수를 더해드릴게요.");
		do
		{
			System.out.print("더해주실 양수를 입력하세요 : ");
			
			int a = sc.nextInt();
				if(a<1) {
					System.out.println("잘못된 정수에요");
					continue;
				}else {
				cnt++;
				result +=a;
				}
		} while (cnt <= 5);
		System.out.println("입력해주신 값들의 합은 : "+result+"입니다.");
	}

}
