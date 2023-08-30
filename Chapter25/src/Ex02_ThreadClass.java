/*
 * 쓰레드.
 * -쓰레드의 생성은 스레드 클래스를 상속하는것부터.
 * 지금 방법은 쓰레드 생성할 클래스가 다른 클래스를 상속할 필요가 없을때 사용.
 * 상속해야되면 러너블 인터페이스를 구현해야함.
 * 자바랭 기본 패키지이므로 import필요없음.
 */
class MyThread2 extends Thread
{
	/*
	 * run() -> 쓰레드의 메인메서드.
	 * 직젖ㅂ호출불가, strat()를 ㅗㅇ해 간접호출.
	 * 직접호출하면 쓰레드 생성안됌.
	 */
	@Override
	public void run() //스레드 상속시 반드시 run()을 사용할것. 이게 스레드.
	{
		int sum =0;
		for (int i = 0; i <10; i++)
		{
			sum+=i;
		}//스레드 이름이 없으면 수자로 줌.
		
		//스레드 이름이 없으면 숫자로 줌
		String name = Thread.currentThread().getName();
		//나중에 출력. 연산결과 출력
		System.out.println(name+": "+sum);
	}
}
public class Ex02_ThreadClass
{

	public static void main(String[] args)
	{
		//스레드 객체생성
		MyThread2 t= new MyThread2();
		//스레드 생성 및 실행
		t.start();//run()을 통해 불러옴.
		//스레드 생성시간이 필요해서 밑에것이 선샐행.
		System.out.println("main: " +Thread.currentThread().getName()); //선실행
	
		//일반적인 메소드는 실행끝까지 기다리지만 스레드는 기다리지 않고 밑이 먼저 선실행.
		//다른것들이 끝나도 스레드 끝나길 기다리다가 스레드 오면 받아주고 프로그램아웃.
	}

}
