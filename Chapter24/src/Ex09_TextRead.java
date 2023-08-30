import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex09_TextRead
{

	public static void main(String[] args)
	{
		try(Reader in = new FileReader("text.txt"))//문자열을 읽기 위한 입력스트림생성
		{
			//FIleReader객체를 통해 파일을한글자씩 읽어 ch 변수에 할당
			//한글자씩 읽어야 -1을 받고 탈출 가능.
			//.read()의 메소드 리턴이 int형이므로 ch를 int로 선언해주어야함.
			int ch;
			while(true) {
				ch = in.read();  //글자 읽고
				if(ch==-1)	//-1을 EOP라고 부르며 파일의 끝을 나타낸다(End of FIle)
					break;
				System.out.print((char)ch); //character로 바꿔줘야 문자로 나옴.
			}
		} catch (IOException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
