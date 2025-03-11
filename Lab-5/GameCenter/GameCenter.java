/**
 * 
 */


 import java.util.ArrayList;

 /**
  * @author trevordouglas
  *
  */
 
 
 import java.util.Dictionary;
 import java.util.Hashtable;
 
 
 public class GameCenter {
	 
	 private Hashtable<String, Integer> teams;
	 private ArrayList<Game> todaysGames;
	 
	 public GameCenter()
	 {
		 teams  = new Hashtable<String, Integer>();
		 teams.put("Toronto Maple Leafs", 1);
		 teams.put("Montreal Canadiens", 2);
		 teams.put("Edmonton Oilers", 3);	
		 teams.put("Vancouver Canucks", 4);
		 teams.put("Calgary Flames",  5);
		 teams.put("Ottawa Senators", 6);
		 todaysGames = new ArrayList<Game>();
		 
	 }
	 
	 public int getTeamID(String teamName)
	 {
		 Integer n = teams.get(teamName);
		 return n.intValue();
		 
	 }
	 
	 public void addGame(Game g)
	 {
		 
		 todaysGames.add(g);
		 
	 }
	 
	 
	 public ArrayList<Game> getTodaysGames()
	 {
		 return todaysGames;
	 }
	 
	 
 
 }
 
