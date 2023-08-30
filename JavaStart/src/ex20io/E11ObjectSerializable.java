package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Circle implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int xPos, yPos;
	double radian;
	public Circle(int xPos, int yPos, double radian)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.radian = radian;
	}
	public void showCircleiInfo()
	{
		System.out.printf("좌표[%d,%d]",xPos,yPos);
		System.out.println("반지름: "+radian);
	}
}

public class E11ObjectSerializable
{

	public static void main(String[] args)
	{
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/ex20io/circle.obj"));
			
			//circle 인스턴스를 생성한 후 파일에 저장.
			out.writeObject(new Circle(1, 1, 2.4));
			out.writeObject(new Circle(2, 2, 4.8));
			//기본클래스는 별도 처리없이 직렬화 가능.
			out.writeObject(new String("String타입의 오브젝트"));
			out.close();
			
			/*
			 * 인스턴스의 복원(역직렬화)를 위한 스트림을 생성하고 readObject()를 통해 복원한다.
			 */
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/ex20io/circle.obj"));
			
			Circle c1 = (Circle)in.readObject();
			Circle c2 = (Circle)in.readObject();
			String message = (String)in.readObject();
			in.close();
			
			//개발자가 직접정의한 클래스는 멤버메서드를 통해 출력
			c1.showCircleiInfo();
			c2.showCircleiInfo();
			//String은 이미 tostring 오버라이딩.
			System.out.println("string 오브젝트: "+message);
			
			
		} catch (ClassNotFoundException e)
		{
			System.out.println("클래스 없음");
		}catch (FileNotFoundException e) {
			System.out.println("파일없음");
			// TODO: handle exception
		}catch (IOException e) {
			System.out.println("뭔가없음");
			// TODO: handle exception
		}
	}

}
