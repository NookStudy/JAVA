import com.study.Banana;
import com.company.area.*;
public class Ex04_ImportUse
{

	public static void main(String[] args)
	{
		Banana banana = new Banana();
		banana.showName();
		
		Apple apple = new Apple();
		apple.showName();
		
		Test test = new Test();
		test.testPrint();
	}

}
