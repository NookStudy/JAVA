import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StiringDesc implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2)
	{
		//내리차순 정렬 오버라이딩
		return s2.compareTo(s1);
	}
}


public class Ex18_CollectionsSort2
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		list.add("해리포터");
		
		//오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		//비교조건있는 객체 생성
		StiringDesc cmp = new StiringDesc();
		
		//내림차순 정렬
		Collections.sort(list,cmp);
		System.out.println(list);
		
	}

}
