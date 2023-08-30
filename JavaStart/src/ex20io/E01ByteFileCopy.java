package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E01ByteFileCopy
{

	public static void main(String[] args)
	{
		InputStream in = null;
		OutputStream out = null;
		int copyByte=0;
		/*
		 * IO입력시에는 많은 예외처리가 필요함.
		 * try처리로 하거나, 옆에 가로쳐서 예외처리하거나.
		 * 옆에 가로치면 close할 필요가 없음.
		 */
		try
		{
			in = new FileInputStream("src/ex20io/npp.8.4.5.portable.x64.zip");
			out = new FileOutputStream("src/ex20io/npp.8.4.5.portable.x64_copy.zip");
			int bData;
			while(true) {
				bData = in.read();
				if(bData==-1) {
					break;
				}
				out.write(bData);
				copyByte++;
			}
		
			
		} catch (FileNotFoundException e)
		{
			System.out.println("파일이 존재하지 않습니다.");
			// TODO: handle exception
		}catch (IOException	 e) {
			System.out.println("파일스트림 생성시 오류발생됌");
			// TODO: handle exception
		}finally {
			try {
			in.close();
			out.close();
			
			System.out.println("복사된 Kbyte 크기:"+(copyByte/1024));
			}
			catch (IOException e) {
				System.out.println("파일스트림닫기 오류");
				// TODO: handle exception
			}		
		}		
	}

}
