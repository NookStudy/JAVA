import java.io.*;
import java.lang.*;
import java.util.Scanner;


public class ThreadMain3
{
	public ThreadMain3() {}
	
	public static void main(String[] args) {
		//객체새성
		ThreadMain3 tm = new ThreadMain3();
		tm.init();
	}
	
	public static void init()
	{
		System.out.println("숫자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
//		String s_num = sc.nextLine();
//		int n_num = Integer.parseInt(s_num);
		//문자열 숫자열로 반환시 ->스레드끝나도 메인은 끝나지 않음
		int n_num = sc.nextInt();
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
		System.out.println();
	}

	static class ThreadSub extends Thread
	{
		int nNum;
		public ThreadSub(int num)
		{
			this.nNum=num;
			
		}
		
		@Override
		public void run() {
			int i = 0;
			while(i<nNum) {
				try
				{
					Thread.sleep(1000);
					i+=1;
					System.out.println("Thread : "+i);
				} catch (Exception e)
				{
					System.out.println("예외"+e);
				}
			}
		}
	}

	

}
