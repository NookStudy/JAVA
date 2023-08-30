//밑변과 높이정보를 저장할수 있는 Triangle 클래스 정의.
//init을 통해 밑변 높이 초기화.
// 밑변과 높이를 변경시킬수 있는 메소드, 삼격형의 넓이 계산 및 반환 메소드 작성.
class Triangle{
	double bottom;
	double height;
	
	public void init(double a, double b)
	{
		this.bottom = a;
		this.height = b;
	}
	
	public void setBottom(double a)
	{
		this.bottom = a;
	}

	public void setHeight(int i)
	{
		this.height = i;
	}

	public double getArea()
	{
		double result = bottom*height/2;
		return result;
	}
}

public class QuTriangle
{

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());

	}

}
