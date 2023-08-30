import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class QuLottoArray
{
	static Random rnd = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{
		//5개씩 반복하게 함
		char exitCode;
		do
		{	//5개 한꺼번에 나오게 하려함.
			int[] arr1 = new int[6];
			int[] arr2 = new int[6];
			int[] arr3 = new int[6];
			int[] arr4 = new int[6];
			int[] arr5 = new int[6];
			
			randomCreate(arr1);
			randomCreate(arr2);
			randomCreate(arr3);
			randomCreate(arr4);
			randomCreate(arr5);
			bubbleSort(arr1);
			bubbleSort(arr2);
			bubbleSort(arr3);
			bubbleSort(arr4);
			bubbleSort(arr5);
			
			System.out.println("     로또번호");
			showArray(arr1);
			showArray(arr2);
			showArray(arr3);
			showArray(arr4);
			showArray(arr5);
			System.out.println();
			
			System.out.println("계속하려면 아무키나 누르세요");
			System.out.print("종료하려면 'x'혹은 'X' 키를 누르세요");
			System.out.println();
			exitCode = (char) System.in.read();
			System.out.println();
		} while (!(exitCode == 'x' || exitCode == 'X'));

	}

	public static void bubbleSort(int[] arr)
	{
		// 자리변경을 위한 임시변수 생성
		int temp=1;
		/*
		 크기가 10인 배열이므로 변경은 9번만 하면 됌.
		 i의 증가치는 0~8까지이다.
		 */
		for (int i = 0; i < arr.length - 1; i++)
		{
			/*
			 실제 요소값에 대한 비교를 진행.
			 버블정렬은 오름차순일 때 큰숫자를 제일뒤로 보내는것.
			 요소1>요소2 이면 자리바꿈.
			 */
			for (int j = 0; j < (arr.length - 1) - i// i가4면 높은 4개가 이미 뒤로 박혀있음.
			; j++)
			{
				if (arr[j] > arr[j + 1])
				{	
					// 앞의 요소가 크다고 판단되면 스왑
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					// 값의 변경이 있을때마다 배열전체 출력
//						showArray(arr, "Swap중(오름차순 정렬중):"+(swapCnt++)+"회 교환됨.");
				}

			}
		}
	}
	public static void showArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("%2d ", arr[i]);
		}
		System.out.println();
	}

	public static void randomCreate(int[] arrayParameter)
	{
		//Nook - randomtimemills로 하면 5개가 똑같은 숫자가 나오기 때문에
		//뒤에 랜덤숫자를 하나 더 붙여서 모두 다르게 나오게 함.
		rnd.setSeed(System.currentTimeMillis()+(int)(Math.random()*100));

		while (true)
		{
			// 1. 난수 6개를 생성후 배열에 담기
			for (int i = 0; i < arrayParameter.length; i++)
			{
				arrayParameter[i] = rnd.nextInt(45) + 1;
				// 0부터 시작하기 때문에 +1해줘야 45까지의 정수를 만들수 있다.

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
