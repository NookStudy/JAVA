package quiz_statement;

import java.util.Scanner;

public class Quiz06_09
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int j = sc.nextInt();
		for (int dan = j; dan > 1; dan--)
		{
			for (int su = 1; su <= 9; su++)
			{
				System.out.printf("%d*%d=%d ",dan,su,dan*su);
			}
			System.out.println();
		}
	}

}
