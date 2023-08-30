package ex20io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class E08StringWriter
{

	public static void main(String[] args)
	{
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("src/ex20io/string.txt"));
			
			/*
			 * write()를 통해 문자열 저장. 줄바꿈은 newLine()을 통해 처리.
			 * 각 OS별로 개행문자가 다르기 때문에 해당 메서드를 통해 줄바꿈 해야한다.
			 */
			out.write("나는 KOSMO에서 공부한다.");
			out.newLine();
			out.write("수료후 꼭 취업하겠다");
			out.newLine();
			
			
			//스트림 종료
			out.close();
			System.out.println("입력완료");
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("파일없음");
		}catch (IOException e) {
			System.out.println("IO오류");
			// TODO: handle exception
		}
	}

}
