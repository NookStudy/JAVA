package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
친구를 표현한 최상위 클래스로 해당 프로그램에서는 Friend클래스로
객체생성은 하지 않는다. 기본정보를 저장하고 상속할 목적으로 정의된
클래스이다. 
이와같은 클래스를 VO(Value Object)라고 부른다. 즉 값만 가진 객체라는
뜻이다. 
 */
abstract class Friend
{
	// 멤버변수 : 이름, 전화번호, 주소 기본정보 3가지를 표현
	String name;
	String phone;
	String addr;

	// 인수생성자 : 멤버변수 초기화
	public Friend(String name, String phone, String addr)
	{
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	// 멤버변수 전체를 출력하기 위한 멤버메서드
	public void showAllData()
	{
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phone);
		System.out.println("주소:" + addr);
	}

	/*
	간략 정보를 출력하기 위한 메서드로 실행부가 없는 상태로 정의한다. 
	해당 프로그램에서는 오버라이딩의 목적으로만 사용하기 위해 정의
	한다. 
	 */
	abstract public void showBasicInfo();
}

//고등학교 친구 정보를 저장할 클래스
class HighFriend extends Friend
{

	// 자식에서 확장한 멤버변수 : 별명
	String nickname;

	// 인수생성자
	public HighFriend(String name, String phone, String addr, String nickname)
	{
		// 자식객체는 부모객체를 초기화 할수있는 인수까지 모두 받은후
		// super()를 통해 부모생성자를 먼저 호출한다
		super(name, phone, addr);
		this.nickname = nickname;
	}

	/*
	오버라이드 선택사항
	 */
	@Override
	public void showAllData()
	{
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명:" + nickname);
	}

	/*
	베이직인포는 추상클래스이므로 반드시 오버라이딩해야함.
	 */
	@Override
	public void showBasicInfo()
	{
		System.out.println("==고딩친구==");
		System.out.println("별명:" + nickname);
		System.out.println("전번:" + phone);
	}
}

//대학교 친구 정보를 저장하기 위한 클래스
class UnivFriend extends Friend
{

	// 확장한 멤버변수로 전공과목을 표현
	String major;
	// 객체배열에서 List배열로 전환.

	// 생성자와 멤버메서드 모두 HighFriend클래스와 동일하게 정의됨
	public UnivFriend(String name, String phone, String addr, String major)
	{
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllData()
	{
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공:" + major);
	}

	@Override
	public void showBasicInfo()
	{
		System.out.println("==대딩친구==");
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phone);
	}
}

/*
해당 프로그램에서 기능을 담당하는 클래스를 핸들러 혹은 메니져 클래스
라고 한다. 
 */
class FriendInfoHandler
{

	ArrayList<Friend> lists;

	// 생성자 : list 컬렉션 초기화
	public FriendInfoHandler(int num)
	{
		lists = new ArrayList<Friend>();
	}

	// 친구정보 추가를 위한 멤버메서드
	public void addFriend(int choice)
	{

		// 친구의 기본정보를 먼저 입력받는다.
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름:");
		iName = scan.nextLine();
		System.out.print("전화번호:");
		iPhone = scan.nextLine();
		System.out.print("주소:");
		iAddr = scan.nextLine();

		// 입력 선택에 따라 고딩 혹은 대딩으로 분기하여 입력받는다.
		if (choice == 1)
		{
			System.out.print("별명:");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			lists.add(high);
		} else if (choice == 2)
		{
			System.out.print("전공:");
			iMajor = scan.nextLine();
			lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	}//// end of addFriend

	/*
	친구의 정보를 출력하기 위한 멤버메서드 
	1.친구정보를 추가할때 High 또는 Univ객체를 배열에 저장한다. 
	2.이때 객체는 Friend로 자동형변환(업캐스팅)되어 저장된다. 
	3.정보 출력시 배열에 입력된 객체수만큼 반복하여 각 원소를 통해
		정보(멤버변수에 저장된 값)를 출력한다. 
	4.출력을 위한 멤버메서드는 상속관계에서 오버라이딩 처리되어
		있으므로 참조변수의 영향을 받지않고 항상 자식객체에 오버라이딩
		정의한 멤버메서드가 호출된다. 
	5.즉, 저장된 객체는 Friend타입이지만 오버라이딩을 통해 별도의
		형변환이 필요하지 않다. 항상 원하는 정보를 출력할 수 있게된다.
	 */
	// 친구의 전체정보를 출력한다.
	public void showAllData()
	{
		for (int i = 0; i < lists.size(); i++)
		{
			lists.get(i).showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}

	// 친구의 간략정보를 출력한다.
	public void showSimpleData()
	{
		for (Friend fr : lists)
			fr.showBasicInfo();
		System.out.println("==간략정보가 출력되었습니다==");
	}

	// 주소록 검색
	public void searchInfo()
	{
		// 검색한 정보가 존재하는지 확인하기 위한 변수
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();

		Iterator<Friend> itr = lists.iterator();
		while (itr.hasNext())
		{
			Friend fr = itr.next();
			// next두번 호출하면 그다음 객체로 넘어가버리니까
			// while내에서는 한번만 호출해야한다.
			if (searchName.compareTo(fr.name) == 0)
			{// 문자열 찾기
//			 if(searchName.equals(fr.name)) { //같은걸 찾기
				fr.showAllData();
				System.out.println("**요청정보 찾음");
				isFind = true;

			}

		}
		if (isFind == false)
			System.out.println("***찾는 정보가 없습니다.***");
	}//// end of searchInfo

	// 주소록 삭제
	public void deleteInfo()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();
		/*
		배열의 원소 중 삭제된 원소의 인덱스값을 저장하기 위한 변수로
		원소를 삭제한 후 빈자리를 채워넣을때 사용한다. 
		배열의 인덱스는 0부터 시작이므로 -1로 초기화한다. 
		 */
		int deleteIndex = -1;

		// 삭제할 객체를 찾기위해 저장된 데이터 갯수만큼 반복
		for (Friend friend : lists)
		{
			if (deleteName.compareTo(friend.name) == 0)
			{
				lists.remove(friend);
				deleteIndex = 1;
				break;
			}

		}
		// 검색된 데이터가 없어 삭제되지 않았다면 -1을 유지한다.
		if (deleteIndex == -1)
		{
			System.out.println("==삭제된 데이터가 없습니다==");
		} else
		{
			System.out.println("==데이터가 삭제되었습니다==");
		}
	}//// end of deleteInfo
}

public class Ex07MyFriendInfoBook
{
	/*
	매개변수도 없고 반환타입도 없는 메서드
	: 해당 프로그램에서 메뉴를 출력하는 용도로 정의한다.
	main()메서드에서 직접 호출하기 위해서는 해당 메서드도 static으로
	선언되어야 한다.  
	 */
	public static void menuShow()
	{
		System.out.println("######## 메뉴를 입력하세요 ########");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}

	/*
	메인 메서드는 해당 프로그램의 시작점(Entry point)이므로 복잡한
	로직의 구성보다는 프로그램의 전반적인 흐름에 대해서만 기술하는것이
	좋다. 
	따라서 선택한 메뉴에 따라 핸들러 클래스의 메서드만 호출하는 
	형태로 구현되어있다.
	 */
	public static void main(String[] args)
	{
		// 사용자 입력을 위한 객체 생성
		Scanner scan = new Scanner(System.in);
		/*
		기능을 담당하는 핸들러(매니저) 클래스의 객체를 생성
		 */
		FriendInfoHandler handler = new FriendInfoHandler(100);
		/*
		무한루프 조건으로 특정 입력에만 종료할수 있는 구조를 만들어준다. 
		break문은 반복문을 탈출시키는 기능이 있으므로 이와같은 
		무한루프에서 자주 사용한다.
		for(;;) 문을 통해 무한루프를 구현할 수 있으나 반복의 횟수가 
		명확하지 않은 경우에는 주로 while문을 사용한다.  
		 */
		while (true)
		{
			// 메뉴를 출력한다.
			menuShow();

			// 사용자는 수행할 기능의 메뉴를 선택한다.
			int choice = scan.nextInt();

			// 선택한 번호에 따라 switch문으로 각 메서드를 호출한다.
			switch (choice)
			{
			case 1:
			case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			}//// switch 끝
		} //// while 끝
	}//// main 끝
}//// class 끝
