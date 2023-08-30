package ex17collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class HashCodeExample
{

	public static void main(String[] args)
	{

		Student s1 = new Student(1, "홍길동");

		Student s2 = new Student(1, "홍길동");

		System.out.println(s1.hashCode());

		System.out.println(Objects.hashCode(s2));
		List<Student> list = new ArrayList<>();
		list.add(s2);
		list.add(s1);
		
//		Collection<Integer> test =  

	}

	static class Student
	{

		int sno;

		String name;

		Student(int sno, String name)
		{

			this.sno = sno;

			this.name = name;

		}

//		@Override
//
//		public int hashCode()
//		{
//
//			return Objects.hash(sno, name);
//
//		}

	}

}