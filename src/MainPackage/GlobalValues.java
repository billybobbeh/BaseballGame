package MainPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GlobalValues {
	
	public static final String RF = "right field";
	public static final String LF = "left field";
	public static final String CF = "center field";
	public static final String C = "catcher";
	public static final String FIRST = "first base";
	public static final String SECOND = "second base";
	public static final String THIRD = "third base";
	public static final String SS = "short stop";
	public static final String DH = "designated hitter";
	public static final String P = "starting pitcher";
	public static final String RP = "relief pitcher";
	public static final String CL = "closer";
	public static final int STATRANGE = 100;
	
	private List<String> allFirstNames = new ArrayList<String>(Arrays.asList(
			"Craig", "Will", "Jose", "Jose", "Jose", "Wilson", "Ted", "Bob",
			"Victor", "Travis", "Travis", "David", "Dave", "David", "Mike",
			"Michael", "Mat", "Matt", "Matt", "Justin", "Justin", "Justin",
			"Chris", "Chris", "Brandon", "Brandon", "Aaron", "Sean", "Shawn",
			"Brock", "John", "John", "Jon", "Edgar", "Joe", "Ryan", "Miguel",
			"Carlos", "Carlos", "Scott", "Kyle", "Jake", "Ichiro", "Ben", "Brad",
			"Ted", "Barry", "Larry", "Greg", "Tom", "Phil", "Frank", "Bill",
			"Don", "Marc", "Fernando", "Jesus", "Andrew", "Nick", "Sandy", "Curt", 
			"Wade", "Raul", "Jorge", "Yonder", "Alexi", "Brett", "Elvis", "Dan",
			"Nolan", "Orlando", "Billy", "Lazaro", "Homer", "Jonathan", "Austin",
			"Nick", "Alexander", "Ty", "Charlie", "Xander", "Blaine", "Parker", 
			"Eric", "Chase", "Devon", "Drew", "Blake", "Jorge", "Evan", "Rob"
			));
	
	private List<String> allLastNames = new ArrayList<String>(Arrays.asList(
			"Bautista", "Cabrera", "Cabrera", "Cabrera", "Castro", "Davis", 
			"Davis", "Davis", "Carpenter", "Carpenter", "Sanchez", "Sanchez",
			"Sanchez", "Wilson", "Wilson", "Wilson", "Martinez", "Martinez", 
			"Rodriguez", "Rodriguez", "Rodriguez", "Rodriguez", "Gonzalez", 
			"Gonzalez", "Gonzalez", "Johnson", "Johnson", "Johnson", "Ramirez", 
			"Ramirez", "Ramirez", "Eaton", "Edwards", "Aaron", "Banks", "Bartlett",
			"Baldwin", "Barns", "Castillo", "Clements", "Cochran", "Crawford",
			"Day", "Dirks", "Donnelly", "Duffy", "Adams", "Alberts", "Alexander",
			"Anderson", "Allen", "Ellis", "Encarnacion", "Farrell", "Felix", "Fernandez",
			"Field", "Frey", "Garcia", "Garcia", "Gibson", "Gill", "Gleason", "Gray",
			"Hall", "Hardy", "Hernandez", "Hernandez", "Helton", "Hunt", "Infante",
			"Ingram", "Iglesias", "Jackson", "James", "Johnston", "Jones", "Kane",
			"Kelley", "Kelly", "Kennedy", "Kubek", "Lambert", "Larkin", "Lee",
			"Lewis", "Maddox", "Malarkey", "Martin", "McCarthy", "Miller", "Nelson",
			"Nichols", "Nunez", "Nye", "Oliver", "Olsen", "Ortiz", "Owens", 
			"Pagan", "Parker", "Patterson", "Powell", "Quinn", "Ramirez", "Ramirez",
			"Reed", "Richardson", "Rivera", "Robertson", "Sadler", "Sampson", "Sanders",
			"Shields", "Shaw", "Taylor", "Terry", "Turner", "Travers", "Urban", "Ury",
			"Valdez", "Vogel", "Villar", "Wagner", "Walker", "Walker", "Williams",
			"Williams", "Wood", "Wise", "Young", "York", "Zimmerman", "Zito"
			));
	
	private List<String> allPositions = new ArrayList<String>(Arrays.asList(
			RF, LF, CF, C, FIRST, SECOND, THIRD, SS, DH, P, RP, CL
			));
	
	public String getRandomPosition()
	{
		Collections.shuffle(allPositions);
		return allPositions.get(0);
	}
	
	public PlayerName getRandomPlayerName()
	{
		Collections.shuffle(allFirstNames);
		Collections.shuffle(allLastNames);
		
		return new PlayerName(allFirstNames.get(0), allLastNames.get(0));
	}
	
	public Player createRandomPlayer()
	{
		int speed = (int)Math.random()*STATRANGE + 1;
		int power = (int)Math.random()*STATRANGE + 1;
		int contact = (int)Math.random()*STATRANGE + 1;
		int eye = (int)Math.random()*STATRANGE + 1;
		int fielding = (int)Math.random()*STATRANGE + 1;
		PlayerName name = getRandomPlayerName();
		String position = getRandomPosition();
		
		return new Player(speed, power, contact, eye, fielding, name, position);
	}
}
