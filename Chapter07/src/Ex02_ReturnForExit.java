/*
 * -메서드는 class 내부에 정의해야함
 * -메서드 안에 또 다른 메서드 '정의' 불가
 * -함수명 = 변수명
	
	naming
	classs capital start
	method 소문자start
	상수 all capial
	
 */
public class Ex02_ReturnForExit
{
	public static void main(String[] args)
	{
		devide(4, 2);
		devide(6, 2);
		devide(8, 0);
	}

	public static void devide(int num1, int num2)
	{
		if (num2 == 0)
		{
			System.out.println("0으로 나눌수 없습니다.");
//			return;
		}
//		int cnt=0;
//		System.out.println(cnt);
		System.out.println("나눗셈 결과: " + (num1 / num2));
		//^^Nook^^if else문 쓰면 굳이 return을 안써도 잘 돌아가는 코드를 볼 수 있다.^^^
	}

}
