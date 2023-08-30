import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01_Stream1
{

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		
		//스트림 생성
		IntStream stm1 = Arrays.stream(arr);  //IntStream <= 정수 stream
		
		//중간연산.
		IntStream stm2 = stm1.filter(n->n%2 ==1);//람다식
		//true 만 받겠다.
		
		int sum = stm2.sum();
		
		System.out.println(sum);
		
	}
}

/*
 * Data를 언제 계산하느냐 가 컬렉션이랑 스트림의 차이.
 * 컬렉션은 dvd : 영상전체 데이터를 CD에 다 다음
 * 컬렉션의 모든 모든 요소는 컬렉션에 추가하기 전에 계산이되어야 한다.
 * 반면, 스트림은 스트리임\\밍 서브스와 비슷하다.
 * 사용자가 필요로 하는 몇 ㅂ분만 미리 내려받음 스트림은 이론적으로 요청할때만 요소를 게산하는 고정된 자료구조이다.
 * 사용자가 요청하는 값만 추출하여
 */
 
