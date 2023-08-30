import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Ex13_Deque
{
	/*deque(Double-ended queue)
	 *  덱(deque)은 어느 쪽으로 입력하고 어느 족으로 출력하느냐에 따라
	 *  스택(stack) 이건 큐(que)건 사용가능.
	 *  특히 한쪽으로만 입력가능하게한 게 que이며 
	 *
	 * 멀티스레드 환경과 상관없이 자바에서의 Stack 은 대부분의 조건에서 성능 저하를 일으키기 때문에 사용을 지양한다. 대신에 Deque 의 구현체를 사용한다. 일반적으로 사용하는 Deque 의 구현체는 ArrayDeque 과 LinkedList 가 있다. 둘의 차이점을 살펴보자.

	-ArrayDeque 은 Deque 인터페이스의 구현체이며 크기 재설정을 할 수 있다.
	-LinkedList 는 List 의 구현체다.
	-LinkedList 는 null 요소를 추가할 수 있지만 ArrayDeque 은 불가능하다.
	-LinkedList 는 반복중에 현재 요소를 제거하는 것이 효율적이고, 
		ArrayDeque 은 양쪽 끝에서 추가, 제거가 효율적이다.
	-LinkedList 는 ArrayDeque 보다 더 많은 메모리를 소모한다.
	-메모리 소모량이 적을 때는 iterate 효율이 좋은 ArrayDeque 를 사용하고 
		스택의 사이즈가 커지거나 심한 변동이 예상될 때는 즉각적인 메모리 공간 확보를 위해 LinkedList 를 사용한다.
	 */
	

	public static void main(String[] args)
	{
		Deque<String> deq = new ArrayDeque<>();
//		Deque<String> deq = new LinkedList<>();
		
		deq.offerFirst("A");
		deq.offerFirst("B");
		deq.offerFirst("C");
		
//		//리스트 확인
		for (String string : deq)
		{
			System.out.print(string.toString()+"\t");
		}System.out.println();
		
		//앞에서 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
		System.out.println("------------------------");
		
		//뒤로넣고
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		for (String string : deq)
		{
			System.out.print(string.toString()+"\t");
		}System.out.println();
		//뒤에서 꺼내기
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		
		System.out.println("------------------------");
		//뒤로넣고
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		for (String string : deq)
		{
			System.out.print(string.toString()+"\t");
		}System.out.println();
		//앞에서 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
	}

}
