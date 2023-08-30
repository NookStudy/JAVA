import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Ex16_TreeMapKeySet
{

	public static void main(String[] args)
	{
		/*
		 * Treemap
		 * key값 순서대로 정렬
		 * 저장이 오래걸림.
		 */
		TreeMap<String, Integer> map = new TreeMap<>();
		
		//키 - 밸류 기반 데이터 저장
		map.put("홍길동", 20);
		map.put("전우치", 25);
		map.put("손오공", 27);
	
		//키만 담고 있느 ㄴ컬렉션 인스턴스ㅡ 생성
		Set<String> ks = map.keySet();
		
		//전체 키 출력
		for (String string : ks)
		{
			System.out.print(string+"\t");
		}
		System.out.println();
		
		//전체 밸류 출력
		for (String string : ks)
		{
			System.out.println(map.get(string).toString()+"\t");
		}
		//전체 밸류출력 <= 반복자 기반이므로 수정가능.
		//이터레이터로 키값 쪼개서 맵.get으로 밸류 불러와서 출력
		for (Iterator<String> iterator = ks.iterator(); iterator.hasNext();)
		{
			System.out.println(map.get(iterator.next()).toString()+"\t");
		}
		System.out.println();

	}

}
