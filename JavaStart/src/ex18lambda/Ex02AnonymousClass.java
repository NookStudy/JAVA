package ex18lambda;

//익명클래스를 통한 오버라이딩
//부모객체로사용
interface ISchool2{
	void studyLambda(String str);
}
public class Ex02AnonymousClass
{

	public static void main(String[] args)
	{
		/*
		 * 이름이 없는 익명클래스가 생성됨.
		 * 별다른 클래스생성없이 메인에 선언후 메소드불러오기가능.
		 */
		ISchool2 sch = new ISchool2() {
			//이부분이 익명클래스의 영역
			@Override
			public void studyLambda(String str){
				System.out.println(str+"을 공부하기 위해 익명클래스를 만들어요");
			}
		};//클래스가아니고 구현이라 종료점 필요.
		sch.studyLambda("람다식");
		
		 
	
	
	}

}
