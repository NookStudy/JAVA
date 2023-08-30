/*
 * static variable(정적변수)
 * -정적변수는 프로그램시작때 초기화됨.
 * -메인 메서드 시작전에 이미 초기화되므로 메인에서 별다른 선언이 필요없다.
 */

class Cat
{
	Cat(){}
	/*
	 * 정적 멤버변수 : 객체 생성할 필요없이 클래스명으로 바로 접금가능.
	 */
	static int a = 5;//그냥 메소드에 저장되어있음
	int num = 3;//객체 생성시마다 주소내에 생성

	void printValue(int num)
	{
		this.num = num;
		System.out.println("num:" + this.num);
		System.out.println("a:" + a);
	}
}

public class Ex01_GlobalVariable
{

	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + ", " + num2);
		//앞 Cat(파랑) -> 클래스부름 |  뒷 Cat(초록)->디폴트생성자 
		Cat cat1 = new Cat();
		cat1.num = 1;	//num 값 3에서 1로 바뀜.
		cat1.a = 10;	//직접호출(근데 하지 마라.) 무튼 5에서 10으로
		//지금 이건 cat이라는 heap을 지나 static영역가서 고치고 돌아온거임.
		//그냥 바로 static의 a값을 고치면 된다.(ex]Cat.a=4;)
		//a는 cat1이라는 참조변수를 통해서 불러도 되고, 직접 불러도 되고.
//		System.out.println("직접호출 : "+Cat.a);//대문자 Cat으로 클래스에서 직접 불러옴.
		cat1.printValue(20); //매개변수값으로 num바꾸고 프린트
		System.out.println(cat1.num);
		System.out.println(cat1.a);

		Cat cat2 = new Cat();//새 객체 생성
		System.out.println("초기 num값 of cat2 :"+cat2.num);
		
		cat2.num = 2;//
		cat2.a = 11;//현재 10인상태에서 11로 바꿈.
		cat2.printValue(10);//매개변수값(10)으로 num바꾸고 프린트
		System.out.println(cat2.num);

		System.out.println(cat2.a);
		System.out.println(cat1.a);
		
		System.out.println("직접호출 : "+Cat.a);
		
		Cat.a=4;
		Cat.num=8;//불가능함
		System.out.println("직접호출 : "+Cat.a);
		//마치 같은 주소값을 가진것처럼 cat2에서 바꿨지만 cat1의 a값도 바뀌어버림.
		//a값은 heap에 저장되어있지 않고 static에 저장되어있음.
		//num값은 객체 생성시마다 3으로 고정(객체 생성마다 Heap에 생성)
		//이경우 a값에 count같은걸 넣고 올리면 객체 생성시마다 올리면서 cnt할수 있음.
		//cat1.a의 참조값은
	
	}

}
