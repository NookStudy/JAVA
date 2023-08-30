package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Ex06HashMapMain
{

	public static void main(String[] args)
	{
		HashMap<String, String >map = new HashMap<>();
		//객체저장
		// : 객체저장시 기존에 저장된 동일한 KEY값이 존재하면 
		//		이전에 저장된 객체가 반환
		// 처음입력이라며 null값 반화나
		
		System.out.println("name이라는 키값으로 저장된 이전의 값: "
				+map.put("name","홍길동"));
		
		int number = 20;
//		map.put("age", number);//number는 int니까 안들어가지롱
		map.put("age", String.valueOf(number));//스트링으로 전환~
		map.put("gender", "남자");
		map.put("address", "남자");
		System.out.println("저장된 객체수: "+map.size());
		
		//중복저장
		System.out.println("name이라는 키값으로 저장된 이전의 값: "+map.put("name", "최길동"));;
		//name이란 키값에 최길동 value 를 새로 집어넣었더니 => 덮어쓰기됨
		//키값이 같으면 동일취급하고, 뒤의 value값은 key값의 종속변수로 취급됨.
		System.out.println("키값으로 중복저장후 객체수: "+map.size());
		
		
		//출력
		//1. 키값을 알때
		System.out.println("키값을 알때: "+map.get("name"));
		//2. 키값을 모를때
		Set<String> keys =map.keySet();
		System.out.println("[확장for문 적용]");
		for (String key : keys)
		{
			String value = map.get(key);
			System.out.println(String.format("%s:%s",key,value));
		}
		//3.Iterator
		System.out.println("[Iterator]");
		Set<String> keys2 = map.keySet(); 
		//맵의 키값만 얻어와서 Set하나 만듬
		//어차피 키값은 하나뿐이므로 Set으로 가져와도 중복걱정필요 X
		Iterator<String> it = keys2.iterator();
		//이 Set을 이터레이터로 반복
		while (it.hasNext())
		{
			String key = it.next();//키값 
			//키변수를 하나 만들어서 죄다 가져와서
			String value = map.get(key);//value값
			//키를 통해 밸류를 가져옴
			System.out.println(String.format("%s:%s", key,value));
			//키 밸류 한번에 출력. 반복.
		}
		
		//value만 얻어오기
		System.out.println("[value만 출력]");
		Collection<String> values = map.values();
		//밸류값만 가져온다음...
		for (String value : values)
		{//for문으로 반복
			System.out.println(value);
		}
		
		//존재유무확인
		System.out.println(map.containsKey("name")? "name값 있다":"name값 없다");
		System.out.println(map.containsKey("account")? "account값 있다":"account값 없다");
		System.out.println(map.containsKey("남자")? "남자 있다":"남자 없다");
		System.out.println(map.containsKey("여자")? "여자 있다":"여자 없다");
		
		//삭제
		
		System.out.println("삭제된객체"+map.remove("age"));
		System.out.println("[age키값을 삭제후 출력]");
		for (String key : keys)
		{
			System.out.println(String.format("%s:%s", key,map.get(key)));
		}
		
		//전체삭제
		map.clear();
		System.out.println("전체삭제후 객체수: "+map.size());
	}

}
