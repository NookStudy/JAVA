interface Unit10{
	String move(); //매개변수 없음, 반환형 String
}


public class Ex10_LambdaRule3
{

	public static void main(String[] args)
	{
		//매개변수가 없으므로 비어있는 소괄호 사용.
		Unit10 unit = () ->{
			return"인간형 유닛 이동";
		};
		//일반적으로 가장 많이 쓰이는 람다식.
		System.out.println(unit.move());
	}

}
