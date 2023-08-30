
public class Ex06_substring
{

	public static void main(String[] args)
	{
		String str1 = "AppleBananaOrange";
		int num1= str1.indexOf("Banana");//Banana 시작위치 반환
		int num2= str1.indexOf("Orange");//Orange 시작위치 반환	
		
		/*
		 * substring() 
		 * 시작인데스<= '문자열' < 마지막인덱스 
		 * 문자열 반환.
		 */
		String str2 = str1.substring(num1,num2);
		System.out.println(str2);
		
		String str3 = str1.substring(num2);//이경우 끝까지
		System.out.println(str3);
	}

}
