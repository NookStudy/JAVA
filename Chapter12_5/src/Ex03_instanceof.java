/*
 * instanceof
 * 인스턴스 연산자가 어떤 타입인지 판단하는 연산자.
 */
interface Cry
{
	void cry();
}

class Cat implements Cry
{
	@Override
	public void cry()
	{
		System.out.println("야옹~");
	}
}

class Dog implements Cry
{
	@Override
	public void cry()
	{
		System.out.println("멍멍!");
	}
}

public class Ex03_instanceof
{

	public static void main(String[] args)
	{
//		Cry test1 = new Cat();
		//이 경우 interface인 Cry가 Dog의 부모가 됌.
		Cry test1 = new Dog();
		if (test1 instanceof Dog)
//			if (test1 instanceof Cry) 이경우도 맞다고 나옴.
			// a instaceof A : a 인스턴스를 A클래스로 형변환 가능? T or F
			//자식의 클래스는 부모클래스로 형변환 가능하므로 트루
			//다운캐스팅도 트루뜨나???
		{
			test1.cry();
		} else if (test1 instanceof Dog)
		{
			System.out.println("고양이가 아닙니다.");
		}
	}

}
