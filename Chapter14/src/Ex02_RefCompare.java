public class Ex02_RefCompare
{
	public static void main(String[] args)
	{
		String str1 = new String("자바프로그래밍");
		String str2 = new String("자바프로그래밍");
		
		String str3 = "자바프로그래밍";
		String str4 = "자바프로그래밍";
		
		//new써서 다른 참조값(주소)
		//사실상 객체 생성에도 같은 원리가 적용임
		if(str1==str2)
			System.out.println("str1과 str2는 동일 객체 참조");
		else
			System.out.println("str1과 str2는 다른 객체 참조");
		//하나의 메모리 공유.
		if(str3==str4)
			System.out.println("str3과 str4는 동일 객체 참조");
		else
			System.out.println("str3과 str4는 다른 객체 참조");
	}

}
