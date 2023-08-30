package ex19thread;
/*
 * 쓰레드의 우선순위
 * setPriority : 쓰레드의 우선순위를 지정
 * getPriority : 우선순위 반환
 */
class MessageSendingThread extends Thread
{
	String message;
	public MessageSendingThread(String str) {
		message = str;
	}
	public MessageSendingThread(String str, int pri) {
		message = str;
		setPriority(pri);
	}
	public void run()
	{
		for (int i =1 ; i <= 1000; i++)
		{
			System.out.println(message+i+"("+getPriority()+")");
//			try
//			{
//				sleep(1);
//			} catch (InterruptedException e)
//			{
//				System.out.println(e.getMessage());
//			}
		}
	}
}

public class Ex02Priority
{

	public static void main(String[] args)
	{
		//우선순위 없음. 전부 우선순위5. 알아서 분배
//		MessageSendingThread tr1 = new MessageSendingThread("첫번째");
//		MessageSendingThread tr2 = new MessageSendingThread("두번째");
//		MessageSendingThread tr3 = new MessageSendingThread("세번째");
		
		//Thread클래스의 정적상수를 이용해서 우선순위 부여.
		//각각  10 5 1. 상수대신 정수로 부여가능.
		MessageSendingThread tr1 = new MessageSendingThread("첫번째",10);//우선순위 제일 높음.
		MessageSendingThread tr2 = new MessageSendingThread("두번째",5);
		MessageSendingThread tr3 = new MessageSendingThread("세번째",1);
		
		
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
