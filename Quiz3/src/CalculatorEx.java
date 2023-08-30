public class CalculatorEx
{
	static int cnt;
	
	public static void showOpCount() {
				
		System.out.println(cnt);
	}
	public void init() {
		int cnt = 0;
		this.cnt = cnt;
	}
	public double add(double a, double b)
	{
		double result;
		result = a+b;
		cnt++;
		return result;
	}
	public static double min(double a, double b)
	{
		cnt++;
		int cnt= 1;
		double result = a-b;
		return result;
			
	}
	
	public static double mul(double a, double b)
	{
		cnt++;
		double result = a*b;
		return result;
		
	}
	
	public static double div(double a, double b)
	{
		cnt++;
		double result = a/b;
		return result;
	}
	
}
