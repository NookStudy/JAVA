import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 스레드 풀은 작업처리에 사용되는 스레드를 제한된 개수만큼 정해놓고 
 * 작업큐에 들어오는 작업들을 하나씩 스레드가 맡아 처리한다.
 * 작업처리 요청이 늘어나도 스레드 갯수가 늘어나진 않아서 시스템 성능이 급격히 저하되지않음.
 */
public class Ex08_ThreadPool1
{
	public static int money = 0;

	public static void main(String[] args)
	{
		Runnable task1 = () -> //스레드에 시킬작업
		{
			for (int i = 0; i < 10000; i++)
				money++;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + money);
		};
		
		Runnable task2 = () -> //스레드에 시킬작업
		{
			for (int i = 0; i < 10000; i++)
				money--;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + money);
		};

		//싱글스레드 두고 작업요청이 아무리 많이와도 스레드를 늘리지 않게 만듬.
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		pool.submit(task1); //스레드 풀에 작업전달.
		//task1이 끝나기 전엔 시작되지 않음.
		pool.submit(task2);

		System.out.println("End " + Thread.currentThread().getName());

		pool.shutdown(); //스레드 풀과 그 안에 있는 스레드의 소멸
	} 

}
