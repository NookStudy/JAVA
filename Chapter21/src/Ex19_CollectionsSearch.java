import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex19_CollectionsSearch
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		list.add("멀린");
	
	System.out.println("정렬전%n"+list);
		
	//검색전 정렬
	Collections.sort(list);
	System.out.println(list);
	
	int idx1 = Collections.binarySearch(list, "홍길동");
	System.out.println(idx1);
	
	int idx2 = Collections.binarySearch(list, "멀린");
	System.out.println(idx2);
	
	int idx3 = Collections.binarySearch(list, "강감찬");
	System.out.println(idx3);
	int idx4 = Collections.binarySearch(list, "해리포터");
	System.out.println(idx4);
	int idx5 = Collections.binarySearch(list, "흄리포터");
	System.out.println(idx5);
	}
}
