package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class E05FilterDataBufferStream
{

	public static void main(String[] args)
	{
		String src = "src/ex20io/dataBufferStream.bin";
		
		try
		{
			//1.파일생성을 위한 파일 출력스트림
			OutputStream out = new FileOutputStream(src);
			//2.버퍼사용을 위한 버퍼스트림
			BufferedOutputStream bufFilterOut= new BufferedOutputStream(out);
			//3. 파일에 기본자료형 데이터를 저장하기 위한 필터스트림
			DataOutputStream dataFilterOut = new DataOutputStream(bufFilterOut);
			
			//정시와 실수를 파일에 저장
			dataFilterOut.writeInt(555);
			dataFilterOut.writeDouble(55.55);
			dataFilterOut.writeInt(999);
			dataFilterOut.writeDouble(99.99);
			
			dataFilterOut.close();
			
			//3개의 스트림을 한꺼번에 생성
			DataInputStream dataFilterIn = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
			
			int intNum1 = dataFilterIn.readInt();
			double dblNum1 = dataFilterIn.readDouble();
			int intNum2 = dataFilterIn.readInt();
			double dblNum2 = dataFilterIn.readDouble();
			
			dataFilterIn.close();
			System.out.printf("저장된 정수는 %d, %d\n",intNum1,intNum2);
			System.out.printf("저장된 실수는 %.2f, %.2f%n",dblNum1,dblNum2);
			
			
		
			
		} catch (Exception e)
		{
			System.out.println("IO 예외발생");
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
