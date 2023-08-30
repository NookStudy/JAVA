//몇개 정수 입력할지 입력받고, 총정수 입력후, 평균값

package quiz_statement;

import java.util.Scanner;

public class Quiz06_06
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 정수를 입력하시겠습니까?");
		int j = sc.nextInt();
		int cnt =0;
		int result =0;
		do{
			cnt++;
			int a = 0;
			System.out.print("더할 정수를 입력해 주세요 :");
			a=sc.nextInt();
			
			result +=a;
			
		}while(!(cnt==j));
		System.out.println("적어주신 정수를 다 합한 결과는 : "+result+"입니다");
		double avg = (double)result/(double)j;
		System.out.printf("평균값은 %.2f 입니다.",avg);
		
	}
	

}
