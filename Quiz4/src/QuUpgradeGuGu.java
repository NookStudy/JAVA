
public class QuUpgradeGuGu
{

	public static void main(String[] args)
	{
		for (int dan = 2; dan <= 9; dan++)
		{
			System.out.printf("%d x %d = %d",dan,1,dan*1);
			System.out.println();
			for (int su = 1 ; su < 9; su++)
			{
				System.out.printf("%d ",dan);
				for (int show = 0; show < su; show++)
				{
					System.out.printf("x %d ",dan);
				}
				
				System.out.printf("= %d",(int)Math.pow(dan, su+1));
				System.out.println();
			}
		}

	}

}


//for (int dan = 2; dan <=9; dan+=2)
//{
//	for (int su = 1; su <= dan; su++)
//	{
//		System.out.printf("%d*%d=%d ",dan,su,dan*su);
//		
//	}
//	System.out.println();
//	
//}
