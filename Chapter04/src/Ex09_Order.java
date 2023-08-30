
public class Ex09_Order
{
	// println(); : 내용 출력후 줄바꿈
	public static void main(String[] args)
	{
		System.out.println();
		System.out.print("\n");// 특수명령어를 이용한 줄바꿈.
		System.out.println("-------------------");

		int num = 5;
//		char num = '5';
//		char선언시 num+'\n'은 5가 아스키코드 53이므로 더해서 63이됌

		/*
		 * print 문에서 +
		 * 1. 숫자끼리는 덧셈연산
		 * 2. string+숫자 는 단순 연결.
		 */
		System.out.println(num + '\n'); // 정수 + 아스키코드 'LF(엔터)'
		// int + byte => int 자동형변환 후 줄바꿈은 안되고 더하기가 됌.
		System.out.println("-------------------");
		System.out.println(num + "\n");

		System.out.println("3>= 2 : " + (3 >= 2));
//		System.out.println("3>=2 : " + 3 >= 2);
		// "3>=2 : " + 3 이 먼저 연산.
		System.out.println("3>=2 : " + 3 + 2);
		// 스트링 정수 정수 로 연결만 돼서 32로 표시됌 
	}

}
