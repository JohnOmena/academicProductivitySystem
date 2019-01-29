package productions;
import java.util.ArrayList;
import contributors.Collaborator;

public class Publication extends AcademicProduction {

	public String title;
	public String conferenceName;
	public String year;
	ArrayList<Collaborator> colaborators = new ArrayList<Collaborator>();
	Project project;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void conferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}
	
	public String conferenceName() {
		return this.conferenceName;
	}
	
	public void addCollaborator(Collaborator collaborator) {
		this.colaborators.add(collaborator);
	}
	
	
}
