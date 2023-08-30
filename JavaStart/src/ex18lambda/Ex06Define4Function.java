package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex06Define4Function
{

	public static void main(String[] args)
	{
		/*
		 * Function<T,E>
		 * 매개변수와 반환값을 둘다 가지고있는 apply() 추상메서드가 정의됨.
		 * 가장 많이 애용되는 함수형 인터페이스
		 * 
		 * interface<T,E>{
		 *  	E aplly(T t){
		 *  	}
		 *  }
		 *  =>T 매개변수 E 반환타입
		 */
		Function<String, Integer> func = (String s) ->{
			return s.length();
		};
		System.out.println("Lambda 문자열길이="+func.apply("Lambda"));
		System.out.println();
		
		
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		List<Human> list1 = Arrays.asList(p1,p2,p3,p4);
		
		Function<Human, Integer> getFunction = (Human h) -> {
			return h.getScore();
		};
		//마치 맵에서 value값 불러오듯이 쓸 수 있다.
		int score = getFunction.apply(p1);
		System.out.println("p1의 점수: "+score);
		
		System.out.println("###list에 저장된 객체의 점수 출력");
		for (Human human : list1)
		{
//			System.out.println(human.getName()+"의 점수:  "+getFunction.apply(human));
			System.out.println(human.getName()+"의 점수:  "+human.getScore());
			//[n]결과는 같다.
		}
	}

}
