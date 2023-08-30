package ex20io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class E07FileReaderStream
{

	public static void main(String[] args)
	{
		try
		{
			char[] cbuf = new char[10];
			int readCnt;
			
			//txt파일을 대상으로 문자입력 스트림 생성
			Reader in = new FileReader("src/ex20io/alpha.txt");
			
			//배열 cbuf의 앞에서부터 최대 10개의 문자를 읽어 readcnt에 입력
			readCnt = in.read(cbuf,0,10);
			//출력
			for (int i = 0; i < readCnt; i++)
			{
				System.out.println(cbuf[i]);
			}
			in.close();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("파일없음");
			// TODO: handle exception
		}catch (IOException e) {
			System.out.println("IO오류발생");
			// TODO: handle exception
		}
	}

}
