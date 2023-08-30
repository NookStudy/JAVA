package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

public class Ex04HashSet1
{

	public static void main(String[] args)
	{
		//Object를 기반으로 Set컬레션을 생성했으므로 모든객체저장가능
		HashSet<Object> set = new HashSet<Object>();
		
		//기본클래스 및 사용자정의 클래스
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt= 100;
		Teacher varTeacher = new Teacher("김봉두",55,"체육");
		int[] arr = new int[3];
		
		//객체저장
		System.out.println("add결과:"+set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		set.add(arr);
		
		System.out.println("[중복 저장전 객체수]: "+set.size());
		
		//기본클래스의 객체 중복저장
		System.out.println(set.add(varString2)?"저장성공":"저장실패");
		System.out.println("[중복 저장후 객체수]:"+set.size());
		System.out.println("-------------------------------");
		
		//Iterator 를 통한 객체출력
		//1.set참조변수를 통해 iterator 객체생성
		Iterator itr = set.iterator();
		//2.추출데이터 확인
		while (itr.hasNext())
		{//hasnext 즉 다음 객체가 있으면(true) 반복한다.
			Object object = itr.next();
			//모두 오브젝트로 자동형변환되어 저장되었음.
			//우리가 정의한 클래스는 instanceof를 통해 다운캐스팅.
			//다운캐스팅을해야 getName사용가능. [or toString?]
			if(object instanceof Teacher) {
				System.out.println("Teacher객체=>"+((Teacher)object).getName());
				
			}
			else {
				System.out.println("저장된객체: "+object);
			}
		}
		System.out.println("포함여부확인---------------");
		//포함여부확인
		System.out.println(set.contains(varString1)?"varString1 있음":"varString1 없음");
		
		//객체삭제
		System.out.println(set.remove(varString2)?"varString2 삭제성공":"varString2 삭제실패");
		
		//전체삭제
		set.clear();
		System.out.println("전체삭제: "+set.removeAll(set));
		System.out.println("[전체 삭제후 객체수]:"+set.size());
		
		
		
		
			
	}

}
