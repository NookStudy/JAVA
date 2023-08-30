package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 * 자바 기본제공 함수형 인터페이스
 *	Predicate<T>  // test 메소드
 * 매개변수 O 리턴값 boolean
 * Supplier<T>   // get 메소드
 * 매개변수 x 리턴값 O
 * Consumer<T>	//accept 메소드
 * 매개변수 O 리턴값 X
 * Function<T,E> 	//apply 메소드
 * 매개변수 O 리턴값 O
 * 
 */
public class Ex06Define1Predicate
{

	public static void main(String[] args)
	{
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		
		Predicate<Human> pre = (Human h) ->{
			return h.getGender().equals("남");
		};
		//프레디케이트를 람다식으로 재정의
		System.out.println("p.test(p1) =>"+pre.test(p1));
		System.out.println("p.test(p2) =>"+pre.test(p2));
		
		List<Human> list1 = Arrays.asList(p1,p2,p3,p4);
		
		double	maleAvg = avg( h-> h.getGender().equals("남"),list1);
//		double	maleAvg = avg((Human h)-> h.getGender().equals("남"),list1);
		System.out.println("남자평균; "+maleAvg);
		/*매개변수의 타입 생략 가능. 근데 가독성이 떨어짐.
		 * 
		 */
	}
	
	public static double avg(Predicate<Human> ph, List<Human> li) {
		//interface 객체로 넣어야하므로 메인에서도 람다식으로 선언.
		int pCount =0;
		int tCount=0;
		for (Human human : li)
		{
			if(ph.test(human)==true) {
				pCount++;
				tCount+=human.getScore();
			}
		}
		return (double)tCount/pCount;
	}

}
