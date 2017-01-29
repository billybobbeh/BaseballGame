package MainPackage;

public class PlayerName {
	
	private String _firstName;
	private String _lastName;

	public PlayerName(String firstName, String lastName)
	{
		_firstName = firstName;
		_lastName = lastName;
	}
	
	public String getFirstName()
	{
		return _firstName;
	}
	
	public String getLastName()
	{
		return _lastName;
	}
	
	public String getWholeName()
	{
		return _firstName + " " + _lastName;
	}
}
