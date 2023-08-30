
public class Ex04_RunnableInterface2
{

	public static void main(String[] args)
	{
		Runnable task = () ->{ //람다식
			try
			{
				Thread.sleep(3000); //3초 재우기
			} catch (Exception e)
			{
			}
			
			int sum =0;
			for (int i = 0; i < 10; i++)
			{
				sum+=i;
			}
			//현재 스레드명
			String name = Thread.currentThread().getName();
			//연산결과 출력. 3초뒤에 출력
			System.out.println(name+": "+sum); //여기가 ㅏ실행되야 멈춤
		};
		
		Thread t = new Thread(task);
		t.start();
		
		System.out.println("main: "+Thread.currentThread().getName());
	}

}
