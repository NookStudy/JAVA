
public class Ex02_PackageUse
{

	public static void main(String[] args)
	{
		Apple apple = new Apple();
		apple.showName();
		
		/*
		 * default 하위에 com.study 생성됐지만 둘은 다른패키지로 인식
		 * Banana() 호출시에는 패키지의 풀경로를 이용하여 객체생성.
		 */
		//Banana banana= new Banana();
		com.study.Banana banana = new com.study.Banana();
		banana.showName();
	}

}
