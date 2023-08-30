package ex19thread;
/*
 * 쓰레드르ㅡㄹ 상속하면서 쓰레드 시작.
 */
class ShowThread extends Thread{
	String threadName;
	public ShowThread(String name) {
		threadName = name;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++)
		{
			System.out.println("안녕하세요.["+threadName+"]입니다.");
			try {
				sleep(10);
				//실행을 0.01초만큼 block(1/1000초 기준.밀리섹)
			}catch (InterruptedException e) {
				 e.printStackTrace();
			}
		}
	}
}

public class Ex01ThreadStart
{

	public static void main(String[] args)
	{
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2st");
		
		st1.start();
		st2.start();

		/*run()은 쓰레드의 main()에 해당함.
		 * 해당 메서드는 start()를 통해 간접호출해야함.
		 * 직접호출하면 단순한 실행만된다.
		 */
//		st1.run();
//		st2.run();

	}
}
