public class Ex07_ShortCircuitEvaluation
{	
	/*
	 * 논리연산자에서 앞연산으로 참거짓 판별이 끝나버리면
	 * 뒤연산은 실행조차 하지 않고 넘어감(SCE=Short Circuit Evaluation)
	 * 따라서 뒤는 garbage code가 되어버림.
	 */
	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		boolean result;

		result = ((x = x + 1) < 0) && ((y = y + 1) > 0);

		System.out.println("result = " + result);
		System.out.println("x = " + x);
		System.out.println("x = " + y + '\n');
		//y는 계산이 안됐으므로 초기값0 그대로임

		result = ((x = x + 1) > 0) || ((y = y + 1) > 0);
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		System.out.println("x = " + y);
		//동일하게 y는 계산이 안됐음. 초기값0 그대로임

	}

}
