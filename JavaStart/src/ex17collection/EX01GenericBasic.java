package ex17collection;

class Orange
{
	// 멤버변수 : 당도표현
	int sugar;

	// 생성자
	public Orange(int sugar)
	{
		this.sugar = sugar;
	}

	public void showInfo()
	{
		System.out.println("오렌지의 당도는 " + sugar + "입니다");
	}

}

//오렌지 전용박스 :Orange 객체만 저장할 수 있는 클래스
class OrangeBox
{
	Orange item;

	public void store(Orange item)
	{
		this.item = item;
	}

	// 게터매소드
	public Orange pullOut()
	{
		return item;
	}
}

class FruitBox
{
	// 모든객체를 참조할수있는 멤버변
	Object item;

	// 생성자
	public FruitBox(Object item)
	{
		this.item = item;
	}

	// 세터메소드
	public void store(Object item)
	{
		this.item = item;
	}

	// 게터메소드
	public Object pullOut()
	{
		return item;
	}
}

public class EX01GenericBasic
{

	public static void main(String[] args)
	{
		OrangeBox obox1 = new OrangeBox();
		Orange orange1 = new Orange(10);
		obox1.store(orange1);
		orange1 = obox1.pullOut();
		orange1.showInfo();
//		obox1.store("당도가 20인 오렌지");
		/* 1번오류
		 * obox1은 오렌지 박스이고 객체 선언시 Orange 객체만 저장될수 있게 해놨음.
		 * 따라서 컴파일 에러가 발생(코딩입력창에서 발견), 실행불가.
		 * 자료형에는 안전함. But 일일이 박스를 지정해야하므로 구현이 불편함.
		 *
		 */
		Orange orange2 = obox1.pullOut();
		orange2.showInfo();

		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange) fBox1.pullOut();
		orange3.showInfo();

//		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");
		/* 2번오류
		 * String 이므로 위가 오브젝트라 저장은 가능.
		 * 그런데 pullout에서 int로 형변환해야하는데 string에서 int로 형변환은 불가능하다.
		 * 따라서 컴파일과정에서는 오류가 발생하지 않지만, 실행중간(콘솔.런타임오류)에 예외발생.
		 * 발견및 수정이 어렵다. => 자료형에는 안전하지 못한 형태임.
		 */
		// 1번 vs 2번 : 자료의 안정성 vs 구현의 편의성
//		Orange orange4 = (Orange)fBox2.pullOut();
//		orange4.showInfo();
	}

}
