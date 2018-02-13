package decorativePatternAssignment;

public class Comparer implements ISorter {

	ISorter _c = new NullComparer();
	int option;
	public Comparer() {
		
	}

	@Override
	public void nextComparison(ISorter c) {
		_c = c;

	}

	@Override
	public int compareAttribute(Student x, Student y, int[] choice, int index) {
		if (index == choice.length)
			return 0;
		if (x.getAttributeName(choice[index]).compareTo(y.getAttributeName(choice[index])) > 0) {
			return 1;
		}
		if (x.getAttributeName(choice[index]).compareTo(y.getAttributeName(choice[index])) < 0) {
			return -1;
		}
		return _c.compareAttribute(x, y, choice, ++index);
	}
}
