import java.util.ArrayList;
import java.util.List;
/*ArrayList<E> 
 * -데이터 중복사용 가능
 * - 데이터 저장 순서 보장
 * - 데이터 접근시 get(),iterator() 이용.
 * -Array이름처럼 '배열'의 특성을 가지고 있어 저징및접근 가능.
 * 탐생 또는 정렬을 자주사용하는 경우 사용.
 */
public class Ex01_ArrayList
{
	

	public static void main(String[] args)
	{
		//List가 부모 클래스 ArrayList가 자식 클래스.
		List<String> list = new ArrayList<>();
		
		//객체 저장 : 순서 있음. 중복 허용
		//add(객체) : 순차적으로 저장하면서 인덱스는 0부터부여
		//add(인덱스,객체) : 데이터 저장시 인덱스 직접부여.
		//		단, 인덱스 건너뛰면 에러.
		// 		해당인덱스에 이미 자료가 있다면 삽입.
		list.add("orange");
		list.add("apple");
		list.add("apple");
		list.add("banaan");
		
		//객체 참조
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i)+'\t');
		}
		System.out.println();
		
		//첫번째 객체 삭제
		list.remove(0);//데이터 삭제되면 순서가 다 땡겨짐.
		
		//삭제 후 객체 참조
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i)+'\t');//데이타 부를 때는 get 사용.
		}
		System.out.println();
		
		list.add(3,"mango");
//		list.add(6,"mango");//런타임 에러(인덱스 5번이 없는데 6번에 넣음.)
		list.add(list.size(),"pineapple");//마지막에 추가해버릴수 있다. 
		System.out.println("중복 저장전 객체수 : "+list.size());
		
		/*
		 *중복 저장 : List는 배열의 특성을 가지므로 데이터의 중복저장이 허용됌.
		 *동일한 데이터라 할지라도 index로 구분할 수 있기 때문이다.
		 */
		
		System.out.println(list.add("melon") ? "중복저장됌" : "중복저장 안됌"	);
		System.out.println("중복 저장 후 객체수 :"+list.size());
//		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.printf(list.get(i)+'\t');//데이타 부를 때는 get 사용.
		}
		System.out.println();
		
		boolean d = list.add("melon");
		System.out.println(d);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.printf(list.get(i)+'\t');//데이타 부를 때는 get 사용.
		}
		System.out.println();
	}
}
