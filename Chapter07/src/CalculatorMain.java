class Calculator { 
	static double PI = 3.14; // static double PI는 클래스 변수, 클래스 변수를 모든 인스턴스에서 동일값을 가져오겠다!
	int left, right;	//인스턴스 변수

	public void setOprands(int left, int right) {
		this.left = left; // this.left는 인스턴스 변수 int left / left는 setOprand 메소드의 매개변수 int left
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}


public class CalculatorMain {
	public static void main(String[] args) {
		//인스턴스를 통해서 PI 접근
		 Calculator c1 = new Calculator();
		System.out.println(c1.PI);		//3.14 출력
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);		//3.14 출력
		
		//클래스를 통해서 PI 접근
		System.out.println(Calculator.PI);	//3.14 출력
	}
}

