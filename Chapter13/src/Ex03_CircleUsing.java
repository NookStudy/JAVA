public class Ex03_CircleUsing
{
	public static void main(String[] args)
	{
		com.company.area.Circle c1 = new com.company.area.Circle(3.5);
		System.out.println("반지름 3.5 원 넓이" + c1.getArea());

		com.company.circumference.Circle c2 = new com.company.circumference.Circle(3.5);
		System.out.println("반지름 3.5 원 둘레:" + c2.getCircumfrerence());
	/*
	 * 풀패키지 명을 다 박아서 선언하거나
	 * 둘중 하나는 import해서 쓰던가.
	 * 패키지가 다르면 반드시 import.
	 * 패키지도 다른데 클래스명 겹치면 풀패키지 경로 명시.
	 * 같은패키지에 클래스명 겹치는 건 어차피 불가
	 */
	
	}
}
