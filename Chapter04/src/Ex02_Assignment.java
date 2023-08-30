
public class Ex02_Assignment
{

	public static void main(String[] args)
	{
		short num = 10;
		num =10;
		num = (short) (num + 77l);//long이므로 강제형변환해야함.
		System.out.println(num);

		num += 77l;
		System.out.println(num);//복합연산자쓰면 한방~
		
		
		int nc=5;
		/*
		 * 정수 +-* 실수 => 실수
		 * n에 대입할 수 없어 에러가 발생.
		 */
		
//		n=n*2.7;//에라라라
//		n=(int)(n*2.7);//강제형변환 해줘야함
		nc*=2.7;//복합연산자쓰면 왼쪽항으로 강제형변환
		System.out.println("n의 결과값 : "+nc);
		//따블로 바꿔보면...
		double m=5;
		m*=2.7;
		System.out.println("m의 결과값 : "+m);
		
		/*
		 * 복합대입연산자 사용시 : 변수의 기존자료형 계승
		 * (int)2.7을 곱하면 .7이 버려짐.
		 */
		
		nc=5;
		nc=nc*(int)(2.7);
		System.out.println("n*(int)(2.7)의 결과값 : "+nc);
		
	}
}
