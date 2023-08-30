
public class Ex10_BoxingUnboxing
{

	public static void main(String[] args)
	{
		//박싱
		Integer iObj = Integer.valueOf(10);
		Double dObj= Double.valueOf(3.14);
		
		//메소드 호출을 통해 언박싱후 num변수에 고정
		//수 자체가 입력된다.
		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		
		System.out.println(num1+" : "+iObj);
		System.out.println(num2+" : "+dObj);
		System.out.println();
		
		//Wrapper Instance값 증가 시키기
		iObj = Integer.valueOf(iObj.intValue()+10);
		//Integer선언해서 랲핑[주소](10+10<=(iObj를 메소드로호출=>넘버값+10))
		dObj = Double.valueOf(dObj.doubleValue()+1.2);
		
		System.out.println(iObj);
		//iObj의 원래값은 주소 벗뜨! println메소드를 보면 String.valueOf(x)로 언박싱한다.
		// 결론 : println이 언박싱해서 넘버를 보여줌.
		System.out.println(dObj);
		
	}

}
