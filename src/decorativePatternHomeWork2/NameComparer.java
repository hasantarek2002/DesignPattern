package decorativePatternHomeWork2;

public class NameComparer implements ISorter {

	ISorter _c = new NullComparer();

	public NameComparer() {

	}


	@Override
	public int compareAttribute(Student x, Student y) {
		// TODO Auto-generated method stub
		if (x.getName().compareTo(y.getName()) > 0) {
			return 1;
		}
		if (x.getName().compareTo(y.getName()) < 0) {
			return -1;
		}
		return _c.compareAttribute(x, y);

	}

	@Override
	public void nextComparison(ISorter c) {
		_c=c;
		
	}

}
