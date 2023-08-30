
public class Ex06_ProblemOfThread
{
	public static int money = 0;//static에 존재하므로 값을 공유함.
	
	
	public static void main(String[] args)
			throws InterruptedException//원래는 Try catch문 써야함.
	{
		Runnable task1 = () ->{
			for (int i = 0; i < 10000; i++)
				money++;
		};
		Runnable task2 = () ->{
			for (int i = 0; i < 10000; i++)
				money--;
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
//		t1.join();//여기다 join 두면 0나옴.
		t2.start();
		
		//쓰레드가 하나의 작업을 완료하기를 기다리는 기능 수행.
		//해당 쓰레드 하나의 작업이 종료되면 다음 쓰레드 실행.
		//쓰레드의 동시접근 제한기능.
		t1.join();
		t2.join();
		//+가 나오면 t2가 먼저 끝나버리고 그 이후 t1이 실행되면서
		//아직 미반영된 static 을 들고와서 +로 만들어버렸단 뜻임.
		
		//이런 문제가 생기지 않게 동기화를 시켜주는거임. 다음예제에서 계속.
		System.out.println(money);
	}
}
