import java.net.InetAddress;  //IP주소를 표현할 때 사요하는 
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx1
{

	public static void main(String[] args)
	{
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try
		{
			ip= InetAddress.getByName("www.naver.com");
			//getHostname() - 호스트 이름을 문자열로 반환
			System.out.println("getHostName() :"	+ip.getHostName());
//			getHostAddress() - IP주소 반환
			System.out.println("getHostAddress(): "	+ip.getHostAddress());
			
			System.out.println("toString(): "		+ip.toString());
			
//			getAddress() - InetAdderess 객체의 IP주소를 반환  +256하면 우리가 아는 IP주소
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress(): "+Arrays.toString(ipAddr));
			
			String result ="";
			for(int i=0; i<ipAddr.length;i++) {
				result +=(ipAddr[i]<0)? ipAddr[i]+256:ipAddr[i];
				result += ".";
			}
			System.out.println("getAddress()+256: " +result);
			System.out.println();
			
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
		try {
			//실제 호스트 네임과 IP 주소 얻기
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName(): " +ip.getHostName());
			System.out.println("hetHosAddress(): "+ip.getHostAddress());
			System.out.println();
		}catch (UnknownHostException e) {
			 e.printStackTrace();
		}
		try {
			//모든 IP 주소 가져오기
			ipArr = InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < ipArr.length; i++)
			{
				System.out.println("ipArr["+i+"]: "+ipArr[i]);
			}
		}catch (UnknownHostException e) {
			 e.printStackTrace();
		}
	}

}
