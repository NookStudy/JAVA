interface Unit8{
	void move(String s);
	//매개변수 하나, 반환형 void
}
public class Ex08_LambdaRule1
{

	public static void main(String[] args)
	{
		Unit8 unit;
		
		unit = (String s) -> {System.out.println(s);};
		unit.move("Lamdba : 줄임없는 표현 : 앞 예제 동일");
		
		unit = (String s)-> System.out.println(s);
		unit.move("Lambda : 중괄호 생략");
		
		unit = (s) -> System.out.println();
		unit.move("Lambda : 매개변수 형 생략");
		
		unit = s -> System.out.println(s);
		unit.move("Lambda : 매개변수 소괄호 생략");
		
		
	}

}
