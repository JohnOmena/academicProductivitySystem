package system;
import database.Database;
import screen.StartScreen;
public class CentralSystem {

public static void main(String[] args) {
		
		Administrator adm = new Administrator();
		adm.createAccount();
		Database database = new Database();
		
		StartScreen start = new StartScreen();
		start.startSystemScreen(adm, database);
		
	}
	
}
