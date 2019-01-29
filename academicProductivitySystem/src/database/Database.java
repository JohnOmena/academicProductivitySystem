package database;
import java.util.ArrayList;
import contributors.Collaborator;
import productions.Project;

public class Database {

	ArrayList<Project> projects = new ArrayList<Project>();	
	ArrayList<Collaborator> contributors = new ArrayList<Collaborator>();
	
	public void addProject(Project project) {
		this.projects.add(project);
	}
	
	public void addCollaborator(Collaborator contributors) {
		this.contributors.add(contributors);
	}
	
	public boolean containProjectID(String projectID) {
		for(Project project : projects) {
			if(project.getProjectID().equals(projectID)) {
				return true;
			}
		}
		return false;
	}
	
}
