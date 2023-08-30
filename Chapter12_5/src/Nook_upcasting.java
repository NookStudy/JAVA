class Anima //추상 클래스
{ 
	void doMove() {
		System.out.println("check");//추상 메소드
	}
}

class Tige extends Anima
{
	@Override
	void doMove()	//오버라이드
	{
		System.out.println("호랑이는 산을 달립니다.");
	}
}

class Lin extends Anima
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
public class Nook_upcasting
{

	public static void main(String[] args)
	{
		Anima a = new Lin();
		Lin p=(Lin)a;//다운캐스팅
		//subclass객체로 명명해서 업캐스팅(자동형변환) 했기때문에 다운캐스팅 가능
//		Anima sub = new Anima();
//		Lin sup=(Lin)sub;//다운캐스팅
		//성공적으로 다운캐스팅 했으나 Java에서는 받아들이지않음.
		//자바에서 Superclass 명명후 Subclass로의 강제 형변환은 받아들여지지 않는다.
		long num = 515555555555555l;
		int in= (int)num;
		
		double nu = 515;
		int i= (int)num;
		System.out.println(in);
		System.out.println(i);
		
		
		// java.lang.ClassCastException: 
		// class Anima cannot be cast to class Lin 
		// (Anima and Lin are in unnamed module of loader 'app')
		System.out.println(a instanceof Lin);
//		System.out.println(sub instanceof Lin);
		
	}

}
