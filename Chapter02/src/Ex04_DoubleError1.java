
public class Ex04_DoubleError1
{
	/*
	 * 소수점 데이터는 무조건 더블로인식
	 * 소수점 데이터를 float에 넣으려면 접미사 F,f필수
	 * 형변환도 가능하지만 자바에서는 비권장.
	 */

	public static void main(String[] args)
	{
		//정확한 값을 못찾으면 근사값을 찾음.
		double num1 = 1.0000001;
		System.out.println(num1);
		double num2 = 2.0000001;
		System.out.println(num1);
		double result =  num1 + num2;  
		//연산을 하면 정확한 값이 안나옴. 실수계산은 하지않아아야함.
		//크다 작다만 비교
		System.out.println(result);
		
		float f3 =100;
//		float f4 = 3.14;//더블인데 float으로선언 에러.
		float f5= 3.14f; 
		float f6 =(float)3.14; //강제 형변환(명시적 형변환)
		System.out.println(f6);
	}
	

}
