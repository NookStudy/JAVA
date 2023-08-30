import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex20_CollectionsCopy
{

	public static void main(String[] args)
	{
		List<String> src = Arrays.asList("홍길동","전우치","손오공","멀린");
		
		//수정가능한 리스트 생성
		List<String> dst = new ArrayList<>(src);
		System.out.println(dst+"src를 ArrayListy로 형변환한 dst");
		
		//dst를 정렬하여 출력
		Collections.sort(dst);
		System.out.println(dst+"정렬된 dst");
		dst.remove(0); //dst를 리무브하면 배열길이가 달라져서 복사해올수가 없음.
		dst.add("해리포터");
		System.out.println(dst+"dst에서 멀린 지우고 포터 추가");
		//뒤로 추가되는걸 확인할 수 있음(배열이므로)
		
		//정렬이전의 상태로 되돌려야함
		Collections.copy(dst, src);
		System.out.println(dst+"src카피한 dst");
		
		//수정가능한지 확인
		dst.remove(0);
		
		System.out.println(dst+"맨앞을 제거한 dst");
		
	}

}
