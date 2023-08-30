public class Ex04_PrefixPostfix
{
	public static void main(String[] args)
	{
		int num = 10;
		System.out.println(++num); // 증가후 출력
		System.out.println(num); // 증가됌을 확인
		System.out.println(num++); // 출력후 증가
		System.out.println(num); // 증가됌을 확인

//		int result = a++;	//초기값 없으면 의미가 없다.
//		System.out.println(result);

		// 다음처럼 사용시 좋음
//		int i=0;
//		while (i>10)
//		{
//			++i
//		}
		for (int i = 0; i < 10; i++// 요렇게 쓰임
		)
		{

		}

		int num1 = 7;
		int num2, num3;
		num2 = ++num1;
		num3 = --num1;
		System.out.println("전위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d", num1, num2, num3);

		num1 = 7;
		num2 = num1++;
		num3 = num1--;

	}
}
