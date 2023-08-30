import java.util.Scanner;

public class Ex01_ExceptionCase
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//런타임에러.검사에서도 나오지 않음.
		/*
		 * 숫자를 0으로 나눌수 없음. -> Arithmatic Exception
		 * 
		 * 숫자받는 메서드에 문자 -> InputMismatchException
		 * 
		 */
		
		int num1 = sc.nextInt();
		int num2 =10/num1;
		System.out.println(num2);
		
		//MyBook book1 = new Mybook(); //일반예외 문법적 오류가 엇ㅁ음.
		
		/*
		 * syntax(구문에러)
		 * 실행자체가 안됨. 코드로 오류  수정.
		 */
//		if(true);//여기서 끝냈으므로
//		{
//			
//		}else {}//if문이 세미콜론으로 종료되어 의미없는 else문이 됌
		
		int num =10;
		if (num==10)
		{
			System.out.println("참이다");
		} else{
			System.out.println("거짓이다");
		}
		
	}

}
