/*
 * 익명클래스 정의를 통한 오버라읻ㅇ
 */
//인터페이스 박고(부모객체로 사용)
interface Unit6
{
	void move(String s);
}
public class Ex06_Lambda2
{
//익명클래스 통해 구현하므로 implements 노필요.
	//상속을 위한 클래스생성이 없어도 된다.
	public static void main(String[] args)
	{
		/*
		 * Unit6 인터페이스를 구현한 익명클래스 정의.
		 * ex or imple 없어도 중괄호 부분은 자식의 영역이 된다.
		 * 익명클래스는 눈에 보이지 않는 상속(구현) 이 된것임.'오버라이딩 가능'
		 */
		Unit6 unit = new Unit6()//자동생성...
				//앞에서는 class에 return으로 나타냈지만 여기서는 아예 main에 박음.
		{
			
			@Override
			public void move(String s)//오버라이딩
			{
				System.out.println(s);
			}
		};
		unit.move("Lambda : Unit 6");
		
		/*
		 * 익명클래스를 메인에 박아놓고 거기서 메소드 바로 꺼내옴.
		 * 상속의 절차를 익명클래스로 대체하므로 코드가 간결해짐.
		 */
	}

}
