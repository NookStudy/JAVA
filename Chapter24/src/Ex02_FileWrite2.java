import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
IO관련 작업에서는 많은 부분에서 예외처리가 필요하다.
이때 예외를 throws하는 것보다 try~catch로 에외처리를 해주는것을 권장한다.
예외를 무시하면 문제가 생겼을때 적절한 조치를 취하기 힘들기 때문이다.
 */
public class Ex02_FileWrite2
{

	public static void main(String[] args)
	{
		OutputStream out = null;
		
		try
		{
			out = new FileOutputStream("data.txt");
			out.write(66);	//'B' Lock이 걸린 상황
//			out.close();	//finally 구문으로 옮김.
		} catch (IOException e)
		{
			// TODO: handle exception
		}
		finally 
		{	
			/*
			try문으로 진입하여 스트림 생성 -> finally구문에서는 스트림을 닫아줌.
			*/
			if(out !=null) 
			{
				try {
				out.close();
				}
			
				catch (Exception e2) {
				// TODO: handle exception
				}
			}
		}
	
		
	}

}
