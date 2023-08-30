class Adress{}
public class Override_String
{

	public static void main(String[] args)
	{
		String str = null;
		
		str = new String("자바");
		System.out.println(str);
		System.out.println(str.toString());
		
		
		System.out.println(str);
	
		System.out.println(str.hashCode());
		Adress adress = new Adress();
		
		System.out.println(str.hashCode());
		System.out.println(adress);
	}	

}
