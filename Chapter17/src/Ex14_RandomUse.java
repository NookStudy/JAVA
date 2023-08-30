import java.util.Random;

public class Ex14_RandomUse
{

	public static void main(String[] args)
	{
		/*
		 * Random 클래스는 객체 생성시 전달되는 Seed(씨앗)을 기바으로 난수생성.
		 * 만약 동일한 Seed를 사용하면 항상 같은 패턴의 난수생성->가짜난수(Pseudo-random number)
		 */
		// 매번 다른 수가 나옴
		Random ran1 = new Random();

		for (int i = 0; i < 10; i++)
		{
			System.out.print(ran1.nextInt(10) + " ");
			//nextInt 0~,N-1까지 난수 생성
		}
		System.out.println();

		Random rand2 = new Random(12);
		//가짜난수, 같은 패턴의 난수만 생성됌.

		for (int i = 0; i < 10; i++)
		{
			System.out.print(rand2.nextInt(10) + " ");
		}
		System.out.println();
		/*
		 * 추가 
		 * 씨드를 부여하려면 setSeed()메서드르르 사용. 
		 * 이때 현재시간을 밀리세컨즈 단위로 반환하는 메서드를 사용하면 편리하다.
		 * 시간은 계속 흘러가므로 항상 새로운 Seed를 생성할 수 있다.
		 */
		System.out.printf("%n# 난수생성 2 : 변화하는 시간으로 씨드지정%n");
		Random rand3 = new Random()	;
		rand3.setSeed(System.currentTimeMillis());
		//밀리세컨즈를 시드로 쓰겠다.
		for (int i = 0; i < 10; i++)
		{
			System.out.print(rand3.nextInt(100)+" ");
		}
		/*
		 * nextInt()에 인수가 없는 경우에는 음수,양수가 혼용된 난수가 생성됌.
		 */
		System.out.printf("%n# 난수생성 3 : nextInt() 인수없음.%n");
		Random rand4 = new Random()	;
		for (int i = 0; i < 10; i++)
			System.out.print(rand4.nextInt()+" ");
	}

}
