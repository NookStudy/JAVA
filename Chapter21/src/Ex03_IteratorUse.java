import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03_IteratorUse
{

	public static void main(String[] args)
	{
		List<String> list = new LinkedList<>();

		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banaan");

		for (String s : list)
		{
			System.out.print(s + '\t');
		}
		System.out.println();
		/*
		 * Iterator 사용
		 * 1. 컬렉션에 저장된 내용을 Iterator 객체에게 알려주기 위해 객체생성
		 * 2. hasNext()로 반환한 객체가 있는지 검사후 next()로 객ㅊ에반환.
		 * 3. 모든 객체가 반환되었으면 false를 통해 아웃
		 */
		// 반복자 획득
		Iterator<String> itr = list.iterator();

		// 반복자를 이용한 순차적 참조
		String str;
		while (itr.hasNext())
		{
			str = itr.next();
			System.out.print(str + '\t');

			if (str.equals("orange"))
			{
				itr.remove();
			}
		}
		System.out.println();

		// 반복자 다시 획득
		itr = list.iterator();

		// 삭제 후 결과확인
		while (itr.hasNext())
		{
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
		/*
		 * 수정하기 (덮어쓰기)
		 * 기존내용 변경.
		 */
		list.set(2,"mango>덮어쓰기");
		
		for (String string : list)
		{
			System.out.print(string+"\t");
		}
		System.out.println();
		System.out.println(list);
		/*
		 * 포함 여부 확인
		 * contains(객체) : 찾고자 하는 객체가 있는 경우 True를 반화ㅗㄴ함.
		 * 		존재여부만 확인할수 있다.
		 */
		System.out.println(list.contains("apple") ? "apple 있음" : "apple 없음");
		System.out.println(list.contains("mango") ? "mango 있음" : "mango 없음");
		/*
		 * 삭제하기
		 * 방법1 : 인덱스로 삭제
		 * 		remove(인덱스) : 인덱스를 통해 삭제를 진행한 후 삭제가 완료되면 해당 객체를 반환.
		 * 						삭제후엔 인덱스 자동 재부여. 삭제 성공시 해당객체 반환.
		 */
		//indexof를 통해 해당 객체의 인덱스를 찾은 후 삭제.
		int index = list.indexOf("mango>덮어쓰기");
		System.out.println("mango>덮어쓰기 의 index = "+index);
		list.remove(index);
		for (String string : list)
		{
			System.out.print(string +"\t");
		}
		System.out.println();
		System.out.println(list);
		/*
		 * 방법2. : 인스턴스의 참조값을 통해 삭제.
		 * 이 경우에는 삭제에 성공한 경우 true반환.
		 * 즉 boolean 타입의 반환값을 가진다.
		 */
		System.out.println(list.remove("banana")?"삭제성공":"삭제실패");
		//객체가 없으므로 삭제실패
		list.remove("apple");
		System.out.println("print after remove \"apple\"");
		for (String string : list)
		{
			System.out.printf(string+"\t");
		}
		System.out.println();
		System.out.println(list);
		
		/*
		 * 전체 삭제 
		 * 아래 개의 메서드르 ㄹ통해 데이터 전체 삭제가능
		 */
		//방법1
		list.removeAll(list);
		System.out.println("전체 삭제후 객체수:"+list.size());
		System.out.println(list);
		//방법2
		list.clear();
		System.out.println(list);
	}

}
