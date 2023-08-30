
public class Ex01_StringUse
{

	public static void main(String[] args)
	{
		// 방법1. new로 생성
		//new로 생성시 동일한 문자열이라도 새로운 메모리 할당
		String str1 = new String("자바프로그래밍");
		String str2 = new String("자바프로그래밍");
		
		//더블쿼테이션 사용. 내용이 동일하면 동일주소 할당
		String str3 = "자바프로그래밍";
		String str4 = "자바프로그래밍";
		
		//스트링을 바꾸면 자동으로 주소도 바뀜. str3는 그대로.
		str4= "자바";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//문자열은 문자와 달리 내용 없이 다음과 같이 사용할 수 있습니다.
		
		String str5 = "";
		// str5와 str6는 동일함.
		String str6 = new String();
	}
	

}
