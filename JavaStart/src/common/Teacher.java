package common;

import java.util.Objects;

public class Teacher extends Person
{
	private String subject;

	public Teacher()
	{
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String subject)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
		this.subject = subject;
	}


	@Override
	public String toString()
	{
		return super.toString()+",과목=" + subject;
	}

	@Override
	public int hashCode()
	{
		//방법1 : 정수형 변수와 객체의 해쉬코드값을 더해서 반환.
		 	//[이러면 정말 재수없게 중복될지도..?]
		int returnCode1 = super.getAge()+this.subject.hashCode();
		//방법2 : Object 클래스의 정적메서드인 hash()이용.
		//		변별하려는 멤버변수의 갯수만큼 인수로 사용하면됨.
		//		객체의 해쉬코드를 멤버인수를 토대로 통일할수 있다.
		int returnCode2 = Objects.hash(super.getAge(),this.subject);
		return returnCode2;
	}

	@Override
	/*
	 * equals : 멤버변수의 값이 동등한지를 확인하고 boolean으로 반환.
	 * HashSet, HashMap, HashTable은 
	 * 해쉬코드 및 equals리턴값이 같아야 같은 객체라고 판단.
	 * 따라서 hashCode, equals를 같이 오버라이딩해야 객체선별이 가능하다. 
	 */
	public boolean equals(Object obj)
	{
		Teacher teacher = (Teacher)obj;
		if((teacher.getAge()==super.getAge())
			&& teacher.subject.equals(this.subject)) {
			return true;
			
		}else
			return false;
	}
	
	
	
}
