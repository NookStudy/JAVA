package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReader
{

	public static void main(String[] args)
	{
		try
		{
			//문자를 읽기위한 입력스트림 생성
			BufferedReader in = new BufferedReader(new FileReader("src/ex20io/string.txt"));
			String str;
			while(true) {
				//개행전까지 데이터를 한번에 읽어옴.(한줄씩 읽어옴)
				str = in.readLine()	;
				
				if (str==null)
				{
					break;
				}
				/*
				 * 입력시 enwLine을 통해 개행정보가 입ㄹ겨되자만,
				 * 읽어들인 무자열에는 개행정도가 포함되지 않는다.
				 * 따라서 println 쓰고 개행정보는 문자열 구분으로만 생각해야함.
				 */
				System.out.println(str);
			}
			in.close();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
