class Book6{
	String author;
	//equals의 오버라이딩. Book6객체의 인스턴스내 author를 변수그대로의 값으로 꺼내놓게 만듬.
	public boolean equals(Object obj) {
		if (this.author ==((Book6)obj).author)
		{
			return true;
		} else
		{
			return false;
		}
	}
}
public class Ex06_equals2
{

	public static void main(String[] args)
	{
		Book6 myBook1 = new Book6();
		myBook1.author = "홍길동";
		
		Book6 myBook2 = new Book6();
		myBook2.author = "홍길동";
		
		if (myBook1.equals(myBook2))
		{
			System.out.println("두 객체의 autor 변수의 값은 같습니다.");
		} else
			System.out.println("두 객체의 autor 변수의 값은 다릅니다.");
		{

		}
	}

}
