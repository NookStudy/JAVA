package quiz_statement;

import java.util.InputMismatchException;
import java.util.Scanner;

// 학생 한명의 전체 평균점수에 대한 학점 출력.
// 국영수 점수 차례로 입력후 평균 
// 90이상 A 80이상 B 70이상 C 50이상 D 이하 ,F
public class Quiz06_02
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		while (!sc.hasNextInt()) 
		{
			sc.next();
			System.err.println("에러! 숫자가 아닙니다.");
			System.out.print("국어점수 : ");
		}	
		int kor = sc.nextInt();
		if (kor > 100 || kor < 0)
			System.out.println("잘못된 값을 입력하셨습니다.");
		
		System.out.print("영어점수 : ");
		while (!sc.hasNextInt())
		{
			sc.next();
			System.err.println("에러! 숫자가 아닙니다.");
			System.out.print("영어점수 : ");
		}
		int eng = sc.nextInt();
		if (eng > 100 || eng < 0)
			System.out.println("잘못된 값을 입력하셨습니다.");

		System.out.print("수학점수 : ");
		while (!sc.hasNextInt())
		{
			sc.next();
			System.err.println("에러! 숫자가 아닙니다.");
			System.out.print("수학점수 : ");
		}
		int mat = sc.nextInt();
		if (mat > 100 || mat < 0)
			System.out.println("잘못된 값을 입력하셨습니다.");

		double avg = (kor + eng + mat) / 3;

		if (avg >= 90 && avg <= 100)
		{
			System.out.println("A학점입니다.");
		} else if (avg < 90 && avg >= 80)
		{
			System.out.println("B학점입니다.");

		} else if (avg < 80 && avg >= 70)
		{
			System.out.println("C학점입니다.");

		} else if (avg < 70 && avg >= 50)
		{
			System.out.println("D학점입니다.");

		} else if (avg < 50 && avg >= 0)
		{
			System.out.println("F학점입니다.");

		} else if (kor > 100 || kor < 0 || eng > 100 || eng < 0 || mat > 100 || mat < 0)
		{
			System.out.println("잘못된 값을 입력하셨습니다.");
		} else
		{
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
	}

}
