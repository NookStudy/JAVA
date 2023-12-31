import java.util.Arrays;

class Person implements Comparable//comparable이 있어야 compareto 사용가능.
{
	private String name;
	private int age;

	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object o)//compareTo가 있어야 정렬가능
	{
		Person p = (Person) o;

//		int nNum = this.name.compareTo(p.name);
//		return nNum;
		if (this.age > p.age)//나이를 작은순으로 정렬
		{
			return 1;
		} else if (this.age < p.age)
		{
			return -1;
		} else
			return 0;
	}

	public String toString()
	{
		return name + ": " + age;
	}

}

public class Ex17_ArrayObjSort
{

	public static void main(String[] args)
	{
		Person[] arr = new Person[3];

		arr[0] = new Person("홍길동", 29);
		arr[1] = new Person("전우치", 15);
		arr[2] = new Person("손오공", 37);

		Arrays.sort(arr);

		for (Person p : arr) //향상된 포문
		{
			System.out.println(p);
		}
	}

}
