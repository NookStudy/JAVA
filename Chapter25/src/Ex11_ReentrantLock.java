import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount
{
	/*
	 * ReentrantLock(명시적 동기화
	 * 		synchronized와 같이 동기화를 제공하지만 동기화의 시작과끝을 지정.
	 * 		lock,unlock으로 잠금시작과 종료를 명시적으로 작성가능.
	 */
	ReentrantLock myLock = new ReentrantLock();
	int money = 0;

	public void deposit()
	{
		myLock.lock(); //다른 스레드에서 읽거나 쓰지 못하게 막음
		money++;
		System.out.println("put money: "+money);
		myLock.unlock();//언락
	}

	public void withdraw()
	{
		myLock.lock();
		money--;
		System.out.println("get money :"+money);
		myLock.unlock();
	}
	//찔러보다 먼저들어간놈이 임자
	public int balance()
	{
		return money;
	}
}

public class Ex11_ReentrantLock
{

	public static BankAccount account = new BankAccount();
	

	public static void main(String[] args) throws InterruptedException
	{
		Runnable task1 = () ->
		{
			for (int i = 0; i < 10; i++)
				account.deposit();
		};
		Runnable task2 = () ->
		{
			for (int i = 0; i < 10; i++)
				account.withdraw();
		};

		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(task1);
		pool.submit(task2);

		pool.shutdown();
		//안전하게 종료되기까지 기다림
		pool.awaitTermination(100, TimeUnit.SECONDS);

		System.out.println("money remain: "+account.balance());

	}

}
