import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * 파일명 : QuLottoCollection.java
배열을 이용한 버전과 동일한 조건으로 제작하되 Set<E> 컬렉션을 이용한다.
Set<E> 계열의 컬렉션은 중복이 자동으로 제거된다. 
하지만 순서를 보장하지 않으므로 TreeSet<E>을 사용하면 된다. 

 */
public class QuLottoCollection_Nook
{

	public static void main(String[] args)
	{
		ArrayList<Object> lottofive = new ArrayList<>();
		
		System.out.println("오늘의 로또 번호입니다.");
		for (int i = 0; i < 5; i++)
		{
			Set<Integer> lottoNumList = new TreeSet<Integer>();
			while(!(lottoNumList.size()>6))
			{
//				int lottoNum;
				Random rnd = new Random();
//				lottoNum = rnd.nextInt(45)+1;
//				lottoNumList.add(lottoNum);
				lottoNumList.add(rnd.nextInt(45)+1);
				lottofive.add(lottoNumList);
			}
			System.out.println(lottoNumList);
		}
//		Iterator<Object> lottofive.
//		System.out.println(lottofive);
		for (Iterator iterator = lottofive.iterator(); iterator.hasNext();)
		{
			System.out.println(iterator.next());
		}
	}

}
