import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex11_BufferedReader
{

	public static void main(String[] args)
	{
		try (BufferedReader br = new BufferedReader(new FileReader("text2.txt")))
		{
			/*
			BufferedReader
			 	:Scanner와 유사.
			 	-속도는 훨씬 빠르므로 많은양의 데이터를 처리할대 유리
			 	-입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되므로
			 		데이터 처리 효율성을 높음
			 	-Enter만 경계로 인식하고 받은 데이터가 String으로 고정됨.
			 	-입력받은 데이터를 가공(형변환) 하는 작업이 필요한 경우가 대다수.
			 */
			String str;
			while (true)
			{
				//개행전까지 라인단위로 데이터를 한번에 읽음.
				//한줄씩 String으로 긁어옴.
				str = br.readLine();
				if (str == null)
					break;
				/*
				 입력시 newLine()을 통해 줄바꿈 정보가 입력.
				 읽어들인 무자열에는 포함안됌.
				 줄바꿈 하려면 println써야댐.
				 입력시의 줄바꿈 정보는 문자열을 라인별로 구분하는 용도만사용됌.
				 */
				System.out.println(str);
			}

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
