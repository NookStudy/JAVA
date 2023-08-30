public class Ex03_PlusMinusSign
{
	public static void main(String[] args)
	{
		short num1 = -5;
		System.out.println(+num1);	//불필요
		System.out.println(-num1);	//역역산 
		System.out.println(num1);	//동일
		
		short num2 = 7;
		short num3 = (short) (+num2);	//불필요한데 int로 가버림
		short num4 = (short) (-num2);	//형변환 안하면 int
		System.out.println(num3);
		System.out.println(num4);
	}
}
