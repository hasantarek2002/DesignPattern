package decorativePatternHomeWork;

public class RollComparer implements ISorter {

	ISorter _c=new NullComparer();
	public RollComparer() {
		
	}
	
	public RollComparer(ISorter c) {
		_c=c;
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

}
