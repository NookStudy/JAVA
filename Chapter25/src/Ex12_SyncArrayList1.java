import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex12_SyncArrayList1
{
	public static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws InterruptedException
	{
		for (int i = 0; i < 10; i++)
			list.add(i);
		String name = Thread.currentThread().getName()	;
		System.out.println(name);
		System.out.println(list);

		Runnable task = () -> 
		{
			ListIterator<Integer> itr = list.listIterator();
			String names = Thread.currentThread().getName()	;
			System.out.println(names);
			while(itr.hasNext())
				itr.set(itr.next()+1);
		};
		
		ExecutorService pool = Executors.newFixedThreadPool(5);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);
		
		pool.shutdown();
		pool.awaitTermination(100, TimeUnit.SECONDS);
		//동기화를 안했기 때문에 결과값이 일정하지 못함.
		//한두개 씹히는 경우 발생.
		System.out.println(list);
	}

}
