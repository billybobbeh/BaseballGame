package League;

import java.util.List;

import MainPackage.Player;

public interface Team {

	/**
	 * @return this team's name
	 */
	String getTeamName();
	
	/**
	 * @return this team's roster
	 */
	List<Player> getRoster();
	
	
	
	
	
}
