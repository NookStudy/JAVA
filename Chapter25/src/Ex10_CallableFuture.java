import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex10_CallableFuture
{

	public static void main(String[] args)
			throws InterruptedException, ExecutionException
		
	{
		Callable<Integer> task1 = () -> 
		{
			Thread.sleep(5000);
			String name = Thread.currentThread().getName()	;
			System.out.print(name);
			return 2+3;
		};
		Callable<Integer> task2 = () -> 
		{
			Thread.sleep(10);
			String name = Thread.currentThread().getName()	;
			System.out.print(name);
			return 2*3; //제네릭에서 지정한 형태로 값을 반환
		};
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Future<Integer> future1 = pool.submit(task1);
		Future<Integer> future2 = pool.submit(task2);
		
		System.out.println("aaaaa");
		
		Integer r1 = future1.get();
		System.out.println("result: "+r1);
		
		Integer r2 = future2.get();
		System.out.println("result: "+r2);
		
		pool.shutdown();
	}

}
