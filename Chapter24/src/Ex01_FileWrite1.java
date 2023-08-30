import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_FileWrite1
{

	public static void main(String[] args)throws IOException //<=예외처리 해줘야 함
	{
		//기본 스트림
		OutputStream out = new FileOutputStream("data.txt"); //OutputStream 이것만 사용
		//스트림을 통해 데이터 보냄. path지정이 없다면 chapter24에서 진행중이므로 ch24가 루트임.
		out.write(65);	//AScII 코드 65 'A'  Lock이 걸려있는 상황
		out.close(); // 문서 닫음 반드시 해야함 그래야 lock이 풀림.
	}

}
