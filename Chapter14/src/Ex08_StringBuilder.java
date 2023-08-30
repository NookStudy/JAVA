
public class Ex08_StringBuilder
{

	public static void main(String[] args)
	{
		StringBuilder buf = new StringBuilder("동해물과");
		
		//주소가 변경됌.
		String str = new String("동해물과");
		str+="백두산이";
		
		//스트링빌더에 의해 주소 유지.주소는 동적공간을 할당함.
		/*
		 * StringBuilder 클래스
		 * String은기존 문자열에 새문자열 추가시 새롭게 생성된 메무리에 문자열 저장.
		 * 메모리 낭비를 줄이기 위해 StringBuilder 사용.
		 * 주소유지, 메모리위치 유지하고 문자열을 변경하는 방식으로 사용.
		 */
		buf.append("백두산이");
		System.out.println(buf.toString());
		
		buf.append(12345);
		System.out.println(buf.toString());
		
		buf.delete(0,4);//인덱스0~3자리 제거(num1<=x<num2)
		System.out.println(buf.toString());
		
		buf.replace(4,8,"ABC");//인덱스4~7자리까지 지우고 삽입
		System.out.println(buf.toString());

		buf.reverse();//순서반전.
		System.out.println(buf.toString());
	}

}
