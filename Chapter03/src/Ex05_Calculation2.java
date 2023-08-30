public class Ex05_Calculation2
{
	public static void main(String[] args)
	{
		int num31 = 1;
		int num32 = 2;
		int result3 = num31 + num32;
		System.out.println(result3);// 4byte 3

		long num41 = 1;
		long num42 = 2;
		long result4 = num41 + num42;
		System.out.println(result4);// 8byte 2

		long result5 = num31 + num41;
		System.out.println(result5);// 8byte 3
		// long이 더크므로 자동형변환

		/*
		 * 실수형에서 기본은 double 소수점있으면 무조건 double
		 */
		float num61 = 1.0f;
		float num62 = 2.0f;
		float result6 = num61 + num62;
		System.out.println(result6);// 4byte 3.0
		// float > int 라 자동형변환

		double num71 = 1.0;
		double num72 = 2.0;
		double result7 = num71 + num72; // 8byte 3.0
		System.out.println(result7);
		// double=>double

		/*
		 * 동일자료형끼리 연산하면 동일자료형으로 됌 But!! 작은+큰 => 큰. 데이터 손실 방지 단 BYTE SHORT은 int ,로 크게
		 * 들어감.(cpu특성상)
		 */
		double result8 = num61 + num71;
		// float + double => double

		System.out.println(result8);// 8byte 3
		
		//시나리오] 원하는값 출력?
		int num91 = 2147483647; //큰값은 조심해야함
		int num92 =2;
		int result9 = num91+num92;
		System.out.println(result9);
		//에러를 띄우진 않지만, 원하는 연산값은 나오지않는다.
		//result9을 long 으로 바꿔주어야함.
		
	}
}
