public class Ex08_DoWhile
{
	public static void main(String[] args)
	{
		int num = 0;
		int count = 0;

		do
		{
			num++;
			if ((num % 5) != 0)
				continue;
			if ((num % 7) != 0)
				continue;
			count++;
			System.out.println(num);
		} while (num < 100);//<-문장의 끝에 세미콜론이 들어간다.

		System.out.println("count: " + count);
	}
}
