/*
 * 객체변수는 heap영역에 지정됨.
 * 객체 생성된 변수는 주소값으로 대체됨.
 *	생성된 객체가 null이 되면 주소값또한 사라짐.
 */
public class Ex02_MemoryInHeap1
{

	public static void main(String[] args)
	{
		Book book1 = new Book();
		Book book2 = new Book();//num=0로 초기화(heap영역에서)
		
		
		book1.num =10;
		book2.num =20;
		
		System.out.println(book1.num);
		System.out.println(book2.num);
		
		book1 = null; //heap 영역 메모리 null만들기(주소사라짐)
		book2 = null; //heap 영역 메모리 null만들기
	}//고고데 블로쿠

}