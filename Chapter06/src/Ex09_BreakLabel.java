public class Ex09_BreakLabel
{
	public static void main(String[] args)
	{
		int sum = 0;

		myExit: while (true)
		{
			for (int i = 0; i < 100; i++)
			{
				sum = sum + i;
				if (sum > 2000)
				{
					System.out.printf("%d : %d\n", i, sum);
					break myExit;//반복문내에서 break, contiue를 사용할때는 조건문과 사용.
				}
			}
		}//여기로 브레이크되어 나옴.

	}

}
