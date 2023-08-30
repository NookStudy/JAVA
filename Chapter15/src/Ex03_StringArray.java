
public class Ex03_StringArray
{

	public static void main(String[] args)
	{
		/*
		 * 객체 배열. 
		 * 객체의 참조값(주소)를 저장할 목적으로 생성한 배열.
		 * 각 배열의 값이 참조값(주소값)을 따로가짐.
		 */
		String[] name = new String[7];
		//객체배열 생성후(초기값 null)
		
		//인덱스를 통해 접근후 전부 초기화
		
		name[0] = new String("홍길동");
		name[1] = new String("전우치");
		name[2] = new String("손오공");
		name[3] = new String("강감찬");
		name[4] = new String("이순신");
		name[5] = new String("을지문덕");
		name[6] = new String("양만춘");
		/*
		 * 배열 초기화는 일반적으로 반복문(for)을 사용한다.
		 */
		
		int cnum = 0;
		//각 배열의 원소 출력
		for (int i = 0; i < name.length;//name의 배열 길이만큼(0~)
				i++)
		{
			System.out.println(name[i]);
			cnum+=name[i].length();//각배열의 문자 길이
		}
		System.out.println("총 문자의 수 : "+cnum);
	}

}
