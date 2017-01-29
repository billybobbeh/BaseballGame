package MainPackage;


public class Player {
	// all stats are from 0-100 (as defined in GlobalValues)
	private int _speed;
	private int _power;
	private int _contact;
	private int _eye;
	private int _fielding;
	private PlayerName _name;
	private String _position;
	
	// position must exist in GlobalValues
	public Player (int speed, int power, int contact, int eye, int fielding, PlayerName name, String position) 
	{
		_speed = speed;
		_power = power;
		_contact = contact;
		_eye = eye;
		_fielding = fielding;
		_name = name;
		_position = position;
	}
	
	public int getSpeed()
	{
		return _speed;
	}
	
	public int getPower()
	{
		return _power;
	}
	
	public int getContact()
	{
		return _contact;
	}
	
	public int getEye()
	{
		return _eye;
	}

	public int getFielding()
	{
		return _fielding;
	}
}
