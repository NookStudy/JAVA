
/**
 * @author Study02
 * 가변인자는 타입.. 변수명과 같은 형식으로 선언하며,
 * printStream클래스의 printf()가 대표적인 예이다.
 * ex) public PrintStream printf(String format,Object...args){...}
 */
public class Ex03_Varargs
{
	public static void helloEverybody(String... vargs)
	{
		for (String s : vargs) //가변인수 사용. 배열처럼 사용
		{
			System.out.print(s+'\t');
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		helloEverybody("홍길동");
		helloEverybody(new String[]{ "홍길동","전우치"});//동일
		helloEverybody("홍길동","전우치");
		helloEverybody("홍길동","전우치","손오공");
	}
}
