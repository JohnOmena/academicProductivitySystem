package productions;
import java.util.ArrayList;
import java.util.Scanner;

import contributors.Collaborator;
import contributors.Teacher;

public class Project {
	
	static Scanner input = new Scanner(System.in);
	
	public String projectID;
	public String title;
	public String startDate;
	public String endDate;
	public String agency;
	public double value;
	public String goal;
	public String description;
	public String status;
	Teacher manager;
	ArrayList<Collaborator> contributors = new ArrayList<Collaborator>();
	ArrayList<Publication> publications = new ArrayList<Publication>();
	
	public void createProject(String projectID) {
		
		setProjectID(projectID);
		setStandardDataProject();
		
	}
	
	public void setStandardDataProject() {
		
		setTitle(null);
		setStartDate(null);
		setEndDate(null);
		setAgency(null);
		setValue(0);
		setGoal(null);
		setDescription(null);
		setManager(null);
		setStatus("Em elaboração");
		
	}
	
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	
	public String getProjectID() {
		return this.projectID;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getEndDate() {
		return this.endDate;
	}
	
	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	public String getAgency() {
		return this.agency;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public void setGoal(String goal) {
		this.goal = goal;
	}
	
	public String getGoal() {
		return this.goal;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setManager(Teacher manager) {
		this.manager = manager;
	}
	
	public Teacher getManager() {
		return this.manager;
	}
	
	public void addColaborator(Collaborator Collaborator) {
		this.contributors.add(Collaborator);
	}
	
	public int getAmountColaborator() {
		return this.contributors.size();
	}
	
	public int getAmountPublication() {
		return this.publications.size();
	}
	
	public void addPublication(Publication publication) {
		this.publications.add(publication);
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
}
