
public class Ex02_toString1
{
	public static void main(String[] args)
	{
		String name = "홍길동";
		System.out.println(name);//원래 name쓰면 주소값 나와야함
		System.out.println(name.toString());
		//홍길동 나오게함 그런데 어차피 오버라이딩되어서 그냥 위처럼 쓸수 있다.
	}
}
