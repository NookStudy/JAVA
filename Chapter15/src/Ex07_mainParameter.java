
public class Ex07_mainParameter
{

	public static void main(String[] args)
	{//메인 String[] 는 스트링 배열이라는 뜻.
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
	}

}
