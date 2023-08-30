
public class Ex01_FinalUse
{
	/*상수 : 리터럴, final로 나뉨
	 * 선언시 finlal 선언
	 */
	public static void main(String[] args)
	{
		final int MAX_NUM = 100; //선언동시 초기
		final int MIN_NUM;
//		System.out.println(MIN_NUM);//불가.
		//한번 사용전에만 초기화 화면 됀다.
		
		//코드가 길어지면 못찾을수 수도. 초기에 설정중요.
		MIN_NUM = 60;
		
		int Myscore =40;
		if (Myscore < MIN_NUM)
		{
			System.out.println("당신의 등급은 F입니다.");
		}
		
		//상수 이용: 후에 코드의 이해가 빨라짐
		//ex) 40이게 뭐지..? final상수: 아Min Num이네
		
		
	}

}
