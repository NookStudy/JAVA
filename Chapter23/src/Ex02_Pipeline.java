import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex02_Pipeline
{

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		//pipe 라인 구성
		
//		IntStream stm1 = Arrays.stream(arr);  //IntStream <= 정수 stream
//		IntStream stm2 = stm1.filter(n->n%2 ==1);//람다식
//		int sum = stm2.sum();
//		System.out.println(sum);
		
		//이전에 비해 훨씬 짧은 코드가 되었다.
		
		int sum = Arrays.stream(arr)
				.filter(n ->n%2==1)
				.sum();
		
		System.out.println(sum);
	}

}
