
public class Ex04_SwitchString
{

	public static void main(String[] args)
	{
		String name = "홍길동";
		//실개발 단계에서는 자동완성이든 유도든 해야함
		
		switch (name)
		{
		case "홍길동":
			System.out.println("제 이름은 홍길동입니다.");
			break;
		case "전우치":
			System.out.println("제 이름은 전우치입니다.");
			break;
		case "손오공":
			System.out.println("제 이름은 손오공입니다.");
			break;

		default:
			System.out.println("같은이름이 없습니다.");
			break;
		}
	}

}
