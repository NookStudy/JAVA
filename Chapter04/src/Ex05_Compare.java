public class Ex05_Compare
{
	/*
	 * 비교 연산자. 두개의 변수를 비교.
	 * == 동치 != 비동치 >= <= 비교
	 */
	public static void main(String[] args)
	{
		System.out.println("2 >= 1 :" + (2 >= 1));
		System.out.println("2 <= 1 :" + (2 <= 1));

		System.out.println("1.0 == 1 : " + (1.0 == 1));
		//비교연산자를 사용하는 순간 형변환되버림.=>int로
		System.out.println("1.0 != 1 : " + (1.0 != 1));
	}

}
