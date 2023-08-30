import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class Ex07_FileCopy3
{

	public static void main(String[] args)
	{
		String src = "./src/Ex04_FileRead.java";
		String dst = "FileRead3.txt";

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst)))
		{
			Instant start = Instant.now();
			//1바이트씩 읽지만 내부적으로 버퍼링이되게 된다.
			int data;
			while (true)
			{
				data = in.read();
				if (data == -1)
					break;
				out.write(data);
			}

			Instant end = Instant.now();
			System.out.println("복사에 걸린 시간 : " + Duration.between(start, end).toNanos());
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
