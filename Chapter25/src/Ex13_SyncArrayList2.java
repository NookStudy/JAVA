import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex13_SyncArrayList2
{
	public static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws InterruptedException
	{
		for (int i = 0; i < 10; i++)
			list.add(i);
		String name = Thread.currentThread().getName()	;
		System.out.println(name);
		System.out.println(list);
		
		Instant start = Instant.now();
		Runnable task = () -> 
		{
			//list객체를 사용할 때 동기화 Lock 을 설정.
			synchronized (list)
			{
				
			ListIterator<Integer> itr = list.listIterator();
			String names = Thread.currentThread().getName()	;
			System.out.println(names);
//			while(itr.hasNext())
//				itr.set(itr.next()+1);
			for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();)
				itr.set(itr.next()+1);//while과 동일
			
			}
		};
		
//		ExecutorService pool = Executors.newSingleThreadExecutor();
		ExecutorService pool = Executors.newFixedThreadPool(5);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end).toNanos());
		
		pool.shutdown();
		pool.awaitTermination(100, TimeUnit.SECONDS);
		System.out.println(list);
	}

}