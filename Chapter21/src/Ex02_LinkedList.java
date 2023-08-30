import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*LinkedList<E> 
 * -데이터 중복사용 가능
 * - 데이터 저장 순서 보장
 * - 데이터 접근시 get(),iterator() 이용.
 * -linked는 연결기반 자료구조. 앞의 자료구조에서 본 리스트를 구성하여 객체저장
 * -arraylistㅗ다 추가삭제가 용이하다.
 */
public class Ex02_LinkedList
{

	public static void main(String[] args)
	{
		//List가 부모 클래스 ArrayList가 자식 클래스.
				List<String>list = new LinkedList<>();
				
				//객체 저장 : 순서 있음. 중복 허용
				//add(객체) : 순차적으로 저장하면서 인덱스는 0부터부여
				//add(인덱스,객체) : 데이터 저장시 인덱스 직접부여.
				//		단, 인덱스 건너뛰면 에러.
				// 		해당인덱스에 이미 자료가 있다면 삽입.
				list.add("orange");
				list.add("apple");
				list.add("apple");
				list.add("banaan");
				
				//중간에 삽입가능
				list.add(2,"mango");
				
				//객체 참조
				for (int i = 0; i < list.size(); i++)
				{
					System.out.print(list.get(i)+'\t');
				}
				System.out.println();
				
				//첫번째 객체 삭제
				list.remove(2);//세번째데이터 삭제되면 순서가 다 땡겨짐.
				
				//삭제 후 객체 참조
				for (int i = 0; i < list.size(); i++)
				{
					System.out.print(list.get(i)+'\t');//데이타 부를 때는 get 사용.
				}
				System.out.println();
				for (String e : list)
				{
					System.out.print(e+'\t');
				}

	}

}
