/*
 * 배열
 * 여러개의 변수가 필요한 경우 생성.
 *  자바에서 배열은 객체를 통해 생성한다(Heap에 저장)
 *  배열명(배열변수)는 주소값(참조값)을 할당받음.
 */
class BoxA1{
	
}

public class Ex01_ArrayInstance
{

	public static void main(String[] args)
	{
		//길이가 5인 INT형 1차원 배열의 생성
		int[] ar1 = new int[5];
		
		//길이가 7인 double형 1차원 배열
		double[] ar2 = new double[7];
		
		//배열의 참조변수와 객체 생성 분리
		float[] ar3;
		ar3 = new float[9];
		
		//객체 대상 1차원 배열
		BoxA1[] ar4 = new BoxA1[5];
		//배열명.length : 해당 배열의 크기 반환.
		//배열의 객체 변수 접근/메서드 사용
		System.out.println("배열 ar1의 길이: "+ar1.length);
		System.out.println("배열 ar2의 길이: "+ar2.length);
		System.out.println("배열 ar3의 길이: "+ar3.length);
		System.out.println("배열 ar4의 길이: "+ar4.length);
	
	}
	

}
