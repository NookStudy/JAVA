package ex19thread;

class Increment
{
	int num = 0;

	// 비동기화 메소드.
//	public void increment()
//	{
//		num++;
//	}
	// 동기화 메소드 : 메서드전체 동기화.but 시간 오래걸림.
//	synchronized public void increment()
//	{
//		num++;
//	}
	//동기화 블럭
	//num++블럭을 동기화함. 조금 덜느림
	public void increment()
	{
		synchronized(this) {
			num++;
		}
	}

	public int getNum()
	{
		return num;
	}
}

class IncThread extends Thread
{
	Increment inc;

	public IncThread(Increment inc)
	{
		this.inc = inc;
	}

	public void run()
	{
		for (int i = 0; i < 10000; i++)
		{
			for (int j = 0; j < 10000; j++)
			{
				inc.increment();
			}
		}
	}
}

public class Ex05Sync2Longtime
{

	public static void main(String[] args)
	{
		Increment inc = new Increment();

		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);

		it1.start();
		it2.start();
		it3.start();

		try
		{
			it1.join();
			it2.join();
			it3.join();
		} catch (InterruptedException e)
		{
			// TODO: handle exception
		}
		System.out.println("결과: " + inc.getNum());
	}

}
