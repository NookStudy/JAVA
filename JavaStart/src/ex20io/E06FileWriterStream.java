package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//윈도우 및 리눅스에서 읽을수 있는 파일로 인코딩. 여태한거는 자바는 문제없는데 OS에서 문제생김
public class E06FileWriterStream
{
	/*
	 * 자바는 유니코드를 기반으로 문자를 저장함.
	 * 아래는 문자스트림을 기반으로 해당 OS의 인코딩방식에 맞춰 문자를 텍스트파일에 저장한다.
	 */

	public static void main(String[] args)
	{
		try
		{
			char ch1 = 'A';
			char ch2 = 'Z';
			
			Writer out = new FileWriter("src/ex20io/alpha.txt");
			/*
			 * alpha.txt파일을 대상으로 문자 출력스트림 생성. 파일이 없으면 생성
			 */
			out.write(ch1);
			out.write(ch2);
			out.close();
		} catch (IOException e)
		{
			System.out.println("문자스트림 작업중 오류발생");
			// TODO: handle exception
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
