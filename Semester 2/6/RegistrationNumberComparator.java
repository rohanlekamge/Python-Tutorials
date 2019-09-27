import java.util.Comparator;

public class RegistrationNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRegNo().compareTo(o2.getRegNo());
	}
	

}
