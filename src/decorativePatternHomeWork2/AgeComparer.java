package decorativePatternHomeWork2;

public class AgeComparer implements ISorter {

	ISorter _c = new NullComparer();

	public AgeComparer() {

	}

	@Override
	public int compareAttribute(Student x, Student y) {
		if (x.getAge() > y.getAge()) {
			return 1;
		} else if (x.getAge() < y.getAge()) {
			return -1;
		}
		return _c.compareAttribute(x, y);
	}

	@Override
	public void nextComparison(ISorter c) {
		_c = c;

	}

}
