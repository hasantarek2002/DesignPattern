package decorativePattern;

public class RollComparer implements ISorter {

	@Override
	public int compareAttribute(Student x, Student y) {
		if (x.getRoll() > y.getRoll()) {
			return 1;
		} else if (x.getRoll() < y.getRoll()) {
			return -1;
		}
		return 0;
	}

}
