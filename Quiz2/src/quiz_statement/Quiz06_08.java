package quiz_statement;

public class Quiz06_08
{

	public static void main(String[] args)
	{
		for (int dan = 2; dan <=9; dan+=2)
		{
			for (int su = 1; su <= dan; su++)
			{
				System.out.printf("%d*%d=%d ",dan,su,dan*su);
				
			}
			System.out.println();
			
		}
	}

}
