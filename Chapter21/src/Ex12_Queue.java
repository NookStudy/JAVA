import java.util.LinkedList;
import java.util.Queue;

public class Ex12_Queue
{

	public static void main(String[] args)
	{
		Queue<String> que = new LinkedList<>();
		
		//데이터 저장
		que.offer("A");
		que.offer("B");
		que.offer("C");
		
		//무엇이 다음에 나올지 확인
		System.out.println("next: "+que.peek());
		// 첫번째 객체 꺼내기
		// 꺼내면 사라진다.
		System.out.println(que.poll());
		System.out.println(que.size()); 
		//남은 데이터 확인하기
		for (String string : que)
		{
			System.out.print(string.toString()+"\t");
		}
		System.out.println();
		System.out.println("-------------------------");
		//무엇이 다음에 나올지 확인
		System.out.println("next: "+que.peek());
		// 두번째 객체 꺼내기
		System.out.println(que.poll());
		System.out.println(que.size());

		System.out.println("next: "+que.peek());
		// 마지막 객체 꺼내기
		System.out.println(que.poll());
		System.out.println(que.size());
		System.out.println("next: "+que.peek());
	}
}
