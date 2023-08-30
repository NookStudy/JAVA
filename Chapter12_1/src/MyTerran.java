/*
 * 상속(Inheritance)
 * -기존 클래스에 메서드와 변수추가.
 * 자식(sub)클래스 extends 부모(super)클래스 추가 
 */
class Unit
{
	String name;
	int hp;

	void printUnit()
	{

		System.out.println("이름 : " + name);
		System.out.println("hp : " + hp);
	}
}
//Unit( super) 하나에 (Marine)( Medic) sub 둘
class Marine extends Unit
{
	int attack;

	void printMarine()
	{
		printUnit();
		System.out.println("공격력 : " + attack);
	}
}

class Medic extends Unit
{
	int heal;

	void printMedic()
	{
		printUnit();
		System.out.println("치유량 : " + heal);
	}
}

public class MyTerran
{
	public static void main(String[] args)
	{
		Marine unit1 = new Marine();
		//초기화
		unit1.name = "마린";//Unit class의 멤버변수 name
		unit1.hp = 100;
		unit1.attack = 20;

		Medic unit2 = new Medic();
		unit2.name = "메딕";
		unit2.hp = 120;
		unit2.heal = 10;

		unit1.printMarine();
		System.out.println();
		unit2.printMedic();
	}
}
