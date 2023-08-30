package ex17collection;

class Apple{
	int weight;
	public Apple(int w) {
		weight = w;
	}
	public void showInfo(){
		System.out.println("사과의 무게는 "+weight+"입니다.");
	}
}
class Banana{
	int sugar;
	public Banana(int s) {
		sugar= s;
	}
	
	public void ShowInfo() {
		System.out.println("바나나의 당도는 "+sugar+"입니다.");
	}
}

/*
class FruitBox{
	//모든객체를 참조할수있는 멤버변
	Object item;
	//생성자
	public FruitBox(Object item) {
		this.item=item;
	}
	//세터메소드
	public void store(Object item)
	{
		this.item=item;
	}
	//게터메소드
	public Object pullOut() {
		return item;
	}
}
*/ 
class GenericFruitBox<T>{
	T item;
	public void store(T item) {
		this.item=item;
	}
	public T pullOut() {
		return item;
	}
}
//각 오렌지 박스, 애플박스를 구현할 필요가 없음.
public class Ex02GenericClass
{
/*
 * 구현의 편의성이 보장됨.
 */
	public static void main(String[] args)
	{
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();
		
		GenericFruitBox<Banana> bananabox = new GenericFruitBox<Banana>();
		bananabox.store(new Banana(20));
//		bananabox.store("나는 바나나");
		Banana banana = bananabox.pullOut();
		banana.ShowInfo();
		
		//T를 Orange로 박았기 때문에 Orange객체만 들어갈수있음.
		//나머지는 컴파일 오류로 확인가능. 
		//구현도 편하고, 오류잡기도 편함.
//		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
//		orangeBox.store("나는 오렌지");
//		orangeBox.store(apple);
//		orangeBox.store(banana);
		
	}

}
