import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Convert
{

	public static void main(String[] args)
	{
		// 매개변수로 전달된 객체들을 저장한 컬렉션 개겣의 생성 및 반환
		// 이렇게 생성된 리스트 인스턴스는 Immutable한 객체임.
		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "전우치");
//		list.add("멀린");//실행하면 에러남

		list = new ArrayList<>(list); // mutable 객체로 변환
		list.add("해리포터"); // 에러안남

		// ArrayList<E> 객체의 순환
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();)
		{
			System.out.print(iterator.next() + '\t');

		}
		System.out.println();

//		Iterator<String> itr = list.iterator();
//		// 반복자를 이용한 순차적 참조
//		// String str;
//		while (itr.hasNext())
//		{
//			//str=itr.next();
//			System.out.println(itr.next()// str
//					+ "\t");
//		}
		//이 반복자와  밑의 foreach문은 같다.
		//이 반복자를 쓰는 이유는 여기에 수정 삭제 등등을 가미할수 있기 때문.
		
		// ArrayList<E>를 LinkedList<E>로 변환. subclass를 superclass에 대입가능.
		list = new LinkedList<>(list);
		// LinkedList<E> 객체의 순환
		for (String string : list)
		{
			System.out.print(string + "\t");
		}
		System.out.println();
	}

}
