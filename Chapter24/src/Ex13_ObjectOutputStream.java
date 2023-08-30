import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex13_ObjectOutputStream
{

	public static void main(String[] args)
	{
//		직렬화된 클래스로 객체생성
		Ex12_Unit unit1 = new Ex12_Unit("Marine");
		Ex12_Unit unit2 = new Ex12_Unit("Medic");
		
		//인스턴스를 파일에 저장하기위해 출력스트림사용.
		try(ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("object.bin")))
		{
			oos.writeObject(unit1);
			oos.writeObject(unit2);
		} catch (IOException  e)
		{
			e.printStackTrace();
		}
	}

}
