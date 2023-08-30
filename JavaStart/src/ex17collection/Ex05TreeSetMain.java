package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet<T> 컬렉션
 * 트리기반 Set 컬렉션.
 * 중복 비허용, 자동정렬(오름or 내림)
 * 
 */
class MyString implements Comparable<MyString>{
	String str;
	public MyString(String str) {
		this.str = str;
	}

	public int getLength()
	{
		return str.length();
	}
	/*
	 * 정렬을 위해 compareTo()메소드를 넣어야함.
	 * 1과 -1의 위치로 오름차순,내림차순 결정.
	 */
	@Override
	public int compareTo(MyString paramStr) {
		if (getLength()>paramStr.getLength())
		{	
			return 1;
		} else if(getLength()<paramStr.getLength())
		{
			return -1;
		}else
			return 0;
		
	}
	@Override
	public String toString() {
		return str;
	}
}
public class Ex05TreeSetMain
{

	public static void main(String[] args)
	{
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		tree1.add(2);
		
		System.out.println("저장된 데이터 수: "+tree1.size()+"개");
	
		Iterator<Integer> itr = tree1.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/***************************************************/
		
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("JavaWeb"));
		
		Iterator<MyString> iter = tree2.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
