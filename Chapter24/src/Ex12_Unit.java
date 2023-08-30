
public class Ex12_Unit implements java.io.Serializable //직렬화 표시
{
	//안 넣어도 되지만 되도록이면 넣을것.
	private static final long serialVersionUID = 1L;
	private String name;

	public Ex12_Unit(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

}
