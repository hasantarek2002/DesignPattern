package decorativePattern;

public class AgeComparer implements ISorter{

	@Override
	public int compareAttribute(Student x, Student y) {
		if(x.getAge()>y.getAge()) {
			return 1;
		}else if(x.getAge()<y.getAge()) {
			return -1;
		}
		return 0;
	}

}
