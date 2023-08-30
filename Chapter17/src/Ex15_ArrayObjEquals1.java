import java.util.Arrays;

class INum1
{
	private int num;

	public INum1(int num)
	{
		super();
		this.num = num;
	}
}

public class Ex15_ArrayObjEquals1
{

	public static void main(String[] args)
	{
		INum1[] arr1 = new INum1[2];
		INum1[] arr2 = new INum1[2];

		arr1[0] = new INum1(1);
		arr2[0] = new INum1(1);

		arr1[1] = new INum1(2);
		arr2[1] = new INum1(2);

		// 객체배열 arr1 {1,2}
		// 객체배열 arr2 {1,2} 의 선언.
		// 단, 객체배열내의 1,2도 num값으로의 주소값으로 나타남.

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(Arrays.equals(arr1, arr2));// 참조값을 비교하게 됌.
		// 따라서 객체배열내의 주소값이 다르므로 false.
	}

}
