import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06_Set
{
/*
 * Tree set 자료값 중복허용 x, 자동정렬
 */
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		set.add("orange");
		set.add("apple");
		set.add("banana");
		set.add("apple");

		System.out.println("객체 수: " + set.size());
		// 반복자를 이용한 전체출력
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();)
			System.out.print(iterator.next() + "\t");
		System.out.println();
		
		//foreach문 을 이용한 전체출력
		for (String string : set)
		{
			System.out.print(string+"\t");
		}
		System.out.println();
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
			
		}
		System.out.println();
		System.out.println("==========================");
		
		while (itr.hasNext())
		{
			String string = (String) itr.next();
			System.out.println(string);
		}
	}

}
