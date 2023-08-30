import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
 * 게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

 */
public class QuRockPaperScissors
{

	public static void main(String[] args) throws IOException
	{
		int user;
		int com;
		int a;
		Random rnd = new Random();
		com = rnd.nextInt(3) + 1;
//		System.out.println(com);//난수확인0

		/*
		 * Rock = 1 Scissor = 2 Paper = 3
		 */
		Scanner sc = new Scanner(System.in);
		int exitCode;
		while(true)
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
				user = sc.nextInt();
				if (user == 1)
				{
					if (com == 2)
					{
						System.out.println("승리");
					} else if (com == 3)
					{
						System.out.println("패배");
					} else
					{
						System.out.println("무승부");
					}
				} else if (user == 2)
				{
					if (com == 2)
					{
						System.out.println("무승부");
					} else if (com == 3)
					{
						System.out.println("승리");
					} else
					{
						System.out.println("패배");
					}
				} else if (user == 3)
				{
					if (com == 2)
					{
						System.out.println("패배");
					} else if (com == 3)
					{
						System.out.println("무승부");
					} else
					{
						System.out.println("승리");
					}
				} else
				{
					System.out.println("다시 입력 해주세요!!");
				}
			}	
			System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) :");
			sc.nextLine();
			exitCode = sc.nextInt();
			if(exitCode==1)
			{	
				continue;
			}else if (exitCode==0) {
				System.out.println("Game Over");
				break;
			}
			
		} 
//잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요…..
//");
		
	}
}
