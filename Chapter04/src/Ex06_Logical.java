public class Ex06_Logical
{
	/*
	 *  && : and. 양쪽모두 true일때 true 나머지 false
	 *  || : or. 양쪽모두 false일때 false 나머지 true
	 */
	public static void main(String[] args)
	{
		int num1 = 11;
		int num2 = 22;
		boolean result;

		result = (num1 > 1) && (num1 < 10);
		System.out.println("1초과 10미만인가?" + result);

		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가" + result);
	}
}
