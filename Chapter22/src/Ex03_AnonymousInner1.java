interface Unit3
{
	void move();
}

class HumanCamp3
{
	private int speed = 10;

	public Unit3 getMarine()
	{
		class Marine3 implements Unit3
		{
			@Override
			public void move()
			{
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}

		}
		//내부클래스 사용
		return new Marine3();
	}
}

public class Ex03_AnonymousInner1
{

	public static void main(String[] args)
	{
		HumanCamp3 hc = new HumanCamp3();
		Unit3 unit = hc.getMarine();
		unit.move();
	}

}
