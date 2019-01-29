package contributors;
import java.util.ArrayList;
import productions.Orientation;

public class Teacher extends Collaborator {
	
	ArrayList<Orientation> orientations = new ArrayList<Orientation>();
	
	public void addOrientation(Orientation orientation) {
		this.orientations.add(orientation);
	}
	
}
