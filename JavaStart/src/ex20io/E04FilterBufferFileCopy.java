package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 * 버퍼 필터 스트림을 통한 파일복사 프로그램
 */
public class E04FilterBufferFileCopy
{

	public static void main(String[] args)
	{
		try
		{ //파일 입출력을 위한 스트림 생성
			InputStream in = new FileInputStream("src/ex20io/npp.8.4.5.portable.x64.zip");
			OutputStream out = new FileOutputStream("src/ex20io/npp.8.4.5.portable.x64_copy2.zip");
			
//			//파일과 자바 사이에서 버퍼역할을 하는 버퍼필터스트림 추가
//			BufferedInputStream bufIn = new BufferedInputStream(in);
//			BufferedOutputStream bufOut = new BufferedOutputStream(out);
			
			int copyBtye = 0;
			int bData;
			while (true)
			{
//				bData= bufIn.read();
				bData=in.read();
				
				if (bData==-1)
				{
					break;
				}
				
//				bufOut.write(bData);
				out.write(bData);
				copyBtye++;
			}
			
//			bufIn.close();
//			bufOut.close();
			in.close();
			out.close();
			System.out.println("복사된 파일크기: "+(copyBtye/1024)+"Kbyte");
			
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
