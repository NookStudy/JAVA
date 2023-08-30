class Parents{
	String name;
	public Parents()
	{
		// TODO Auto-generated constructor stub
		System.out.println("부모객체 생성완료");
	}
	public Parents(String name)
	{
		super();
		this.name = name;
		System.out.println("부모객체 생성완료");
	}
	
}
class Child1 extends Parents{
	int studentno;

	public Child1()
	{
		// TODO Auto-generated constructor stub
		System.out.println("w자식객체 생성완료");
	}
	public Child1(int studentno)
	{
		super();
		this.studentno = studentno;
		System.out.println("w자식객체 생성완료");
	}
	
}
class Child2 extends Parents{
	int collegeno;
	public Child2()
	{
		// TODO Auto-generated constructor stub
		System.out.println("w자식객체 생성완료");
	}
	public Child2(int collegeno)
	{
		super();
		this.collegeno = collegeno;
		System.out.println("w자식객체 생성완료");
	}
}
public class SuperSub
{

	public static void main(String[] args)
	{
		Parents person = new Child1();
		person = new Child2();
	}

}
