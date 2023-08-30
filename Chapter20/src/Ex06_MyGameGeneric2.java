class Npc6
{
	@Override
	public String toString()
	{
		return "this is a Npc6";
	}
}

class Tank6
{
	@Override
	public String toString()
	{
		return "This is a Tank6.";
	}
}

class Camp6<T> // <>다이아몬드 연산자추가. 타입변수를 추가.
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

public class Ex06_MyGameGeneric2
{

	public static void main(String[] args)
	{
		Camp6<Npc6> human = new Camp6<>();// 뒤쪽은 추론가능하므로 자바7부터 생략
		Camp6<Tank6> machine = new Camp6<>();

		// 게임 종족에 유닛을 생성해 담기
		// 우리가 만든 유닛을 넣어야 하는데....
		human.set(new Npc6()); // <-- human.set(new String("난 공룡")
		machine.set("난 공룡"); // 여기 타입이 Tank6타입인데 왜 스트링 넣고 그르냐 제대로 넣어라
		// 이렇게 화면에서 오류 집어주기 때문에 매우 편한것!

		Npc6 hUnit = human.get();
		Tank6 mUnit = machine.get();

		System.out.println(human.get());
		System.out.println(machine.get());
	}
}
/*
 제네릭의 장점
 	- 중복된 코드의 결합과 간소화.
 	- 데이터를 가져올 때 형변환 없이 가져올 수 있음.
 	- 데이터 대입시 다른 자료형이 대입되는것을 방지 =>강한 자료형 체크
 	
 */
