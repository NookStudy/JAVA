import java.util.Iterator;
import java.util.LinkedList;

public class Ex05_PrimitiveData
{

	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		// 저장과정에서 오토박싱
		list.add(10);
		list.add(20);
		list.add(30);

		for (Iterator<Integer> itr = list.iterator(); itr.hasNext();)
		{
			int n = itr.next(); // 오토언박싱
			System.out.println(n);
		}

		//for문과 같은거.
//		Iterator<Integer> itr = list.iterator();
//		while (itr.hasNext())
//		{
//			System.out.println(itr.next() + "\t");
//		}

	}

}
