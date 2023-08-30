
public class Ex11_PartiallyFilled
{

	public static void main(String[] args)
	{
		/*
		 * 1차원 배열은 원소의 갯수에 의해 전체 크기가 결정됨.
		 * 2차원배열도 돌ㅇ일하지만 큰원소에의해 결정되다보니 빈공간 발생.
		 * 이때 빈공간은 null로 채워짐.
		 */
		int[][] arr = {
				{11},	    //arr[1] {[1]} arr 첫번째 배열에 1개 박고
				{22,33},	//arr[2] {[1],[2]} arr 두번째 배열에 2개 박고
				{44,55,66}	
		};
		
		//배열의 구조대로 내용 출력
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
				//2차원배열에서 열의 크기를 알고싶을때는 배열명[인덱스]를 사용.
				// arr[i]의 렝스를 알아야한다.arr[1]행의 갯수가 열이니까.
//				?ㅁarr하면 행의갯수가 나옴.
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*추가
		 * 2차원 배열에서 특정 원소에 접근하기 위해서는 2개의 배열기호가 필요.
		 * 또한 값이 없는원소(null)로 채워진 원소를 출력하면 예외가 발생함.
		 * **배열의 인덱스를 초과했다는 에외가 발생하게 됨...line41
		 * 
		 */
		System.out.println("배열 출력하기");
		System.out.println("arr[0][0]="+arr[0][0]);
		
		//exception (null)
		System.out.println("arr[0][1]="+arr[0][1]);//컴파일 에러.
	}

}
