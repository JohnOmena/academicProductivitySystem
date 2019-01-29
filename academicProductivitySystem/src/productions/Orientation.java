package productions;
import contributors.Student;
import contributors.Teacher;

public class Orientation extends AcademicProduction {

	public Teacher teacher;
	public Student student;
	public String title;
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Teacher getTeacher() {
		return this.teacher;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
}
