package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex03ArrayList1
{

	public static void main(String[] args)
	{
		/*
		 * ArrayList와 나머지 컬렉션드은 데이터를 저장하는 내부적인 자료구조만 다를뿐
		 * 사용법은 100% 동일하다.
		 */
		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
//		Vector<String> list = new Vector<String>();
		
		
		//객체저장
		// add(객체): 순차저장, 인덱스는0부터
		//add(index i, Object obj) : 데이터 저장시 인덱스를 직접부여.
		// 			단, 인덱스를 건너뛰면 에러.
		//			해당인덱스에 이미 객체가 있으면 삽입(끼워넣기) 됌.
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3,"워너원");
//		list.add(5,"소방챀ㅋ");
		//리스트 사이즈를 넘어가기 때문에 런타임오류.
		list.add(list.size(),"오마이걸");
		/*
		 * list.size() :컬렉션에 저장된 객체의 갯수 반환.(length와 동일)
		 */
		list.add(list.size(),"방탄소년단");
		System.out.println("중복 저장전 객체수"+list.size());
		
		
		//중복저장
		// list는 배열의 특성을 가지므로 데이터 중복저장 허용.
		// 같은데이터여도 인덱스로 구분
		// add()는 추가성공시 true반환.
		System.out.println(list.add("트와이스")?"중복저장됨":"중복저장안됨");
		System.out.println("중복 저장후 객체수: "+list.size());
		
		/*
		 * 컬렉션 출력의 3가지 방법. for, foreach, Iterator
		 */
		//출력
		System.out.println("\n[일반for문 사용]");
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n[확장for문 사용]");
		for (String obj : list)
		{
			System.out.print(obj+" ");
		}

		//Iterator
		System.out.println("\n[반복자(ITerator) 사용]");
		java.util.Iterator<String> itr = list.iterator();
		while (itr.hasNext())//다음게 없으면 false
		{
			System.out.print(itr.next()+" ");//하나씩 불러오기
		}
		//Iterator 제네릭 타입 생략가능.
		
		System.out.println("\n[for반복자(ITerator) 사용]");
		for (Iterator iterator = list.iterator(); iterator.hasNext();)
		{
			System.out.print(iterator.next()+" ");
		}
		System.out.println("\n======================");
		
		//덮어쓰기
		list.set(4, "오마이걸>덮어쓰기");
		for (Object obj : list)
		{
			System.out.println(obj+" ");
		}
		System.out.println("\n======================");
	
		//포함여부확인
		System.out.println(list.contains("빅뱅")?"빅뱅 있음":"빅뱅 없음");
		System.out.println(list.contains("블랙핑크")?"블랙핑크 있음":"블랙핑크 없음");
		
		//삭제 방법1
		//인덱스에서 삭제
		Object obj = list.remove(2);
		System.out.println("삭제된객체: "+obj);
		
		//삭제 방법2
		//
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index="+index);
		list.remove(index);
		
		//삭제 방법	3
		System.out.println(list.remove("방탄소년단")?"삭제성공(방탄)":"삭제실패(방탄)");
		System.out.println(list.remove("오마이걸")?"삭제성공(마이걸)":"삭제실패(마이걸)");
		System.out.println("삭제 후 출력");
		for (Object ob : list)
		{
			System.out.println(ob+" ");
		}
		System.err.println();
	}
}
