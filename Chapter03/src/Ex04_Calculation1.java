
public class Ex04_Calculation1
{

	public static void main(String[] args)
	{
		byte num11 = 1;
		byte num12 = 1;
//		byte result1 = num11 + num12;//계산결과 int~~
		byte result1 = (byte)(num11 + num12);
		
		short num21 = 1;
		short num22 = 1;
//		short reult21 = num21 + num22;//error
		long result21 = num21 + num22;//long은 크니까 자동형변환가능
		
		short result22 = (short)(num21+num22);
		
		
		System.out.println(result21);
		System.out.println(result22);
		System.out.println(result1);
				
	}

}
