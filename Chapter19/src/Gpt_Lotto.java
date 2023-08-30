import java.util.Random;

public class Gpt_Lotto
{

	public static void main(String[] args)
	{

		int min = 1;
		int max = 45;
		int count = 6;

		Random random = new Random();

		System.out.println("Random 6 numbers between " + min + " and " + max + ":");

		for (int i = 0; i < count; i++)
		{
			int randomNumber = random.nextInt(max - min + 1) + min;
			System.out.printf("%d ",randomNumber);
		}

	}

}
