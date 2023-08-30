class HumanCamp2{
	private int speed = 10;
	
	public void getMarine(){
		
		class Marine2{
			//HumanCamp2$1Marine2로 생성. $1이 붙게된다.
			public void move()
			{
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n",speed);
			}
		}
		
			Marine2 inner = new Marine2();
			inner.move();
		
		class Zerg1{}
		Zerg1 zergling = new Zerg1();
	}
	
		
	
}

public class Ex02_LocalInner
{

	public static void main(String[] args)
	{
		HumanCamp2 hc = new HumanCamp2();
		
		//메소드 사용과 동시에 멤버클래스 객체 생성
		hc.getMarine();
		
	}

}
