import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10_BufferedWriter
{

	public static void main(String[] args)
	{
		String str1 = "동해물과 백두산이 마르고 닳도록";
		String str2 = "하느님이 보우하사 우리나라 만세";
		/*
		BufferedWriter
			System.out.println();과 유사
			: 속도는 훨씬 빠르기 때문에(입력된 데이터가 바로 전달되지 않고
			버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임.
			많은 양의 데이터 처리시 유리.
		 */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("text2.txt")))
		{
			//각 os마다 개행문자 다름. newLine을 통해 줄바꿈.
			bw.write(str1,0,str1.length());
			bw.newLine();
			bw.write(str2,0,str2.length());
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
