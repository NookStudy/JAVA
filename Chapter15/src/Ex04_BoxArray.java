class BoxA4{
	public String name;
	
	BoxA4(String name){
		this.name = name;
	}
}


public class Ex04_BoxArray
{

	public static void main(String[] args)
	{
		BoxA4[] ar = new BoxA4[3];
		//객체 배열생성
		
		ar[0] = new BoxA4("홍길동");
		//ar[0]에 객체 BoxA4를 String name"홍길동"으로 저장
		ar[1] = new BoxA4("전우치");
		ar[2] = new BoxA4("손오공");
		
		System.out.println(ar[0]);//ar[0]에는 BoxA4객체의 주소값
		System.out.println(ar[1].name);
		System.out.println(ar[2].name);
	}
//Glaciers melting in the dead of night
	//and the superstar suck into the supermassive
//Glaciers melting in the dead of night
	//and the superstar suck into the
//Do you know i'm in suffer 
}
