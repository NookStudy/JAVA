import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex15_HashMapKeySet
{

	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<>();

		// key -value data save
		map.put("홍길동", 20);
		map.put("전우치", 25);
		map.put("손오공", 27);

		// key only collection instance
		Set<String> ks = map.keySet();

		// print all keys
		for (String string : ks)
		{
			System.out.print(string + "\t");
		}
		System.out.println();

		// print all values
		for (String string : ks)
		{
			System.out.print(map.get(string).toString() + "\t");
		}
		System.out.println();

		// print all values by iterator
		for (Iterator<String> iterator = ks.iterator(); iterator.hasNext();)
		{
			System.out.print(map.get(iterator.next()).toString() + "\t");
		}
		System.out.println();

		// 추가
		/*
		 * 출력하기
		 *  이터레이터(Iterator)
		 *  이터레이터(ITerator)를 통해 출력할때도 
		 *  KeySet()을 통해 key값을 먼저 얻어온후 반복출력한다.
		 *  
		 */

		System.out.println("[이터레이터 사용하기]");
		//key를 통해 이터레이터 객체를 생성한다.
		Iterator<String> itr = ks.iterator();
		//key가 있는지 확인한 후...
		while(itr.hasNext())
		{
			//존재하면 키를 얻어온다.
			String key = itr.next();
			//key 를 통해 value를 추출한다.
			Integer value = map.get(key);
			System.out.println(String.format("%s:%S",key,value));
			
		}
		
		/*
		 * 객체의 존재유무 확인
		 * 	:Map 컬렉션은 key 와 value가 있으므로 해당 메서드도 2개로 나눠져있다.
		 */
		//containsKey  
		System.out.println(map.containsKey("홍길동")?"홍길동 키값 있다.":"홍길동 키값 없다.");
		System.out.println(map.containsKey("멀린")?"멀린 키값 있다.":"멀린 키값 없다.");
	  	//containsValue
	  	System.out.println(map.containsValue(20)?"20 있다.":"20 없다.");
	  	System.out.println(map.containsValue(29)?"29 있다.":"29 없다.");
		  
		System.out.println();
		
		/*
		 * 개체 삭제
		 * 	:key를 통해 삭제하고 삭제에 성공하면 해당 Value반환된다.
		 * 
		 */
		System.out.println("삭제된 객체 : "+map.remove("홍길동"));
		System.out.println("[홍길동 키값을 삭제후 출력]");
		for (String string : ks)
		{
			System.out.println(String.format("%s:%S",string,map.get(string)));
		}
		
		/*
		 * 전체삭제
		 * removeall은 없고, clear만 있음
		 */
		map.clear();
		System.out.println("전체 삭제후 객체수 : "+map.size());
	}

}
