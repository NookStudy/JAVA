import java.util.Arrays;

public class Ex12_ArrayCopy
{

	public static void main(String[] args)
	{
		int[] arr1 = new int[10];
		//초기화확인용 프린트
		for(int i=0; i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		System.out.println();
		
		int[] arr2 = new int[8];
		for(int i=0; i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		System.out.println();

		// 배열 ar1을 3으로 초기화
//		Arrays.fill(arr1, 3);
		int num=0;
		for (int i = 0; i < arr1.length; i++)
		{
			arr1[i] =num;
			num++;
		}

		// 배열 ar1dmf ar2로 부분 복사
		// arr1 0부터 복사해서 arr2 [3]부터 4번재까지 복사해라
		System.arraycopy(arr1, 0, arr2, 3, 4);

		// arr1 출력
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		// arr2 출력
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();

		// 배열 ar1을 ar3로 부분 복사
		//arr2에서 2<=x<5까지를 복사해라.
		int[] arr3 = Arrays.copyOfRange(arr1, 4, 7);

		// arr3 출력
		for (int i = 0; i < arr3.length; i++)
			System.out.print(arr3[i] + " ");
		System.out.println();

	}

}
