public class Ex11_AutoBoxingUnboxing1
{
	public static void main(String[] args)
	{
		// 오토 박싱
		Integer iOBj = 10;
		Double dObj = 3.14;

		// 오토 언박싱
		int num1 = iOBj;
		double num2 = dObj;

		System.out.println(num1 + " : " + iOBj);
		System.out.println(num2 + " : " + dObj);
		
	}
}