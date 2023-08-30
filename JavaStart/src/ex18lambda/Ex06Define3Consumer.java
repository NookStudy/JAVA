package ex18lambda;

import java.util.function.Consumer;

public class Ex06Define3Consumer
{
	/*
	 * Consumer<T>
	 * 매개변수 O 반환값 X //메서드 accept
	 * 단순한 출력결과만 표기.
	 */
	public static void main(String[] args)
	{
		Consumer<String> c1 =(String s) -> {
			System.out.println(s+"는(은) 가수입니다.");
		};
		c1.accept("케이윌");
		
		
		Consumer<String> c2 = t ->{
			System.out.println(t+"는 과일입니다.");
		};
		c2.accept("strawberry");
	}

}
