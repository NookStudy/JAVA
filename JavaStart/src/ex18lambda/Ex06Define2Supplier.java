package ex18lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ex06Define2Supplier
{
	/*
	 * Supplier<T> 공급자
	 * 매개변수X 리턴값O. 메서드 : get
	 */
	public static List<Integer> makeRandomNum(Supplier<Integer> s, int cnt){
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < cnt+1; i++)
		{
			li.add(s.get());
		}
		return li;
	}
	
	public static void main(String[] args)
	{
		Supplier<Integer> sup = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		//추상메스드인 get 호출
		int rNum = sup.get();
		System.out.println("생성되난수="+rNum);
		
		List<Integer> list = makeRandomNum(sup, 10);
		System.out.println(list);
		//포문출력
		for (Integer integer : list)
		{
			System.out.printf("%d ",integer);
		}
		//이터레이터 출력
		System.out.println("### 이터레이터로 출력3");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() +" ");
		}

		
	}

}
