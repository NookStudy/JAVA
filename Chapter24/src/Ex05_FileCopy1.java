import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

public class Ex05_FileCopy1
{

	public static void main(String[] args)
	{
		String src = "./src/Ex04_FileRead.java";
		String dst = "FileRead1.txt";
		
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst))
		{
			//시작한 현재 시간을 구함.
			Instant start = Instant.now();//Instant 시간 관련함수
			
			int data;		//1byte씩 읽음 비용이 많이 듬
			while (true)	//data를 읽음
			{
				data = in.read();
				if(data == -1)		//마지막 data 확인하기. 더 이상 못 읽으면 -1 반환.
					break;			//중단
				out.write(data);	//파일에 저장
			}
			
			//총 복사한 시간체크. 끝나는 현재 시간을 구함.
			Instant end = Instant.now();
			System.out.println("복사에 걸린 시간:"
						+ Duration.between(start, end).toNanos());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
