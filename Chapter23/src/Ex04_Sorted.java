import java.util.Arrays;
import java.util.List;

public class Ex04_Sorted
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("홍길동","멀린","해리포터");
		
		//초기세팅
		list.stream()
			.forEach(n->System.out.println(n+"\t"));
		System.out.println();
		
		//사전순 정렬
		list.stream()
			.sorted()
			.forEach(n->System.out.println(n+"\t"));
		System.out.println();
		
		//역순 정렬
		list.stream()
			.sorted((s1,s2)->s2.length() - s1.length())
			.forEach(n->System.out.println(n+"\t"));
		System.out.println();
		
		//글자길이수 정렬
		list.stream()
			.sorted((s1,s2)->s2.length() - s1.length())
			.forEach(n->System.out.println(n+"\t"));
		System.out.println();
	}

}
