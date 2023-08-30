package ex17collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Ex08AsList
{
	public static void listPrint(String title, List<String> list) {
		System.out.println("# "+title);
		//출력내용이 string이라 별도 오버리이딩 없이 내용물이 출력됌.
		//우리가 직접 정의한 클래스면 toString써야함.
		for (Object obj : list)
		{
			System.out.print(obj+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		String[] strArr = new String[] {"마린","파이어뱃","메딕","마린"};
		List<String> list = Arrays.asList(strArr);
		//Array.asList : 일반적인 배열을 List로 가져옴.
		// 값을 가져올수만 있고 수정이 불가능함.
		// 배열을 리스트로 초기화 할때 주로 씀.
		listPrint("출력1",list);
		
//		list.add("탱크");
		
		list = new ArrayList<String	>(list);
		
		boolean isAdd = list.add("탱크");
		System.out.println("add결과:" +isAdd);
		listPrint("출력2",list);
		
		System.out.println("# 출력3");
		for (Iterator iterator = list.iterator(); iterator.hasNext();)
			//for( 초깃값(이터레이터객체생성); 조건식 hasNext(); 증감식 next();
		{
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		//Set으로 들어오면서 중복값이 제거됌.
		HashSet<String> set = new HashSet<String>(list);
		list = new ArrayList<String>(set);
		listPrint("출력4(중복제거)", list);
		
	}

}
