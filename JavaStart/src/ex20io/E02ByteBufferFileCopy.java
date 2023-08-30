package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E02ByteBufferFileCopy
{

	public static void main(String[] args)
	{
		try
		{
			InputStream in = new FileInputStream("src/ex20io/npp.8.4.5.portable.x64.zip");
			OutputStream out = new FileOutputStream("src/ex20io/npp.8.4.5.portable.x64_copy.zip");
			
			int copyByte =0;
			int readLen;
			//1Kbyte씩 파일의 내용을 읽어 저자아기 위한 버퍼생성(byte형 배열)
			byte buffer[] = new byte[1024];
		
			//파일 내용 전체를 읽기 위해 무한루프 구성
			while (true)
			{
				//배열의 크기 즉 1kbyte씩 파일을 읽어온다.
				readLen = in.read(buffer);
				if(readLen==-1)
					break;
				//읽어온 내용을 파일에 입력.
				//버퍼에저장된 데이터를 인덱스0부터 readLen길이까지 저장.
				out.write(buffer,0,readLen);
				copyByte += readLen;
			}
		
			if(in!=null) in.close();
			if(out!=null) out.close();
			System.out.println("복사된 파일크기: " +copyByte+"byte");
			System.out.println("복사된 파일크기: "+(copyByte/1024)+"Kbyte");
			System.out.println("복사된 파일크기: "+(copyByte/(1024*1024))+"Mbyte");
	
			
		} catch (FileNotFoundException e)
		{
			System.out.println("파일이 존재하지 않습니다.");
			// TODO: handle exception
		}catch (IOException	 e) {
			System.out.println("Io 작업중 예외가 발생되었습니다.");
			// TODO: handle exception
		}
	}	

}
