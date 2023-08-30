package ex17collection;

import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

public class Ex04HashSet2
{

	public static void main(String[] args)
	{
		HashSet<Teacher> hashSet = new HashSet<Teacher>();
		
		Teacher t1 = new Teacher("정우성", 40, "국어");
		Teacher t2 = new Teacher("황정민", 42, "영어");
		Teacher t3 = new Teacher("최민식", 44, "수학");
		
		//저장순서가 없어서 실행할때마다 순서다름
		hashSet.add(t1);
		hashSet.add(t2);
		hashSet.add(t3);
		for (Iterator<Teacher> iterator = hashSet.iterator(); iterator.hasNext();)
		{
			System.out.println(iterator.next().getName());
		}
		
		System.out.println("hashSet의 크기:"+hashSet.size());
		
		Teacher t1Same = new Teacher("정우성", 40, "국어");
		System.out.println("t1Same의 저장여부: "+hashSet.add(t1Same));
		System.out.println("hashSet의 크기: "+hashSet.size());
	
		
		Teacher t2Same = new Teacher("관우", 40, "국어");
		System.out.println("t2Same의 저장여부: "+hashSet.add(t2Same));
		System.out.println("hashSet의 크기: "+hashSet.size());
		
		Teacher t3Same = new Teacher("최민식", 44, "역사");
		System.out.println("t3Same의 저장여부: "+hashSet.add(t3Same));
		System.out.println("hashSet의 크기: "+hashSet.size());
	}

}
