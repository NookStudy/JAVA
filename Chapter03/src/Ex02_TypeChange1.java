
public class Ex02_TypeChange1
{/*자동 형변환 : 작은자료형의 데이타가 큰자료형에 대입할때*/
	
	public static void main(String[] args)
	{
		int num1 = 1;	//4byte 32bit
		byte num2 = 1;	//1byte	8it
		byte num3 = 127;
//		byte num4 = 128;	//2byte필요. 에러
		short num4 = 128;	//가능

		short num5 = 1;	//2byte 16bit 0000 0000 0000 0001
//		num2 = num5;//byte선언된 num2에 short인 num5 우겨넣을수 없다. 에러.
		num2 = (byte) num5; //2byte short인 num5를 1byte num2로 강제형변환.
		/*
		 * 명시적 형변환 : 범위가 큰놈을 작은곳에 쑤셔넣을때.
		 * 자료의 손실이 있으므로 잘생각하고 해야댐.
		 */
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
	}

}
