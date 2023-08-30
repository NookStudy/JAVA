import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class QuLottoCollection
{

	public static void main(String[] args)
	{
		//난수 생성준비
		Random rnd = new Random();
		//로또번호는 중복된 숫자가 있으면 안되므로 
		//Set,계열의 컬렉션 생성.
		HashSet<Integer> setLotto1 = new HashSet<>();
		//중복되지 않은 난수를 생성하기 위해서 무한루프에서 반복.
		
		while(true) {
			//1~45사이의 난수를 생성해서 Set에 추가한다.
			//이때 중복된 숫자는 저장되지 않는다.
			setLotto1.add(rnd.nextInt(45)+1);
			if(setLotto1.size()==6)
				break;
		}
		//Set 컬렉션은 정렬되지 않음.
		System.out.println(setLotto1);
		//List컬렉션으로 변환한다.
		ArrayList<Integer> listLotto1 = new ArrayList<Integer>(setLotto1);
		listLotto1.sort(Comparator.naturalOrder());//오름차순
//		listLotto1.sort(Comparator.reverseOrder());//내림차순
		System.out.println(listLotto1);
	///////////////////////////////////////////////////////////////////////////////////////
		/*
		 * TreeSet<E> 컬렉션은 Tree라는 자료구조를 기반으로
		 * 중복허용X 정렬 O. 
		 * Integer같은 기본클래스는 별도 오버라이딩 없이 오름차순 정렬.
		 */
		TreeSet<Integer> setLotto2 = new TreeSet<>();
		while(true)
		{
			setLotto2.add(rnd.nextInt(45)+1);
			if (setLotto2.size()==6)
				break;
		}
		System.out.println(setLotto2);
		
		
	
	
	}

}
