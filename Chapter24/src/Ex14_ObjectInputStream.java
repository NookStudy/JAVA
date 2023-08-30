import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex14_ObjectInputStream
{
	/*
	 * 직렬화 역직렬화.
	 * 메모리를 디스크에 저장 혹은 네트워크에 쓰려고 변환.
	 * 역직렬화는 저장된 데이터를 메모리에 쓸 수 있게 변환. 
	 */
	public static void main(String[] args)
	{
		try(ObjectInputStream ois=
				new ObjectInputStream(new FileInputStream("object.bin")))
		{
			//object깁만으로 저장되었으므로 복원시 원상태로 다운캐스팅필요.
			Ex12_Unit unit1 = (Ex12_Unit) ois.readObject();
			System.out.println(unit1.getName());
			
			Ex12_Unit unit2 = (Ex12_Unit) ois.readObject();
			System.out.println(unit2.getName());
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
