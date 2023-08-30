import java.util.Arrays;

public class Ex13_ArrayEquals
{

	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr1,arr1.length);
		//copyOf : (배열a,int b); 배열a를 int b 길이만큼
		//arr2= arr1 을 한게 아니므로 arr2와 arr1은 주소값이 다르다
	
		boolean bCheck = Arrays.equals(arr1, arr2);
		//저장 데이터 수(길이), 순서, 내용이 같을 때 True.
		//주소값 말고 실데이터를 보고 비교한다.
		System.out.println(bCheck);
	}

}
