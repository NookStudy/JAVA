import java.io.*;
import java.net.*;
import java.util.*;

public class MultiServer7
{
	ServerSocket serverSocket = null;
	Socket socket = null;
	Map<String,PrintWriter> clientMap;

	//생성자
	public MultiServer7() {
		clientMap = new HashMap<String,PrintWriter>();
		Collections.synchronizedMap(clientMap);
	}
	

	public void init()
	{	
		try
		{
			serverSocket = new ServerSocket(9999);
			System.out.println("서버가 시작되었습니다.");
			
			//소켓접속시마다(유저입장때마다)
			while (true)
			{
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress()+":"+socket.getPort());
				
				Thread msr = new MultiServerT(socket); //쓰레드 생성
				msr.start();//쓰레드 시동
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}finally {
			try
			{
				serverSocket.close();
			} catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}
	}
	//접속자 리스트 보내기
	public void list(PrintWriter out)
	{
		//출력스트림을 순차적으로 얻어와서 해당 메세지를 출력한다.
		Iterator<String> it = clientMap.keySet().iterator();
		String msg = "사용자 리스트[";
		while (it.hasNext())
		{
			msg+= (String)it.next()+",";
		}
		msg = msg.substring(0,msg.length()-1)+"]";
		try
		{
			out.println(msg);
		} catch (Exception e)
		{
		}		
	}
	
	//접속된 모든 클라이언트들에게 메세지 전달
	public void sendAllMsg(String msg, String name)
	{
		//출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator it = clientMap.keySet().iterator();
		
		while(it.hasNext()) {
			try
			{
				PrintWriter it_out = (PrintWriter) clientMap.get(it.next());
				if (name.equals(""))
				{
					it_out.println(msg);
				}else {
					it_out.println(name+" > "+msg);
				}
			} catch (Exception e)
			{
				System.out.println("예외: "+e);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		//서버객체 생성.
		MultiServer7 ms = new MultiServer7();
		ms.init();			
	}
	//////////////////////////////////////////////////
	//내부클래스
	//클라이언트로 부터 읽어온 메시지를 다른 클라이언트(socket)에 보내는 역할을 하는 메소드
	class MultiServerT extends Thread
	{
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		String name = "";
		
		//생성자
		public MultiServerT(Socket socket) {
			this.socket=socket;
			try
			{
				out = new PrintWriter(this.socket.getOutputStream(),true);
				in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			} catch (Exception e)
			{
				System.out.println("예외: "+e);
			}
		}
		@Override
		public void run() {
			String s = "";
			try
			{
				out.println("대화방에 오신걸 환영합니다. 닉네임을 입력해주세요.");
				name = in.readLine();
				System.out.println("["+name+"] 님이 대화방에 입장하셨습니다.");
				//현재 객체가 가지고 있는 소켓을 제외하고 다른 소켓(클라이언트)드에게 접속을 알림
				sendAllMsg(name+"님이 입장하셨습니다.", "");
				
				out.println("["+name+"] 님이 대화방 입장.");
				//해쉬맵에 키를 name으로 출력스트림 객체를 저장
				clientMap.put(name, out);
				System.out.println("현재 접속자 수: "+clientMap.size()+"명");
				
				//입력스트림이 null이 아니면 반복
				while (in!=null)
				{
					s=in.readLine()	;
					
					if(s.equals("q")||s.equals("Q"))
						break;
					
					System.out.println(name+" > "+s);
					if(s.equals("/list"))
						list(out);
					else
//					out.println(name+">"+s);
					sendAllMsg(s,name);
				}
				System.out.println("쓰레드 종료");
			} catch (Exception e)
			{
				System.out.println("예외: "+e);
			} finally {
				//예외발생시 퇴장. 해쉬맵에서 해당 데이터 제거.
				//보통 종료하거나 나가면 java.net.SocketException:예외발생
				clientMap.remove(name);
				sendAllMsg(name+"님이 퇴장하셨습니다", "");
				System.out.println("현재 접속자 수는"+clientMap.size()+"명 입니다.");
				try
				{	
					in.close();
					out.close();
					
					socket.close();
				} catch (Exception e2)
				{
					e2.printStackTrace();
				}
			}
		}
	}
	/////////////////////////////////////////////////////////////////////////////
}
