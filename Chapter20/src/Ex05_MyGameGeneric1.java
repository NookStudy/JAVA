class Npc5
{
	@Override
	public String toString()
	{
		return "this is a Npc5";
	}
}

class Tank5
{
	@Override
	public String toString()
	{
		return "This is a Tank5.";
	}
}

class Camp5<T>//<>다이아몬드 연산자추가. 타입변수를 추가.
{
	private T unit;

	public void set(T unit)
	{
		this.unit = unit;
	}

	public T get()
	{
		return unit;
	}
}

public class Ex05_MyGameGeneric1
{

	public static void main(String[] args)
	{
		Camp5<Npc5> human = new Camp5<>();//뒤쪽은 추론가능하므로 자바7부터 생략
		Camp5<Tank5> machine = new Camp5<>();

		// 게임 종족에 유닛을 생성해 담기
		// 우리가 만든 유닛을 넣어야 하는데....
		human.set(new Npc5()); // <-- human.set(new String("난 공룡")
		machine.set(new Tank5());

		// 게임 종족에서 유닛을 가져오기
		// 꺼낼 때 당연히 게임 유닛을 기대하는데...
		Npc5 hUnit =  human.get();
		Tank5 mUnit = machine.get();

		System.out.println(hUnit);
		System.out.println(mUnit);


	}

}
