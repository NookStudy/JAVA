import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex14_SyncArrayList3
{
//	public static List<Integer> list = new ArrayList<Integer>();
	public static List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
	
	
	public static void main(String[] args) throws InterruptedException
	{
		for (int i = 0; i < 10; i++)
			list.add(i);
		System.out.println(list);
		
		Instant start = Instant.now();
		Runnable task = () -> {
			//list 객체를 사용할 때 객체에 동기화 Lock을 설정
			synchronized(list)
			{
				ListIterator<Integer> itr = list.listIterator()	;
				
				while(itr.hasNext())
					itr.set(itr.next()+1);
			}
		};
		
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
