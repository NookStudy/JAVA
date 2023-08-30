package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class Ex03ArrayList2
{

	public static void main(String[] args)
	{
		//뭘 불러도 상관없다.
		//Linked는 수정이 빠르고 Array는 읽는게 빠르다.
		LinkedList<Student> list2 = new LinkedList<Student>();
//		ArrayList<Student> list2 = new ArrayList<Student>();
		
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");
		
		list2.add(st1);
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);//인덱스 3
		list2.add(st2);//중복저장가능
		
		System.out.println("[출력1-일반for문]");
		/*
		 * 컬렉션의 각 인덱스의 저장된 [객체의 참조값](주소값)을 반환.
		 * toString을 사용했으므로 멤버변수가 출력.
		 */
		for (int i = 0; i < list2.size(); i++)
		{
			//size까지 반복하고
			System.out.println(list2.get(i));
			//get으로 인덱스를 확인하여 객체에 접근.
		}
		
		boolean removeOk = list2.remove(st2);
		System.out.println("인스턴스를 통한 삭제"+removeOk);
		
		System.out.println("[출력2-1 Iterator]");
		Iterator<Student> it2 = list2.iterator();
		while (it2.hasNext())
		{
			System.out.println( it2.next());
		}
		
		int idx =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String removeName = sc.nextLine();
		for (Student student : list2)
		{
			if (removeName.equals(student.getName()))
			{	//객체의 멤버볌수를 가지고 객체를 삭제하는 법.
				list2.remove(student);
				break;
			}
		}
		System.out.println("현재 객체수: "+list2.size());
		System.out.println("[출력2-2 Iterator]");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();)
		{
			System.out.println( iterator.next());
		}
		System.out.println("다음 삭제되는 객체의 이름: "
					+list2.remove(2).getName());
		
		System.out.println("[출력3-확장for문]");
		for (Student student : list2)
		{
			System.out.println(student);
		}
		
	}

}
