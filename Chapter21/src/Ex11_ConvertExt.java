import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex11_ConvertExt
{

	public static void main(String[] args)
	{
		//크기변경이 안되는 List arrays.asList
		List<String> immuableList =
				Arrays.asList("홍길동","전우치","전우치","손오공");
		//변경 가능하게 다시 ArraList로 객체생성
		ArrayList<String> mutableList = new ArrayList<>(immuableList);
		
		for (String string : mutableList)
		{
			System.out.print(string.toString()+"\t");
		}
		System.out.println();
		
		
		//중복제거
		//List를 Set으로 변환해서 중복을 제거해버림
		HashSet<String> set = new HashSet<>(mutableList);
		//다시 리스트로 전환
		mutableList = new ArrayList<>(set);
		
		for (String string : set)
		{
			System.out.print(string.toString()+"\t");
		}
		System.out.println();
	}

}
