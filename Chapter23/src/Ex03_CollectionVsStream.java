import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03_CollectionVsStream
{

	public static void main(String[] args)
	{
		int[] arr = {1,5,3,2,4};
		List<Integer> list = new ArrayList<>()	;
		
		//컬렉션 프레임워크를 이용한 방식
		//arr에서 list로 홀수만 박음
		for (int i : arr)
		{
			if(i%2==1) {
				list.add(i);
			}
		}
		//정렬
		Collections.sort(list);
		//출력
		for (int i : list)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//Stream을 이용한 방식
		Arrays.stream(arr)
			.filter(n->n%2 ==1) //홀수 filter
			.sorted()			//정렬
			.forEach(n->System.out.print(n+"\t"));	//출력.
		
		//따로 리스트를 만들 필요조차 없다. 단, arr수정은 stream 으로 불가능...하겠지?Iterator있는걸보니 가능할지도.
		System.out.println();
		
	}

}
