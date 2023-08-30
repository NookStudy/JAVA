public class Ex03_ContentsCompare
{
	public static void main(String[] args)
	{
		//모두 다른 주소를 가짐.(대소문자를 구분함)
		String str1 = new String("Apple");
		String str2 = new String("apple");
		String str4 = "Apple";
		String str5 = "apple";
		String str3 = new String("Banana");
		
		/*
		 * equal() 메서드
		 * Object 클래스로부터 상속받은 메서드.
		 * 실제 저장된 문자열(Heap에 저장된 문자열 자체)을 비교.
		 * 
		 */
		if (str1.equals(str3)) 
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");

		int cmp;
		
		/*
		 * compareTo()
		 * 첫번째 문자부터 아스키코드로 받아서 비교.
		 * 원문 아스키코드-후문 아스키코드.
		 *  따라서 음수가 나오면 후문이 z에 가깝다.
		 */
		cmp = str1.compareTo(str2);
		
		if (cmp == 0)
			System.out.println("두 문자열은 일치합니다.");
		else if (cmp < 0)
			System.out.println("사전의 앞에 위치하는 문자: " + str1);
		else
			System.out.println("사전의 앞에 위치하는 문자: " + str2);

		//대소문자 비교없이 비교
		if (str1.compareToIgnoreCase(str2) == 0)
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
	}

}
