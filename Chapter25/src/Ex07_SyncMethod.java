
public class Ex07_SyncMethod
{
	
	public static int money = 0;
	/*
	 * 쓰레드 동기화
	 * 	: synchronized 선언으로 정확한 결과는 나오지만 시간이 길어짐.
	 *  동기화 작업은 성능감소를 초래하므로 필요한 부분에 대해서만 해라.
	 */
	
	
	public synchronized static void deposit()
	{
		money++;
	}

	//스레드 문제점 해결하기 위해서 메서드로 호출.
	public synchronized static void withdraw()
	{
		money--;
	}

	public static void main(String[] args) throws InterruptedException
	{
		Runnable task1 = () ->
		{
			for (int i = 0; i < 10000; i++)
				money++;
//				deposit();
		};
		Runnable task2 = () ->
		{
			for (int i = 0; i < 10000; i++)
				money--;
//				withdraw();
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(money);

	}
}
