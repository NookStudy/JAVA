package step07;

public class PhoneInfo implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	String name;
	String phoneNumber;
	String email;

	public PhoneInfo(String name, String phoneNumber) //Constructor
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//Constructor Overloading
	public PhoneInfo(String name, String phoneNumber, String email)
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return String.format("이름: %s, 번호: %s, 이메일: ",name,phoneNumber,email	);
	}
	
	public void showPhoneInfo()
	{
		System.out.println("Name: " + name);
		System.out.println("PhoneNumber: " + phoneNumber);
		if (email != null)
			System.out.println("Email: " + email);
		System.out.println("==================================");
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
