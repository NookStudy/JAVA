import java.util.Random;
import java.util.Scanner;

/*
 * 업다운 게임에 예외처리를 추가하여 잘못된 입력에도 프로그램이 종료되지 않도록 구현하시오. 
입력시 숫자가 아닌 문자를 입력하는 경우
1~100 사이의 숫자가 아닌 경우

 */
public class QuUpDownException
{

	public static void main(String[] args)
	// 난수 생성 및 사용자 입력을 위한 객체 생성
	{
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int restart;
		boolean forEnd = false;

		// 무한루프 상에서 사용자가 7번 안에 맞추는가?
		while (true)
		{
			// 난수생성
			int computerNum = rnd.nextInt(1000) % 100 + 1;
			System.err.println(computerNum);// 확인용 프린트
			// 총 7번 반복.
			for (int i = 1; i < 8; i++)
			{
				// 사용자입력
				System.out.print("1~100까지 숫자 입력:");
				int userNum;
				while (true)
				{	
					while(!sc.hasNextInt())
					{
						sc.next();
						System.err.println("에러! 잘못된 값을 입력하셨습니다.");
						System.out.print("1~100까지 숫자 입력: ");
						
					}
					userNum = sc.nextInt();
					if(userNum<1||userNum>100) 
					{
					System.err.println("에러! 1~100까지의 숫자만 입력해주세요.");
					System.out.print("1~100까지 숫자 입력: ");
					continue;
					}else{
						break;
					}
				}
				// 성공 실패
				if (userNum > computerNum)
				{
					System.out.println("Down.더 낮은 숫자를 입력하세요");
				} else if (userNum < computerNum)
				{
					System.out.println("Up.더 높은 숫자를 입력하세요");
				} else
				{ // if(userNum==computerNum) {
					System.out.println("맞추셨습니다!!");
					System.out.println();

					// 사용자가 숫자를 맞추면 True로 변경
					forEnd = true;
					// for문 탈출
					break;
				}
//					else if(i==7)
//						System.out.println("모든 기회를 소진하셨습니다.");
				// 재시작 FOR
			}
			// false 유지중이면 맞추지 못한 경우이므로 실패
			if (forEnd == false)
				System.out.println("당신은 실패하셨습니다. 노력하세요!");
//				while (true)
//				{
			// 1과 0을 입력하지 않으면 계속 재입력을 요구한다.
			System.out.println("------------------------");
			System.out.println("게임 재시작(1), 종료(0)");
			System.out.print("재시작 여부를 입력하세요 : ");

			restart = sc.nextInt();
			// 0,1탈출
//						if(restart== 0)
//						{
//							System.out.println("Game Over!");
//							return;
//						}
//						else if(restart==1) 
//						{
//							System.out.println("게임 재시작!");
//							break;
//						}
//						else
//						{
//							System.out.println("잘못 입력하셨습니다.");
//							continue;
//						}
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
		}
	}

}
