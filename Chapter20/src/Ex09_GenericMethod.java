class MyData
{
	public static <T> T showData(T data)
	{
		if (data instanceof String)
		{
			System.out.println("String");
		}else if (data instanceof Integer) {
			System.out.println("Integer");
			
		}else if (data instanceof Double)
		System.out.println("Double");
		
		return data;
	}
}
public class Ex09_GenericMethod
{

	public static void main(String[] args)
	{
		//앞에 제네릭으로 T를 박아두면 뒤에 매개변수도 알아서 따라옴.
		MyData.<String>showData("Hello World");
		MyData.showData("Hello World");//생략해도 상관없음.
		MyData.showData(1);
		MyData.showData(1.0);
	}

}
