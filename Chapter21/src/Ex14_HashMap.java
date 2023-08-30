import java.util.HashMap;
import java.util.Set;

public class Ex14_HashMap
{
	/*
	 * Hash mpa<k,v>
	 * map<t> 인터페이스를 구현
	 * 키,발루의 쌍으로 객체저장.
	 * 키값은 한개. 중복되면 기존 데이터 덮어쓰기
	 * 키갑으로 검색하므로 다른컬럭션에 비해 속도가 빠르다.
	 * 저장순서는 유지되지 않음
	 */
	
	public static void main(String[] args)
	{
		//맵 컬렉션 생성. 키와 밸류를 모두 스트링
		HashMap<String, String> map = new HashMap<>()	;
		//key-value 기반 데이터 저장
		//새값이 기존과 동일한 키면 전에 저장된 객체가 반환.
		//키값에 스페이스 안된다..?
		map.put("홍길동", "010-1234-1443");
		map.put("전우치","010-4321-1446");
		map.put("손오공", "010-9876-1443");
		
		//get(key값) 으로 출력
		System.out.println("홍길동:" +map.get("홍길동"));
		System.out.println("전우치:" +map.get("전우치"));
		System.out.println("손오공:" +map.get("손오공"));

		//데이터삭제
		map.remove("손오공");
		Set<String> ks = map.keySet();
		for (String string : ks)
		{
			String str =map.get(string);
			System.out.println(str);
		}
		
		//데이터 삭제 확인
		System.out.println("손오공:" +map.get("손오공"));
		
		map.put("손오공", "010-9876-1443");
		System.out.println("손오공:" +map.get("손오공"));
		
	}

}
