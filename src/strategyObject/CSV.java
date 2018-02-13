package strategyObject;


public class CSV implements ITransformer {

	@Override
	public String transform(Student st) {
		// TODO Auto-generated method stub
		return st.name+","+st.email+","+st.roll+"\n";
	}

}
