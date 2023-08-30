interface Unit6{
	@Deprecated
	public void move(String str);
	public void run(String str);
}

class Human6 implements Unit6
{
	@Override
	@SuppressWarnings("deprecation")//수정할 내용 위에 다 사용해야함.
	//구버전에는 써줘야한다.//관련경고 메시지를 생략하라는 의미.
	public void move(String str) {
		System.out.println(str);
	}
	@Override //수정될 내용
	public void run(String str) {
		System.out.println(str);
	}
}
public class Ex06_SuppressWarnings
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Unit6 unit = new Human6();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 달립니다.");
	}

}
