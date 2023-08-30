class Npc2
{
	public String toString()
	{
		return "This is a Npc2.";
	}
}

class Tank2
{
	public String toString()
	{
		return "This is a Tank2.";
	}
}

class Camp2 //둘 다 받기위해
{
	private Object unit;
	//object는 최상위 클래스이므로 어떤 클래스가 자식으로 들어와도 수용가능.

	public void set(Object unit)
	{
		this.unit = unit;
	}

	public Object get()
	{
		return unit;
	}
}

public class Ex02_MyGame2
{

	public static void main(String[] args)
	{
		// 종족 생성
		Camp2 human = new Camp2();
		Camp2 machine = new Camp2();

		// 게임 종족에 유닛을 생성해 담기
		// 자색 객체를 부모타입의 변수에 대입
		human.set(new Npc2());
		machine.set(new Tank2());

		// 게임 종족에서 유닛을 가져오기
		// 꺼낼 때 형변환이 필요함
		Npc2 hUnit = (Npc2) human.get();
		//겟해올 때는 형변환을 해주어야 함(현재 Camp클래스)
		Tank2 mUnit = (Tank2) machine.get();

		System.out.println(hUnit);
		System.out.println(mUnit);
	}

}
