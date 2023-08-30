
public class Ex05_indexOf
{

	public static void main(String[] args)
	{
		String str = "AppleBananaOrange";
		int num1= str.indexOf("a");
		int num2= str.indexOf("a", num1+1);
		
		//indexOf(찾을문자,찾기시작할곳)
		System.out.println(num1);
		System.out.println(num2);
	}

}
