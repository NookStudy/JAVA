/*
 * 지역변수
 * - 변수는 사용범위가 있고 지역내에서만 사용가능
 * 해당 지역을 벗어나면 메모리에서 삭제됨.
 * -선입후출
 */
public class Ex03_VariableScope
{
	int num;
	public static void main(String[] args)
	{
		//변수 사용 가능 범위 확인
		boolean myState = true;
		//메인지역에서 num선언하면 나머지에서 선언 불가.
//		int num = 11;
		if (myState)
		{
			int num=22;
			num++;
			System.out.println(num);
		}else{
			//if문과 else문은 다른 블럭이므로 다른 지역변수임. 변수 클릭하면 알수있다.
			int num=33;
			num++;
			System.out.println("첫번째 if 문의 else 지역 num: "+num);
		}

		{
			//Nook중괄호를 넣어놓으면 지역변수로인식함 
//			int i;
//			i=1;
//			System.out.println("두번째영역"+i);
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
//		System.out.println(num2);

		for (int i = 0; i < 3; i++)
		{
			System.out.println(i);
		}
//		//main지역에 선언된 i가 없으므로 인식할수 없다.
//		System.out.println(i);
		
		simpleFunc();
		//simpleFunc 의 num은 중복되지 않는다.
	}

	
	public static void simpleFunc()
	{
		int num = 1000;
		System.out.println("simpleFuc method area : "+ num);
	}
	
	
	
	
}
