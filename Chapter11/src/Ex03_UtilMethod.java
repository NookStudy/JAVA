
public class Ex03_UtilMethod
{

	public static void main(String[] args)
	{
		MyCalculator calc1 = new MyCalculator();//의미 없음.
		//객체를 생성할 필요가 없다.
		int num1 = calc1.adder(1, 2);
		System.out.println(num1);
		
		// 이미 adder가 Static에 들어가 있으므로 그냥 클래스로 바로접근. 
		int num2 = MyCalculator.adder(2, 3);
		System.out.println(num2);
	}

}
