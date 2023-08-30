import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
/*
1byte 씩 읽어서 복사하는 것보다 1kb(1024byte)씩 읽어 저장할 수 잇는
벞퍼(buffer)를 이용하기 대문에 복사 속도가 훨씬 빨라진다.
스트림 혹은 네트워크를 통해 파일을 전송할 때도 버퍼를 사용하는 이유는
바로    이런   '속도차' 때문이다
 */

public class Ex06_FileCopy2
{

	public static void main(String[] args)
	{
		String src = "./src/Ex04_FileRead.java";
		String dst = "FileRead2.txt";
		
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst))
		{
			//배열의 크기 즉 1키로바이트씩 파일으 읽어옴
			
			byte[] buf = new byte[1024];
			//벞
			int len;
			
			Instant start = Instant.now();					
					
			while (true)
			{	//버프를 활용하여 data읽기 1024byte
				len = in.read(buf);
				if(len== -1)
					break;
				out.write(buf,0,len);
			}
			
			Instant end = Instant.now();
			System.out.println("복사에 걸린 시간: "+
						Duration.between(start, end).toNanos());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
