import java.util.Random;
import java.util.Scanner;

/*
 * 게임설명 : 업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

 */
public class QuUpDownGame
{

	public static void main(String[] args)
	{
		//난수 생성 및 사용자 입력을 위한 객체 생성
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int restart;
		boolean forEnd =false;
		
		//무한루프 상에서 사용자가 7번 안에 맞추는가?
		while (true)
		{
			//난수생성
			int computerNum = rnd.nextInt(1000)%100+1;
			System.err.println(computerNum);//확인용 프린트
			//총 7번 반복.
			for (int i = 1; i < 8; i++)
			{
				//사용자입력
				System.out.println("1~100까지 숫자 입력");
				int userNum = sc.nextInt();
				//성공 실패
				if (userNum>computerNum)
				{
					System.out.println("Down.더 낮은 숫자를 입력하세요");
				} else if (userNum<computerNum)
				{
					System.out.println("Up.더 높은 숫자를 입력하세요");
				}else { //if(userNum==computerNum) {
					System.out.println("맞추셨습니다!!");
					System.out.println();
					
					//사용자가 숫자를 맞추면 True로 변경
					forEnd = true;
					//for문 탈출
					break;
				}
//				else if(i==7)
//					System.out.println("모든 기회를 소진하셨습니다.");
				//재시작 FOR
			}
			//false 유지중이면 맞추지 못한 경우이므로 실패
			if(forEnd==false)
				System.out.println("당신은 실패하셨습니다. 노력하세요!");
//			while (true)
//			{
				//1과 0을 입력하지 않으면 계속 재입력을 요구한다.
				System.out.println("------------------------");
				System.out.println("게임 재시작(1), 종료(0)");
				System.out.print("재시작 여부를 입력하세요 : ");
				
				restart = sc.nextInt();
				//0,1탈출
//					if(restart== 0)
//					{
//						System.out.println("Game Over!");
//						return;
//					}
//					else if(restart==1) 
//					{
//						System.out.println("게임 재시작!");
//						break;
//					}
//					else
//					{
//						System.out.println("잘못 입력하셨습니다.");
//						continue;
//					}
				switch (restart)
				{
					case 0:
					{
						System.out.println("Game Over!");
						return;
					}
					case 1:
					{
						System.out.println("게임 재시작!");
						break;
					}
					default:
					{
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
				}
//			}
		}
	}
}
