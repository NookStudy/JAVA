import java.util.Scanner;


public class MyCalculator
{
	public static void showMenu()
	{
		System.out.println("==============================================");
		System.out.println("메뉴를 선택하세요.숫자를 입력하세요.꼭이요");
		System.out.println("1.덧셈");
		System.out.println("2.뺄셈");
		System.out.println("3.곱셈");
		System.out.println("4.나눗셈");
		System.out.println("5.거듭제곱");
		System.out.println("0.종료");
		System.out.println("==============================================");
	}
	public static void addNum(int a, int b)
	{
		int result = a+b;
		System.out.printf("%d + %d = %d%n",a,b,result);
	}
	public static void SubstractNum(int a, int b)
	{
		int result = a-b;
		System.out.printf("%d - %d = %d%n",a,b,result);
			
	}
	public static void multipleNum(int a, int b)
	{
		int result = a*b;
		
		System.out.printf("%d * %d = %d%n",a,b,result);
	}
	public static void divideNum(int a, int b)
	{
		int result_quodient = a/b;
		int result_remainder = a%b;
		System.out.printf("%d / %d = %d%n",a,b,result_quodient);
		System.out.printf("%d %% %d = %d%n",a,b,result_remainder);
	}
	public static void squareNum(int a, int b)
	{
		int result =1;
		for (int i = 0; i < b; i+=1)
		{
			result *=a;
		}
		System.out.printf("%d ^ %d = %d%n",a,b,result);
	}
	//유효성 검사
	public static boolean checkNum(char ch) {
		if(ch>='0' && ch<='9') {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) throws StringIndexOutOfBoundsException
	{
		Scanner sc = new Scanner(System.in); //입력처리 객체
		showMenu();
		while(true) {
			System.out.print("메뉴를 입력하세요 :");
//			int num = sc.nextInt();
			char myChar = sc.next().charAt(0);
			//nextline으로 하면 런타임 오류. 재반복시 개행을 입력받음.
			if(!checkNum(myChar)) 
			{
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
//			int num=(int)myChar;
//			System.out.println(num);
//			int num = Character.getNumericValue(myChar);
			int num = myChar - '0';//char에서 int로 자동형변환
			if(num==0) {
				break;
//				return;
				
			}else {
				if (num>5)
				{
					System.out.println("메뉴를 잘못 선택하셨습니다.");
					continue;
				}
				
				System.out.print("첫번째 숫자 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 숫자 : ");
				int num2 = sc.nextInt();
				
				if (num==1)
				{
					addNum(num1, num2);
				}else if(num==2) {
					SubstractNum(num1, num2);
				}else if (num==3) {
					multipleNum(num, num1);
				}else if (num==4) {
					divideNum(num1, num2);
				}else if (num==5) {
					squareNum(num1, num2);
				}
					
			}
		}
		System.out.println("계산기를 종료합니다.");
		System.out.println("계산기를 종료합니다.");
		System.out.println("계산기를 종료합니다.");
			
		
	}

}
