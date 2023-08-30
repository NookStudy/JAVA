//클래스 정의 : 객체를 추상화해 놓은 것
/*
 * 추상화(abstraction) : 현실세계의 사물을 클래스로 형상화.
 * Npc클래스는 "사람"의 일반적인 사항을 클래스로 추상화.
 * 클래스의 첫글자는 Capital
 * public 접근 지정자는 하나의 java파일에 하나만 사용.
 */

class Npc{//스태틱 영역에 저장되어있지 않음.
	//필드 - 데이터
	//멤버변수 : 클래스에서 속성을 표현.
	// 사람을 표현한 클래스이므로 나이,이름등.
	String name;
	int hp;
	///메서드 -동작
	//멤버 메서드 : 클래스에서 객체의 동작(행위)표션.
	/// 	객체참조변수.메서드로 호출.
	void say() {
		System.out.println("안녕하세요.");
	}
}


public class NpcUse
{

	public static void main(String[] args)
	{
		//클래스를 이용해 객체 생선
		//-npc 란 서례도 를 이용해 npc객체 생섬
		// 클래스타입 변수는 new 를 통해 객체생성
		//클래스타입 참조 변수는 스택에, 객체는 힙에 적재.
		
		Npc saram1 = new Npc();
		//필드접근.(참조값을 통해서 간다.
		saram1.name = "경비";
		saram1.hp =100;
		System.out.println(saram1.name+":"+saram1.hp);
		//메서드 호출
		saram1.say();
		
		
	}

}
//객체 만들기
//현실 --> 만들어진 사동차가 실제로 눈앞에 보임
// 컴퓨터 --> 객체를 메모리에 적재.