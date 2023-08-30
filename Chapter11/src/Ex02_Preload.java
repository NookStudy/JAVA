import java.util.Random;

public class Ex02_Preload
{
	static int num;
//	int num;//이렇게 선언하면 불가능함. 랜덤이 스태틱영역에서 돌아가기 때문.
	
	static 
	{//스태틱 선언이므로 메인 실행전에 Random이 먼저 돈다
		Random rand= new Random();
		num=rand.nextInt(100);
	//여기서 rand는 지역변수이다.
	}
	public static void main(String[] args)
	{
		System.out.println(num);
		//num은 전역변수이므로 가져올수 있음.
	}

}
