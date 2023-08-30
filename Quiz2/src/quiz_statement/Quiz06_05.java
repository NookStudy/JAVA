package quiz_statement;

import java.util.Scanner;
//정수 쭉 입력받다가 0나오면 그만두고 여태수를 다 더하기.
public class Quiz06_05
{

	public static void main(String[] args)
	{
		
			
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		int j=1;
		int result = 0;
		
		int[] arr = new int[i];
		while(true) 
		{
			if(j!=0) {
			System.out.print("정수를 입력하세요 : ");
			j = sc.nextInt();
			result +=j;
			continue;
			} else if(j==0)
				break;
			
		}
		System.out.println(result);
		

	}

}
