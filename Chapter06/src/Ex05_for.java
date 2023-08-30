
public class Ex05_for
{

	public static void main(String[] args)
	{
		for (int i = 2; i < 10; i++)
		{
			System.out.print((2 * i) + " ");
		}
		System.out.println();

		for (int i = 2; i < 10; i++)
			System.out.print((3 * i) + " ");
		System.out.println();

		// 중괄호 없이 작성 가능. but 비추
		for (int i = 2; i < 10; i++)
			System.out.print((4 * i) + " ");
		System.out.println();

		for (int i = 2; i < 10; i++)
//			System.out.println(i);//i 변수값이 궁금해서 출력
			System.out.print((5 * i) + " ");// 윗문에서 for문이 끝나버려서 i값 사라져서 에러
		System.out.println();
		for (int i = 2; i < 10; i++)
		{
			System.out.print(i + " ");// i 변수값이 궁금해서 출력
			System.out.print((5 * i) + "/ ");
		} // 윗문에서 for문이 끝나버려서 i값 사라져서 에러
		System.out.println();

		/*
		 * 연습문제1] 다음의 출력결과를 보이는 for문을 작성하시오
		 * 출력셜과
		 * 0	0	0	1
		 * 0	0	1	0
		 * 0	1	0	0
		 * 1	0	0	0	
		 */
		for (int i = 1; i < 5; i++)
		{
			for (int j = 1; j < 5; j++)
			{
				if (i + j == 5)
				{
					System.out.printf("%-2d", 1);
				} else
				{
					System.out.printf("%-2d", 0);
				}
			}
			System.out.println();
		}

		for (int su = 2; su <= 9; su++)
		{
			for (int dan = 2; dan <= 9; dan++)
			{
				System.out.printf("%2d*%d=%2d", dan, su, dan * su);
			}
			System.out.println();
		}

	}
}
