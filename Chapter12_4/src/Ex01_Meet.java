/*
 * 인터페이스
 * - 상속을 목적으로 제작됨
 * - 한개의 객체가 여러개의 인터페이스를 다중상속받을수 있음.
 * - public static final, pubic abstract methodName(variable) 로 선언
 * - 클래스 : 객체의 설계도 | 인터페이스 : 클래스의 설계도
 * 
 */

interface Greet{
	void greet();
}

interface Talk{
	void talk();
}
// 콤마를 통해 여러개를 동시에 "구현"할수 있다.
class Morning implements Greet,Talk{
	public void greet()
	{
		System.out.println("안녕하세요!");
		
	}
	public void talk() {
		System.out.println("날씨 좋네요.");
	}
}

public class Ex01_Meet
{

	public static void main(String[] args)
	{
		Morning morning = new Morning();
		morning.greet();
		morning.talk();
	}

}
