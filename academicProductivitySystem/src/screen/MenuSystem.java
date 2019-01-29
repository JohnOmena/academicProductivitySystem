package screen;
import java.util.Scanner;

import contributors.Collaborator;
import database.Database;
import productions.Project;
import useful.Utilities;

public class MenuSystem {


	Scanner input = new Scanner(System.in);
	
	public void menuSystemScreen(Database database) {
		
		boolean flagFlow = true;
		
		do{
			Utilities.cleanScreen();
			System.out.println("----------------------------------");
			System.out.println("#        Laboratory System       #");
			System.out.println("----------------------------------");
			System.out.println("[1] - Create Project");
			System.out.println("[2] - Create a collaborator");
			System.out.println("[3] - Fill data project");
			System.out.println("[5] - Change Status");
			System.out.println("[5] - Collaborator report");
			System.out.println("[5] - Project report");
			System.out.println("[6] - Laboratory report");
			System.out.println("[7] - Exit");
			System.out.println("--------------------------");
			System.out.println("=> Choose an option: ");
	
			int option = input.nextInt();
			input.nextLine();
			flagFlow = menuSystemDecision(option, database);
			
		} while(flagFlow);
	
	}
	
	public boolean menuSystemDecision(int option, Database database) {
		
		switch(option) {
		
			case 1:
				
				Project project = new Project();
				
				System.out.println("What is the projectID?");
				String projectID = input.nextLine();
				
				if(database.containProjectID(projectID)) {
					System.out.println("Project ID already exists, press any key to back to menu...");
					input.nextLine();
				} else {
					project.createProject(projectID);
					database.addProject(project);
				}
					
				break;
			case 2:
				
				Collaborator collaborator = new Collaborator();
				collaborator = collaborator.typeOfCollaborator();
				collaborator.obtainCollaboratorComplete();
				database.addCollaborator(collaborator);
				
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;			
			case 7:
				return false;
			default:
				System.out.println("\nChoose a true option, press any key to try again.");
				input.nextLine();
		}
		
		return true;
		
	}

	
}
