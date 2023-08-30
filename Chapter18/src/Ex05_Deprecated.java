interface Unit5{
	/*@Deprecated
	 * 해당메서드가 더 이상 사용되지 않음을 표시
	 * 사용되면 컴파일경고
	 */
	
	@Deprecated
	public void move(String str);
	public void run(String str);
}

class Human5 implements Unit5
{
	@Override
	public void move(String str) {
		System.out.println(str);
	}
	@Override //수정될 내용
	public void run(String str) {
		System.out.println(str);
	}
}

public class Ex05_Deprecated
{

	public static void main(String[] args)
	{
		Unit5 unit = new Human5();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 달립니다.");
		
//		javac -encoding UTF-8 Ex05_Deprecated.java
	}

}
