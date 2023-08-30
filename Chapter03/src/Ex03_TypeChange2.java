public class Ex03_TypeChange2
{
	public static void main(String[] args)
	{
		int num1 = 2147483647; // 2^16 ==-2147483648 ~ 2147483647
//		int num2 = 2147483648; //범위 초과
//		long num3 = 2147483648; //long을 선언해도 초과정수는 에러
		long num4 = 2147483648L;// l을 붙여서 넘는놈이라고 말해줘야함.

//		float num5 = 1.0; //실수는 기본 double이라 f로 float이라고 명시해야함
		float num6 = 1.0f;

		double num7 = 30;
		/*
		 * 아래와 같은 오류가 있을수 있으므로 값이 너무 클때만 사용
		 * 
		 * 앞에 1byte에 아무런 값이 없을때만 형변환 할것. 
		 * 0000 0000 0000 0001 (이럴때만 형변환 함)
		 * 
		 */
		long num8 = 2147483648l;
//		int num9 = num8;//큰수의 형변환은 조심해야 함.
		int num9 = (int) num8;// 큰수의 형변환은 조심해야 함.

		System.out.println(num1);
		System.out.println(num4);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num9);// 마지막수 를 넘어가 재귀.

		/*
		 * 문자는 메모리에 저상시 아스키코드로 저장.
		 *  int연산 진행후 char로 강제변환 출력가능
		 */
		char ch3 = 'A',ch4;
		int num10=2;
//		ch4 = ch3+num10;//ch4가 char이므로에러 
		ch4 = (char)(ch3+num10);//char < int 이므로 강제형변환가능.
		System.out.println(ch4);
	}

}
