
public class Ex05_DoubleError2
{

	public static void main(String[] args)
	{
		double dNum = 0.0;
		
		/* cpu는 기본에 실수연산 오차 존재
		 * 
		 */
		for (int i = 0; i < 1000; i=i+1)
		{
			dNum = dNum +0.1;
		}
		System.out.println(dNum);
	}

}
