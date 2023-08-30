enum Human2
{
	MAN, WOMAN
}

enum Machine2
{
	TANK, AIRPLANE
}

public class Ex02_Enum
{
	public static void createUnit(Machine2 kind)
	{
		switch (kind)
		{
		//enum을 사용해 열거형을 만들때 Machine2생략가능(어차피 문자가 다름.)
		case TANK:
			System.out.println("탱크를 만듭니다");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듭니다");
			break;
		}
	}

	public static void main(String[] args)
	{
		createUnit(Machine2.TANK);
//		createUNit(Human2.MAN);//잘못된 상수 사용 : 에러
		//Machine2의 kind를 받으므로 아예 불가.
		//열거형이므로 0번,1번이 아니다.
		// 참고 : C처럼 숫자로 비교하면 에러가 난다.
//		if (Human2.MAN==0).
//		{
//			
//		}
	}
}
