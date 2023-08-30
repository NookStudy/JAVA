class Unit{
	String name;
	int hp;
	
	void doMove() {
		System.out.println("이동속도 10으로 이동");
	}
}

class Marine extends Unit
{
	int attack;
	//상속관계에서 오버라이딩을 목적으로 정의한 메서드
	void doMove() {
		super.doMove();//super class의 doMove다.
		System.out.println(attack+"공격");
		//기능의 추가.
	}
}

class Medic extends Unit
{
	int heal;
	
	/*
	 * @Override : 어노테이션이라 부르고, 
	 * 오버라이딩된 메서드에 추가 -> 컴파일러에게 알려줌.
	 * 생략가능.
	 */
	void doMove() {//덮어씌우기.
		System.out.println("이동속도 8으로 이동");//재정의
		System.out.println(heal+" 치유");//기능추가
	}
}

public class MyTerran
{

	public static void main(String[] args)
	{
		Marine unit1 = new Marine();
		unit1.name = "마린";//Unit class의 멤버변수 name
		unit1.hp = 100;
		unit1.attack = 20;

		Medic unit2 = new Medic();
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;

		unit1.doMove();
		System.out.println();
		unit2.doMove();
	}

}
