public class Ex10_ForInFor
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];

		int num = 1;
		
		//2차원행렬에 num++넣어주기
		for (int i = 0; i < 3; i++)
		{//사실상 1차원 행렬을 3개씩 늘어놓은것.
			for (int j = 0; j < 3; j++)
			{
				arr[i][j] = num;
				num++;
			}
		}
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
