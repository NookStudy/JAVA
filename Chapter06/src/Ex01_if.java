
public class Ex01_if
{

	public static void main(String[] args)
	{
		int num = 100;
		if (num > 50)
		{
			System.out.println("num 변수의 값이 50보다 큽니다.");

		}
		if (num > 50) // 한줄만 작성시 중괄호 생략가능
			System.out.println("num 변수의 값이 50보다 큽니다.");// if문은 여기서 종료

		// 같은줄에 작성가능. 실행문장의 끝은 세미콜론(;)으로 구분
		if (num < 50)
			;// 여기서 끝내버리면 밑의 sysout은 무조건 출력됌
		System.out.println("num 변수의 값이 50보다 큽니다.");

		if (num < 50)
			System.out.println(num); // num의 값이 궁금. but , 조건 false 이므로 비출력
		System.out.println("num 변수의 값이 50보다 작습니다.");// 아무 상관없이 출력

		if (num > 50)
		{
			System.out.println("num 변수의 값이 50보다 큽니다.");

		} else
		{
			System.out.println("num 변수의 값이 50보다 작습니다.");// 아무 상관없이 출력

		}
	}

}
