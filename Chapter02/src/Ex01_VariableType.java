public class Ex01_VariableType
{
	public static void main(String[] args)
	{
		byte	num1 = 1;	//1BIT	2^8				  0000 0001 메모리1칸
//		byte num; //생성한다
//		num = 1; //초기화한다
		short	num2 = 1;	//2BIT	2^16	0000 0000 0000 0001 메모리2칸
		//2칸짜리 short을 1칸짜리 byte로 강제형변환 불가(다른칸에 데이터존재시)
		int		num3 = 1;	//3BIT	2^32
		long 	num4 = 1;	//4BIT	2^64

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
