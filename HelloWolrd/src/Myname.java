import java.text.SimpleDateFormat;
import java.util.Date;

/*//블럭주석. 코드 설명 및 타개발자에게 전달할 메세지 기술.
//컴파일에서 제외.
*/
//라인단위 주석
/*자바 구조
 * 1. 패키지 선언부 : 클래스를 종류별로 묶어서 관리
 * 		폴더로 이해.
 * 
 * 2.import 선언부 :  만든 클래스에 필요한 자바클래스를 가져다가 사용.
 * 			ctrl+t로 족보 볼수있음.
 * 3.class 선언부 : 클래스는 항상 영어대무자로 시작. 확장자는.java.
 * 			public 으로 선언되는 클래스와 파일명은 일치해야함.
 */



//import java.lang.*;를 생략해놓은 것이다. println, string등등

public class Myname
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		//오늘 날짜와 시간을 가져온다
		Date toDayofDate  = new Date();
		//ctrl + shift +O 자동임포트
		System.out.println("오늘날짜 :"+toDayofDate);
		/*
		 * SimpleDateFormat 클래스를 이용하여 주사용 날짜포맷으로 변환
		 */
		SimpleDateFormat simpledate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//simple date == 포맷을 지정해주는 변수임. 
		//MM월 mm분,dd일(DD불가) HH24시 hh 12시(12시는 am,pm을 더 병기해야함)
		String toDayString = simpledate.format(toDayofDate);
//		toDayString이라는 스트링에 toDayofDate를 simpledate포맷으로 나타낸다
		System.out.println(toDayString);
		System.out.println(1/2);
	}

}
