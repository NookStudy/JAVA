abstract class Human
{
	abstract void print(); //오버라이딩이 목적인 메서드
}

class Man extends Human
{
	@Override
	void print()
	{
		System.out.println("남자 생성");
	}
}

class Woman extends Human
{
	@Override
	void print()
	{
		System.out.println("여자 생성");
	}
}

public class Ex02_Polymorphism2
{
	public static Human humanCreate(int kind)
	{	//Human(Super)클래스로 정의
		if (kind == 1)
		{
			//Human m = new Man();
			//return m;
			return new Man();//자동형변환
		} else
			//Human w = new Woman();
			//return w;
		{
			return new Woman();
		}

	}

	public static void main(String[] args)
	{
		//생성된 객체가 남자인지 여자인지 중요하지 않고
		// 난 생성된 객체의 프린트만 쓸거다.
		// 남자애면 남자애 기능
		//여자애면 여자애 기능을 할 것이다.
		Human h1 = humanCreate(1);
		//Human h1 = new Man();//자동 형변환
		//h1의 클래스는 Human이지만 업클래스했으므로 
		//Man(sub)의 메소드를 사용하게됨.
		h1.print();
		Human h2 = humanCreate(2);
		h2.print();
	}

}
