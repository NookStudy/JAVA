
public class Ex08_EnhancedFor
{

	public static void main(String[] args)
	{
		int[]arr = {1,2,3,4,5};
		
		//배열요소 전체 출력
		for (int e : arr)
		{
			System.out.print(e+" ");
			
		}
		System.out.println();
		
		int sum =0;
		
		//배열 요소의 전체 합 출력
		for (int i : arr)
		{
			sum+=i;
		}
		System.out.println("sum: "+sum);
		int c;
		
		System.out.println("배열 arr의 요소값 1 증가시키기");
		for (int b : arr)
		{
			b++;
			//변수 b의 저장된 값이 1증가하여 출련된다.
			System.out.print(b+" ");
		}
		System.out.println();
		
		System.out.println("배열 arr의 요소 재출력하기");
		for (int d : arr)
		{
			System.out.print(d+" ");
		}
		//보여주는걸로 사용해야지 이걸로 수정은 불가능하다.
		
	}

}
