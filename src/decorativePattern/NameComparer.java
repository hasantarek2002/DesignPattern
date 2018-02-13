package decorativePattern;

public class NameComparer implements ISorter {

	@Override
	public int compareAttribute(Student x, Student y) {
		// TODO Auto-generated method stub
		if(x.getName().compareTo(y.getName())>0) {
			return 1;
		}else if(x.getName().compareTo(y.getName())<0) {
			return -1;
		}
		return 0;
		
		
		
	}

}
