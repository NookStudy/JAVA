import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
 * 버블 정렬 :
 * -Bubble Sort는 인접한 두 수를 비교하여 큰 수를 뒤로 보내는
 * 간단한 정렬 알고리즘입니다.
 * -첫번째 자료와 두번재 자료를, 두번째 자료와 세번째 자료를...
 * 순차적으로 비교하여 교환한다.
 * -1회전 수행시 가장 큰수가 맨뒤로 이동하므로, 
 * 맨 끝의 수는 제외하고 다시 처음부터 비교한다.
 * - 다른 정렬 알고리즘의 비해 속도가 상당히 느린편이지만, 
 * 	코드가 단순하므로 자주 사용된다.
 * -원소의 이동이 거품이 수면으로 올라오는 듯한 모습을 보이기 때문에
 * 	버블정렬(Bubble Sort)라는 이름을 가지게 되었다.
 */
public class BubbleSort
{
	// 전역변수 설정하여 모든 메소드에서 접근가능.
	static Random rnd = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{
		char exitCode;
		do {
		// 중복되지 않는 난수 10개 생성
			int[] arr = new int[10];
			// 1. 난수 생성후 arr배열에 저장하기 위한 매소드 호출
			randomCreate(arr);
			// 2. 생성된 난수를 통해 초기화된 배열을 출력한다.(정렬 전 출력)
			showArray(arr, "난수생성 직후 배열출력");
			System.out.println();
			// 3. 정렬의방법을 선택한다.(1.오름차순, 2. 내림차순)
			int orderSelect = menuSelect();
			// 4. 버블정렬 알고리즘을 통해 정렬을 진행한다.
			bubbleSort(arr, orderSelect);
			// 5. 정렬된 결과를 출력한다.
			if (orderSelect==1)
			{
				showArray(arr, "오름차순 정렬");
				System.out.println();
			} else
			{
				showArray(arr, "내림차순 정렬");
				System.out.println();
			}
		System.out.println("계속하려면 아무키나 누르세요");
		System.out.print("종료하려면 'x'혹은 'X' 키를 누르세요");
			
		exitCode = (char)System.in.read();
		System.out.println();
		}while(!(exitCode == 'x'|| exitCode=='X'));
		
	}

	public static void bubbleSort(int[] arr, int orderSelect)
	{
		//자리변경을 위한 임시변수 생성
		int temp, swapCnt =1;
		/*
		 크기가 10인 배열이므로 변경은 9번만 하면 됌.
		 i의 증가치는 0~8까지이다.
		 */
		for (int i = 0; i < arr.length-1; i++)
		{
				/*
				 실제 요소값에 대한 비교를 진행.
				 버블정렬은 오름차순일 때 큰숫자를 제일뒤로 보내는것.
				 요소1>요소2 이면 자리바꿈.
				 */
			for (int j = 0; j < (arr.length-1)-i//i가4면 높은 4개가 이미 뒤로 박혀있음.
					; j++)
			{
				/*
				 j가 0일 때 : arr[0]> arr[1] 비교
				 j가 1일 때	: arr[1]> arr[2] 비교 .....
				 */
				if (orderSelect==1)
				{
					if (arr[j]>arr[j+1])
					{
						//앞의 요소가 크다고 판단되면 스왑
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
						//값의 변경이 있을때마다 배열전체 출력
//						showArray(arr, "Swap중(오름차순 정렬중):"+(swapCnt++)+"회 교환됨.");
						} 
					
				} else if (orderSelect==2)
				{
					if (arr[j]<arr[j+1])
					{
						//앞의 요소가 작다고 판단되면 스왑
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
//						showArray(arr, "Swap중(내림차순 정렬중):"+(swapCnt++)+"회 교환됨.");
					} 
				}
			}
		}
	}

	public static int menuSelect()
	{
		System.out.println("정렬할 방법을 선택하세요.");
		System.out.print("1.오름차순, 2.내림차순... ");
		return sc.nextInt();
	}

	public static void showArray(int[] arr, String msg)
	{
		System.out.println(msg);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

	public static void randomCreate(int[] arrayParameter)
	{
		// 난수 생성을 위한 Seed설정
		rnd.setSeed(System.currentTimeMillis());

		/*
		 * 난수 생성 알고리즘 : 
		 * 1. 난수 10개를 우선 생성한 후 배열에 담아준다.
		 * 2. 배열 전체를 대상으로 중복확인을 한다.
		 * 3. 만약 중복되는 요소가 발견되면 다시 1번으로 돌아가서 난수를 생성한다.
		 * 4. 중복되는 요소가 없다면 함수를 종료하고 메인으로 돌아간다. 
		 */
		while (true)
		{
			// 1. 난수 10개를 생성후 배열에 담기
			for (int i = 0; i < arrayParameter.length; i++)
			{
				arrayParameter[i] = rnd.nextInt(99) + 1;
				// 0부터 시작하기 때문에 +1해줘야 99까지의 정수를 만들수 있다.

			}
			// 2. 중복확인
			boolean ranFlag = false;
			/*
			 중복 체크를 위한 변수(false라면 중복된 난수가 없는 경우.
			 중복된 난수가 발견되면 true로 값을 변경할 것임.
			 */
			for (int i = 0; i < arrayParameter.length; i++)
			{
				for (int j = 0; j < arrayParameter.length; j++)
				{
					/*
					 비교의 조건은 인덱스 i와 인덱스 j가 서로 다를 때.
					 인덱스가 동일하다면 같은 숫자일테니까.
					 */
					if (i != j && arrayParameter[i] == arrayParameter[j])
					{
						// 중복된 값이 발견되면 true로 값을 변경
						ranFlag = true;
					}
				}
//				int j = arrayParameter[i];
				// 3. 중복된 값이 없다면 break로 while루프 탈출하기.
			}
			if (ranFlag == false)
				break;
		} // end of while
	}// end of randomCreate()

}
