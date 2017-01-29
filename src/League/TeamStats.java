package League;

public class TeamStats {
	private int _wins;
	private int _losses;
	
	public TeamStats() {
		_wins = 0;
		_losses = 0;
	}
	
	public int getWins()
	{
		return _wins;
	}
	
	public int getLosses()
	{
		return _losses;
	}
	
	public void setWins(int wins)
	{
		_wins = wins;
	}
	
	public void setLosses(int losses)
	{
		_losses = losses;
	}
}

