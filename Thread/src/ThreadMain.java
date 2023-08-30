import java.io.*;
import java.lang.*;
import java.util.Scanner;


public class ThreadMain
{

	public static void main(String[] args)
	{
		System.out.println("숫자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		String s_num = sc.nextLine();
		int n_num = Integer.parseInt(s_num);
		//문자열 숫자열로 반환시 ->스레드끝나도 메인은 끝나지 않음
//		int n_num = sc.nextInt();
		//숫자열 그대로 입력시 => 스레드끝나면 메인안끝나도 끝나버림
		
		
		try
		{
			Thread tsub = new ThreadSub(n_num);
			tsub.start();
		} catch (Exception e)
		{
			 e.printStackTrace();
		}
		System.out.println();
		System.out.println("이름을 입력해 주세요.");
		String s_name = sc.nextLine();
		System.out.println(s_name);
	
	}

}
