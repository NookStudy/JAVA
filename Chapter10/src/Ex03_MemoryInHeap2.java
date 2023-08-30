
public class Ex03_MemoryInHeap2
{

	public static void main(String[] args)
	{
		Book book1 = new Book();
		book1.num=10;
		
		Book book2 = book1;
		
		System.out.println("book1.num : "+book1.num);
		System.out.println("book2.num : "+book2.num);
		System.out.println("----------------------------");
		//book1과 book2의 참조변수값(주소)가 같아져 버렸다.
		book2.num=20;
		//book2 참조변수(주소)값 내의 num숫자 20이 됨.
		//book1 참조변수와 book2의 참조변수는 동일하므로 book1의 num값은 20이 됌.
		System.out.println("book1.num : "+book1.num);
		System.out.println("book2.num : "+book2.num);
		System.out.println();
	}

}
