package ex19thread;

class NormalClass
{
	String title;
	/*
	 * 그냥 일반적인 클래스.
	 * 하나의 클래스가 작업을 완료해야 다음작업실행.
	 */
	public NormalClass(String title)
	{
		this.title = title;
	}

	void classmethod()
	{
		for (int i = 0; i <= 10; i++)
		{
			System.out.printf("%s]i=%d%n", title, i);
		}
	}
}
/*
 * 메인쓰레드와 워킹쓰레드(개발자정의 쓰레드)
 * 메인쓰레드가 종료되어도 계속 실행. dead되어야 실행종료.
 * 메인 메서드 종료후에도 계속 실행됌.
 */
class NormalThread extends Thread
{
	public NormalThread()
	{
	}
	//쓰레드 이름 짓는게 가능함.
	//getName으로 반환받을 수 있다.
	public NormalThread(String title)
	{
		super(title);
	}

	void threadMethod() throws InterruptedException
	{
		for (int i = 0; i <= 10; i++)
		{
			//2초간 블럭. 총 20초간 유지
			System.out.printf("%s]i=%d%n", getName(), i);

			sleep(2000);
		}
	}

	@Override
	public void run()
	{
		try
		{
			threadMethod();
		} catch (InterruptedException e)
		{

		}
	}
}
/*종속쓰레드(Daemon Thread_
 * 모든 독립쓰레드가 종료시 자동종료.
 * 주로 프로그램 보조로 배경음악, 로그자동저장등의 업무처리.
 * 
 */
class DaemonThread extends Thread
{
	@Override
	public void run() {
		//무한루프로 구성. 별도 탈출X. (어차피 모든쓰레드 종료시 종료)
		while (true)
		{
			System.out.printf("[쓰레드명:%s]Jazz가 흘러요~%n",getName());
			try
			{
				sleep(3000);
				System.out.println("3초마다 자동저장!!");
			} catch (InterruptedException e)
			{
				System.out.println("자동저장 오류발생 ㅜㅜ");
			}
		}
	}
}
public class Ex03DaemonThread
{

	public static void main(String[] args)
	{
		NormalClass nt1 = new NormalClass("첫번째 클래스");
		nt1.classmethod();
		new NormalClass("두번째 클래스").classmethod();
		
		
		NormalThread yt1 = new NormalThread("1st쓰레드");
		yt1.start();
		
		NormalThread yt2 = new NormalThread();
		yt2.setPriority(Thread.MAX_PRIORITY);
		yt2.start();
		//먼저 독립쓰레드를 생성한 후 setDaenom()메소드로 
		//데몬쓰레드로 만들어준다.
		DaemonThread dt = new DaemonThread();
		dt.setName("데몬쓰레드");
		dt.setDaemon(true);
		dt.start();
		
		System.out.println("현재 활성화 된 상태의 쓰레드수"+Thread.activeCount());
		System.out.println("현재 실행중인 쓰레드명: "+Thread.currentThread().getName());
		System.out.println("메임함수의 우선순위: "+
		Thread.currentThread().getPriority());
		System.out.println("메인함수(main Thread)종료");
		
		 
	}

}
