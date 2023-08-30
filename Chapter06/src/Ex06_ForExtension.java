public class Ex06_ForExtension
{
	public static void main(String[] args)
	{
		// 2의 배수 출력
		// for문 밖에서 변수 지정시 for문 내에서 지역변수로 사용 가능하다.
		// i를 메인의 변수 입력했으므로 for문이 끝나도 유지
		int i = 0;
		for (; i < 10; i++)//선언초기식 생략
		{
			if (i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		i = 0;//init
		for (; i < 10;)
		{
			if (i % 2 == 0)
				System.out.print(i + " ");
			i++;//증감식을 안에다가. for문내에서 돌기때문에 상관은 없다.
		}
		System.out.println();

		//if문 없이 바로 2씩증가하게
		for (int j = 0; j < 10; j = j + 2)// 증감식 대신 연산수식 j+=2가 간결.
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}
}
