import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex15_ConcurrentHashMap
{
	public static Map<String, Integer> syncMap = null; //전체 락 전체 병목
	public static Map<String, Integer> concMap = null; //부분 락 부분 병목

	public static void performanceTest(final Map<String, Integer> target) throws InterruptedException
	{
		System.out.println("Stratr: " + Thread.currentThread().getName());
		Instant start = Instant.now();

		Runnable task = () ->
		{
			for (int i = 0; i < 100000; i++)
				target.put(String.valueOf(i), i);
		};

		ExecutorService pool = Executors.newFixedThreadPool(5);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);
		pool.submit(task);

		pool.shutdown();
		pool.awaitTermination(100, TimeUnit.SECONDS);
		Instant end = Instant.now();
		System.out.println("End: " + Duration.between(start, end).toMillis());
	}

	public static void main(String[] args) throws InterruptedException
	{
		//맵을 동기화한 맵으로 반환
		syncMap = Collections.synchronizedMap(new HashMap<>());
		performanceTest(syncMap);
		/*
		 * Hashtable 클래스의 단점을 보완, 
		 * Multi-Thread 환경에서 사용할수 있도록 나온 클래스가 ConcurrentHashMap.
		 */
		concMap = new ConcurrentHashMap<>();
		performanceTest(syncMap);
	}

}
