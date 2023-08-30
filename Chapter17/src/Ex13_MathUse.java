/*
 * Math 클래스
 * java.lang 패키지에 정의된 클래스
 * 메서드는 static으로 선언되어 있어 객체생성없이 클래스명으로 즉시 사용가능함.
 * Math클래스의 모든 메소드는 static으로 선언되어있음.
 * 
 */

public class Ex13_MathUse
{

	public static void main(String[] args)
	{
		System.out.println("4의 제곱근: "+Math.sqrt(4));
		System.out.println("log2(8):"+ baseLog(8,2));
		System.out.println("2의 3승 : "+Math.pow(2,	3) );
		
		System.out.println();
		System.out.println("원주율 : "+Math.PI);
		System.out.println("파이에 대한 Degree: "+Math.toDegrees(Math.PI));
		System.out.println("2파이에 대한 Degree"
				+ ": "+Math.toDegrees(2.0 * Math.PI));
		System.out.println();
	
		double radians45 = Math.toRadians(45);
		
		System.out.println("싸인 45: "+Math.sin(radians45));
		System.out.println("코싸인 45: "+Math.cos(radians45));
		System.out.println("탄젠트 45: "+Math.tan(radians45));
		
	
		System.out.println();
		System.out.println();
	}
	public static double baseLog(double x, double bae)
	{
		return Math.log(x) / Math.log(bae);
	}

}
