import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.Duration;
import java.time.Instant;

public class Ex08_TextWrite
{

	public static void main(String[] args)
	{
		try(Writer out = new FileWriter("text.txt"))
		{
			/*
			 * 자바는 유니코드 기반으로 문자를 저장.
			 * 아래는 문자스트림을 기바으로 해당 Os의 인코딩방식에 맞춰 문자를 저장.
			 */
			Instant start = Instant.now();
			
			for(int ch = (int)'A';ch < (int)('Z'+1);ch++)
				out.write(ch);
			
			out.write(13); //1byte로 읽음. 아스키 CR -> \r (커서를 맨앞 으로)
			out.write(10); //LF
			
			for(int ch = (int)'A'+32;ch < (int)('Z'+1+32);ch++)
				out.write(ch);
			
			out.write(13); //1byte로 읽음. 아스키 CR -> \r (커서를 맨앞 으로)
			out.write(10); //LF
			
			out.write("동해물과 백두산이 마르고 닳도록");
			out.write("\r\n");//개행문자
			out.write("하느님이 보우하사 우리나라 만세");
			out.write("\r\n");
			
			Instant e = Instant.now();
			
			System.out.println("걸린시간:"+Duration.between(start, e).toNanos());
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
