package decorativePatternHomeWork2;

public class RollComparer implements ISorter {

	ISorter _c = new NullComparer();

	public RollComparer() {

	}

	

	@Override
	public int compareAttribute(Student x, Student y) {
		if (x.getRoll() > y.getRoll()) {
			return 1;
		} else if (x.getRoll() < y.getRoll()) {
			return -1;
		}
		return _c.compareAttribute(x, y);
	}

	@Override
	public void nextComparison(ISorter c) {
		_c=c;
		
	}

}
