import java.io.FileInputStream;
import java.io.InputStream;

public class Ex04_FileRead
{

	public static void main(String[] args)
	{
		try(InputStream in = new FileInputStream("data.txt")) //자식을 부모에게 대입
		{
			//데이터를 1byte로 읽음
			int dat = in.read();
			//십진수로 출력
			System.out.println(dat); //dat 그대로 출력
			//글자로 출력
			System.out.printf("%c \n",dat); //dat을 printf문으로 char형으로 출력
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
