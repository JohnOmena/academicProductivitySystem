package contributors;
import java.util.ArrayList;
import java.util.Scanner;

import productions.Project;
import productions.Publication;
import useful.Utilities;

public class Collaborator {

	Scanner input = new Scanner(System.in);
	
	public String cpf;
	public String name;
	public String email;
	ArrayList<Publication> publications = new ArrayList<Publication>();
	ArrayList<Project> projects = new ArrayList<Project>();
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void addPublication(Publication publication) {
		this.publications.add(publication);
	}
	
	public void addProject(Project project) {
		this.projects.add(project);
	}
	
	public Collaborator typeOfCollaborator() {
		
		Collaborator collaborator = null;
		boolean flagFlow;
		
		do {
			
			flagFlow = false;
			
			Utilities.cleanScreen();
			System.out.println("Choose the type of employee:");
			System.out.println("[1] Student");
			System.out.println("[2] Teacher");
			System.out.println("[3] Research");
			
			int option = input.nextInt();
			input.nextLine();
			
			switch(option) {
			
				case 1:
					collaborator = typeOfStudent();
					break; 
				case 2:
					collaborator = new Teacher();
					break;
				case 3:
					collaborator = new Researcher();
					break;
				default:
					System.out.println("Choose a true option, press any key to try again.");
					input.nextLine();
					flagFlow = true;
			}
			
		} while(flagFlow);
		
		return collaborator;
		
	}
	
	public Student typeOfStudent() {
		
		Student student = null;
		boolean flagFlow;
		
		do {
			
			flagFlow = false;
			
			Utilities.cleanScreen();
			System.out.println("Choose the type of employee:");
			System.out.println("[1] Graduating");
			System.out.println("[2] Master");
			System.out.println("[3] Doctorate");
			
			int option = input.nextInt();
			input.nextLine();
			
			switch(option) {
			
				case 1:
					student = new Graduating();
					break; 
				case 2:
					student = new Master();
					break;
				case 3:
					student = new Doctorate();
					break;
				default:
					System.out.println("Choose a true option, press any key to try again.");
					input.nextLine();
					flagFlow = true;
			}
			
		} while(flagFlow);
		
		return student;

		
	}

	public void obtainCollaboratorComplete() {
		
		
		
	}
	
}
