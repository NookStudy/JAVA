interface Unit9{
	int calc(int a, int b);
}
public class Ex09_LambdaRule2
{

	public static void main(String[] args)
	{
		Unit9 unit;
		unit = (a,b) -> {return a+b;}; // 기본사용
		//unit = a,b -> {return a+b;}; //앞쪽 소괄호 생략불가
		//unit = (a,b) -> return a+b;; //뒤쪽 중괄호 생략불가
		int num = unit.calc(10, 20);
		System.out.println(num);
		//반환값이 int니까 변수만들어서 집어넣음
		
		unit = (a,b) -> a-b;
		System.out.println(unit.calc(20, 10));
		System.out.println(unit.calc(20, 10));
	
		
		unit = (a,b)->a*b; // 뒤쪽 중괄호와 return 생략가능
		System.out.println(unit.calc(10, 20));	//변수로 안받고 바로 사용가능
	}
}
//메서드 몸체에 해당하는 내용이 return 문이라면
//그 문장이 하나이더라도 중괄호의 생략이 불가능하다.