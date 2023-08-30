/*
 * 접근 제한자 : 변수나 메서드에 접근제한.
 * private를 적용하면 클래스외부에서 내부 접근을 제한할수 있다.
 * 이것을 은닉화(fomation hiding)라고 부름.-데이터 안정
 */
class Student1
{
	String name;
	int age;
}

class Student2
{
	public String name;
	private int age;

	public Student2(String name, int age)
	{
		this.name = name; // 앞은 멤버변수 뒤는 매개변수
		this.age = age;
	}

	/*
	 * age변수를 다른 클래스에서 접근불가해서 age에 접근할수 있게
	 *getage, 입력하게 setAge. 메소드를 통해 접근해야 함으로 
	 *잘못된 변수 입력등을 방지할수 있음.
	 */
	public int getAge()// 게터
	{
		return age;
	}

	public void setAge(int age)// 세터
	{
		if (age < 0 || age > 150)
		{
			System.out.println("나이가 부적절합니다.");
			this.age = 0;
			return;
		}
		this.age = age;
	}
}

public class PrivateUse
{
	public static void main(String[] args)
	{
		Student1 student1 = new Student1();
		student1.name = "홍길동";
		student1.age = -20;
		System.out.printf("%s의 나이는 %d살입니다.\n", student1.name, student1.age);

		Student2 student2 = new Student2("전우치", 20);
//		student2.age=-10; 권한이 없어서 오류남.
		student2.setAge(-10); // 세터를 통한 접근
		int age = student2.getAge();
		System.out.printf("%s의 나이는 %d살입니다.%n", student2.name, age);
	}
}
