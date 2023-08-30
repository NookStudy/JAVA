import java.util.Objects;

class House{
	//private 정보 은닉화
	private int houseNum;
	private String name;
	
	// 마우스 오른쪽 우클릭 , generate constructor
	House(int houseNum, String name)
	{
		super();
		this.houseNum = houseNum;
		this.name = name;
	}
	public int getHouseNum()
	{//간접으로 가져오기. 게터
		return houseNum;
	}
	public void setHouseNum(int houseNum)
	{
		this.houseNum = houseNum;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
//	오른쪽 우클릭, 게터세터
//	House(int houseNum, String name){
//		this.houseNum = houseNum;
//		this.name = name;
//		
//	}
//	
//	public int getHouseNum() {
//		return houseNum;
//	}
//	public String getName()
//	{
//		return name;
}
public class Ex09_EnhancedForObject
{

	public static void main(String[] args)
	{
		House[] arr = new House[5];
		
		arr[0] = new House(101,"홍길동");
		arr[1] = new House(102,"전우치");
		arr[2] = new House(103,"손오공");
		arr[3] = new House(104,"해리포터");
		arr[4] = new House(105,"멀린");
	
		for (House house : arr)
		{
			if(house.getHouseNum()==102)
				System.out.println(house.getName());
		}
		
	}

}
