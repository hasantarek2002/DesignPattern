package decorativePatternAssignment;

public interface ISorter {
	public void nextComparison(ISorter c);
	public int compareAttribute(Student x,Student y,int choice[],int index);

}
