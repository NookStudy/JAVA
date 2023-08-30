import java.io.*;
import java.net.*;
//서버로 메세지를 전송하는 클래스
public class Receiver5 extends Thread
{
	Socket socket;
	BufferedReader in = null;
	
	//Socket을 매개변수로 받는 생성자.
	public Receiver5(Socket socket)
	{
		this.socket = socket;
		
		try
		{
			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
		} catch (Exception e)
		{
			System.out.println("예외1: "+e);
		}
	}
	
	@Override
	public void run() {
		while (in!=null) {
			try
			{
				//입력은 main 쓰레드에서 받기 때문에 다음코드는 작동하지 않음.
				/*
				  String s = sc.nextLine();
					out.println(s);
					
					if(s.equals("q")||s.equals("Q"))
						break;
				} catch (Exception e)
				{
					System.out.println("예외: "+e);
				}
				 */
				System.out.println("Thread Receive : "+in.readLine());
			}catch (java.net.SocketException ne) {
				//여기서 while문을 멈추어야 한다.
				break;
			} catch (Exception e)
			{
				System.out.println("예외2: "+e);
			}
		}
		try
		{
			in.close();
		} catch (Exception e)
		{
			System.out.println("예외3: "+e);
		}
	}
	
}
