
public class Ex07_while
{

	public static void main(String[] args)
	{
		//while문 : 반복횟수가 명확하게 정해지지 않으면 쓰기 좋음
		//while(반복의 조건)
//			true
//			countiue
//			break 탈출 or
//			반복조건 달성 종료
		int num=0;
		int count=0;
		
		while ((num++)<100)//반복을 위한 조건식
		{
//			1.if(((num%5) !=0)|| (num&7)!=0)
//				continue; //5와 7의 배수 아니라면 나머지 건너띄고 위로 이동
//			2.if((num%5) ==0) && (num&7)==0)
			//2번문같은경우 컨틴뉴가 필요없음.다만 100번 돌아야함.
			//2번문같은경우 코드는 간단하지만 count자리가 100번 돌게됨.
			//1번문같은경우 컨틴뉴가 한번 들어가지만 count가 2번.
			
			
			//"하지만 결국 100번 돌지않는건 count일뿐 결국은 둘다 100번도는건 매한가지아닌가??"
			
			if((num%5) !=0)
				continue;
			if((num%7) !=0)
				continue;//컨틴뉴 때문에 while문 초기로 들어가고 count는 찍히지 않는다.
			
			count++;					//5와 7의 배수인경우만 실행
			System.out.println(num);	//5와 7의 배수인경우만 실행

			
		}	
		System.out.println("count: "+count);
	System.err.println(0/3);
	
	}

}
