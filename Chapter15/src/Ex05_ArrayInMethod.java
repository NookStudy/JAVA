public class Ex05_ArrayInMethod
{//주소==참조값
	public static void main(String[] args)
	{
		int[] arr = makeIntArray(5);
		//매소드내의 주소(참조값)가 arr에 대입됌.
		int ㅅ = sumOfArray(arr);
		//arr에는 참조값(주소)이 들어가 있다.
		System.out.println(ㅅ);
	}

	public static int[] makeIntArray(int len)
	{
		//반환형이 int[] (int형 배열) 인 메소드.
		int[] arr = new int[len];
		for (int i = 0; i < len; i++)
		{
			arr[i] = i;

		}
		return arr;//배열의 주소값을 반환.
	}

	public static int sumOfArray(int[] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];

		}
		return sum;
	}

}