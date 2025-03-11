import java.util.ArrayList;

public class TestGameCenter {
	
	
	
	public static void main(String args[]) 
	{
		System.out.println("Running Tests");
		
		
		GameCenter gc = new GameCenter();
		gc.addGame(new Game("Toronto Maple Leafs", "Montreal Canadiens"));
		gc.addGame(new Game("Vancouver Canucks", "Ottawa Senators"));
		gc.addGame(new Game("Calgary Flames", "Edmonton Oilers"));
		

		System.out.println("Testing Team ID's");
		if (1 != gc.getTeamID("Toronto Maple Leafs")){
			System.out.println("Error team ID Toronto");
		}
		
	
		//Stimulate game plan
		ArrayList<Game> todaysGames = gc.getTodaysGames();
		
		
		System.out.println("Updating Game 1");
		todaysGames.get(0).updateScore(3, 2, 1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Updating Game 2");
		todaysGames.get(1).updateScore(3, 2, 1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Updating Game3");
		todaysGames.get(2).updateScore(3, 2, 1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
