import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/*
 * Comparator<T> 
 * 사용자가 임의의 조건으로 정렬시키고 싶을때 사용.
 */
class MyStringComparator implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		//길이가 동일한 데이터는 추가하지 않는다.
		return s1.length() - s2.length();
	}
}
public class Ex10_Comparator
{

	public static void main(String[] args)
	{
		Set<String> tree = new TreeSet<>(new MyStringComparator())	;
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("전우치");
		tree.add("멀린");
		tree.add("해리포터");
		//compare가 lenth()로 정의되어있으므로 lenth만 보고 길이가 같으면 중복처리해버림.
		
		for (String string : tree)
		{
			System.out.println(string.toString()+'\t');
		}
		System.out.println();
	}

}
