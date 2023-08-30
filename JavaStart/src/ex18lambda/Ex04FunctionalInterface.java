package ex18lambda;

@FunctionalInterface
interface ISchool4{
	void studyLambda(String str);
//	void stucdy2 Lambda(String str);//컴파일오류
}
public class Ex04FunctionalInterface
{
	/*
	 * 앞서 정의한 람다식의 참조변수는 ISchool4타입이므로
	 * 아래처럼 매개변수로 전달받은 후 추상메서든인 studyLambda호출가능
	 */
	static void execute(ISchool4 school4, String s) {
		/*
		 * 메인에서 선언한 람다식의 참조값을 받은 매개변수 :school4
		 * ISchool4 인터페이스에 입력된 추상메소드 : studyLamda(String str)
		 */
		school4.studyLambda(s);
	}

	public static void main(String[] args)
	{
		
		ISchool4 sch = str -> 
		System.out.println("ISchool4를 구현받아 정의한 람다입니다."+str);
		
		
		execute(sch, "\n람다를 매개변수로 전달합니다.");
	}

}
