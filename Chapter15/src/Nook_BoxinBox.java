//for로 여러개의 배열을 한방에 나타내고 싶어서 클래스배열 내에 여러개의 배열을 쑤셔넣고싶음.
class Bo{
//	String ar;
	
	public int[]arr;
	Bo(int[] arr)
{
	super();
	this.arr = arr;
}
	Bo(int a){
//	this.ar = ar;
		int[] box = new int[a];
	}	
}
class BoxAA{}
public class Nook_BoxinBox
{

	public class Ex06_ArrayInit
	{

		public static void main(String[] args)
		{
			Bo[] ar = {new Bo(3),new Bo(2)}; 
			for (Bo bo : ar)
			{
				System.out.println(bo);
			}		
			int[] arr1= new int[3];
		
			
		
		
		
		}	
	}	
}
