class Book5{
	String author;
}

public class Ex05_equals1
{

	public static void main(String[] args)
	{
		Book5 mybook1 = new Book5();
		mybook1.author = "홍길동";
		
		Book5 myBook2 = new Book5();	
		myBook2.author = "홍길동";
		
		if (mybook1.equals(myBook2))
			System.out.println("두 객체의 참조 id는 같습니다.");
		else
			System.out.println("두 객체의 참조 id는 다릅니다.");
		//equals는 객체의 참조값 비교.
	}

}
