package common;

public class Student extends Person
{
	private String stNumber;

	/**
	 * @param stNumber
	 */
	public Student(String name, int age, String stNumber)
	{
		super(name, age);
		//자식객체 생성전 부모생성자를 먼저 호출해야함.
		//super가 먼저 나와야 한다.
		this.stNumber = stNumber;
	}

	public Student()
	{
	}

	@Override
	public String toString()
	{
		return super.toString() + ", 학번:" + stNumber;
	}

}
