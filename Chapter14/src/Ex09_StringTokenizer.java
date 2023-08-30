import java.util.StringTokenizer;

public class Ex09_StringTokenizer
{

	public static void main(String[] args)
	{
//		StringTokenizer str1 = new StringTokenizer("a b c");//공백기준 분할
//		StringTokenizer str1 = new StringTokenizer("1,2,3",","); //","(구분자 기준분할)
		StringTokenizer str1 = new StringTokenizer("1|2|3","|"); //"|"(구분자 기준분할)
		
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}
	}

}
