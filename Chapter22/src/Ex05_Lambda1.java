/*
인터페이스의 정의
인터페이스에는 추상메서드만 정의할 수 있다.
자동으로 public abstract가 붙게된다.
추상메서드는 구현부가 없으므로 기능이 없고 '오버라이딩'의 목적으로 생성. 
 */
/*
 * 추상메서드를 포함한 인터페이스를 구현하면 
   하위 클래스에서는 반드시 '오버라이딩'해야한다.
 * 추상메서드를 포함한 클래스는 반드시 abstract로 선언. or 부모 인터페이스의 추상메서드 재정의.
 */
interface Unit5
{
	void move(String s);
}

class Human5 implements Unit5
{
	@Override
	public void move(String s)
	{
		System.out.println(s);
	}
}

public class Ex05_Lambda1
{

	public static void main(String[] args)
	{
		/*
		 * 메서드 정의하려고 인터페이스,상속,오버라이딩, 객체생성까지 가야함.
		 * 
		 * 여기는 부모타입의 참조변수를 통해 객체를 생성후 메서드 호출중임
		 */
		Unit5 unit = new Human5();
		unit.move("Lambda : Unit5");
	}

}
