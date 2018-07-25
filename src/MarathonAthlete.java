
public class MarathonAthlete {
	
	String name;
	int speed;
	int bibNum;
	
	static final String location = "San Diego";
	static final int time = 1;
	static int numOfAthletes = 0;
	
	
	public static void main(String[] args) {
		MarathonAthlete m0 = new MarathonAthlete("Bob", 2);
		MarathonAthlete m1 = new MarathonAthlete("Bill", 3);
		MarathonAthlete m2 = new MarathonAthlete("Ed", 5);
		MarathonAthlete m3 = new MarathonAthlete("Jeff", 10);
		MarathonAthlete m4 = new MarathonAthlete("John", 17);
	
		System.out.println("There are " + MarathonAthlete.numOfAthletes + " runners in the race");
		System.out.println(m0.name +" (Bib number " + m0.bibNum + ") is running the " + MarathonAthlete.location + " Marathon at an average speed of " + m0.speed + "mph, he is in last place!");
		System.out.println(m4.name +" (Bib number " + m4.bibNum + ") is running the " + MarathonAthlete.location + " Marathon at an average speed of " + m4.speed + "mph, he is in first place!");
		
	}
	
	
	
	public MarathonAthlete(String name, int speed){
		numOfAthletes++;
		
		this.name = name;
		this.speed = speed;
		this.bibNum = numOfAthletes;
		
	}
	
	
	
}
