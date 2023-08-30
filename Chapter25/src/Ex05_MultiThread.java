
public class Ex05_MultiThread
{

	public static void main(String[] args)
	{
		Runnable task1 = () ->{
			try
			{
				for (int i = 0; i < 20; i=i+2)
				{
					System.out.print(i+" ");
					Thread.sleep(500);
				}
			}catch (Exception e) {	}
		};
		
		Runnable task2 = () -> {
			try
			{
				for (int i = 9; i > 0; i--) //10미만 수 출력
				{
					System.out.print("("+i+")");
					Thread.sleep(200);
				}
				
			} catch (InterruptedException e)
			{
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
	}

}
