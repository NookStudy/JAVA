/*
 * 쓰레드 생성 두번째 방법
 * 	: jvav는 다중상속을 지원하지 않으므로 다른클래스를 상속하는 클래스에 쓰레드 쓰려면
 * 		러너블 인터페이스를 구현해야 함.
 */
class MyThread3 implements Runnable //러너블 받아서 실행 외부에 만듬.
{
	public void run()
	{
		int sum =0;
		for (int i = 0; i <10; i++)
		{
			sum+=i;
		}
		
		String name = Thread.currentThread().getName();
		System.out.println(name+": "+sum);
	}
}
public class Ex03_RunnableInterface1
{

	public static void main(String[] args)
	{
		//러너블 인터페이스를  구현한 클래스의 인스턴스를 대상으로 쓰레드를 생성.
		//이방법도 Thread 클래스르 통해 쓰레드 생성인건 같음.
		Thread t= new Thread(new MyThread3());
		t.start();
		//스레드 생성시간이 필요해서 밑에것이 선샐행.
		System.out.println("main: " +Thread.currentThread().getName());

	}

}
