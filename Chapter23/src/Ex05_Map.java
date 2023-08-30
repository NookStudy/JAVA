import java.util.Arrays;
import java.util.List;

public class Ex05_Map
{
	/*
	 * map:
	 * 	요소들을 특정조건에 해다하는 값으로 변환해 줍니다.
	 * 	요소들을 대,소무자 변형 등 의 작업을 하고 싶을 때 사용가능
	 */
	
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("apple","banana","orange");//immutable list
		
		list.stream()
			.map(s->s.toUpperCase())//대문자로 변환
			.forEach(n-> System.out.print(n+'\t'));
		System.out.println();
		
		System.out.println(list);
		//list는 변화하지 않았음. 스트림으로 변환해서 보여줬을 뿐.
	}
	
	
}
