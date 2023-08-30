import java.util.Arrays;

public class Ex14_ArraySor
{

	public static void main(String[] args)
	{
		/*
		 * 배열을 선언과 동시에 초기화.
		 * 원소 갯수 = length
		 * 배열변수에 배열객체의 주소할당.
		 */
		int[] arr1 = {1,2,3,4};
		double[] arr2 ={4.4,3.3,2.2,1.1};
		String[] arr3 = {"홍길동","전우치","손오공","멀린"};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		for (int n : arr1)
			System.out.print(n+"\t");
		System.out.println();
		
		for(double d:arr2)
			System.out.print(d+"\t");
		System.out.println();
	
		for(String s:arr3)
			System.out.print(s+"\t");
		System.out.println();
	}

}
