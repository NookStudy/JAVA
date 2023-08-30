
public class Ex01_Arithmetic
{

	public static void main(String[] args)
	{
		int num1 = 7;
		int num2 = 3;

		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 + num2 = " + 10);
		//10을 문자로 인식. 후에 배움..(??)
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		//몫만 나옴.강제형변환되어 0.5가 사라짐.
		System.out.println("num1 % num2 = " + (num1 % num2));
	}

}
