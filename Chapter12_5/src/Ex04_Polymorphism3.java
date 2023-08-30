abstract class Animal //추상 클래스
{ 
	abstract void doMove(); //추상 메소드
}

class Tiger extends Animal
{
	@Override
	void doMove()	//오버라이드
	{
		System.out.println("호랑이는 산을 달립니다.");
	}
}

class Lion extends Animal
{
	@Override
	void doMove()	//추상메서드 오버라이딩
	{
		System.out.println("사자는 평원을 달립니다.");
	}
	void test() {
		System.out.println("시험파일. new method");
	}
}

public class Ex04_Polymorphism3
{
	public static void animalChoose(Animal obj)//Animal obj = new Tiger();
	{
		/*
		 * instanceof 연산자로 가능여부판단이유는
		 * 인수를 최상위인 Animal로 받고잇기때문
		 * -animal타입으로 인수 선언되면 자동 업캐스팅(형변환) 되므로
		 * 지식객체의 멤버메서드는 호출할 수 없게된다.
		 * -이 때  자식멤버메서드 호출하려면 다운캐스팅피룡
		 * -따라서 인수가 각각의 타입으로 형변환 가능한지 판단한 후 
		 * 다운캐스팅 진행하여 각 클래스의 멤버세서드를 호출할 수 있게 함.
		 */
		if (obj instanceof Tiger)
		{
			//obj가 Animal(Super)Class.
			//Tiger(Sub)Class로 강제 형변환 하는중.
			//이때 강제 형변환 가능한지 여부를 판단하기위해
			//instanceof 를 사용.
			Tiger tiger = (Tiger) obj;
			tiger.doMove();//obj확인하면 Animal 근데 이게 다시 Tiger로 
			//결론은 Tiger의 메소드가 튀어나옴.
		} else
		{
			Lion lion = (Lion) obj;
			lion.doMove();
		}
	}

	public static void main(String[] args)
	{
		Lion subclass = new Lion();
		
		System.out.println(subclass instanceof Animal);
		Animal p = subclass;
		
				
		
		Tiger tiger = new Tiger();
		animalChoose(tiger);

		Lion lion = new Lion();
		animalChoose(lion);
	}

}
