package ex18lambda;

interface ISchool1{
	void studyLambda(String str);
}
/*
 * 추상메서드를 포함한 인터페이스 구현시 하위에서 오버라이딩필수.
 * 
 */
class Student1 implements ISchool1{
	public Student1() {
		System.out.println("T");
	}
	@Override
	public void studyLambda(String str) {
		System.out.println(str+"을(를) 공부합니다.");
	}
}

class Seat extends Student1{
	int seatNum;
	
	public Seat() { System.out.println("s");}
	public Seat(int seatNum)
	{
		this.seatNum = seatNum;
	}
	
	
}

public class Ex01NormalClass
{

	public static void main(String[] args)
	{
		ISchool1 sch = new Student1();
		sch.studyLambda("람다식");
//		System.out.println(sch.getClass());
//		Student1 ch = new Seat();
		
	}

}
