package strategyObject;



public class TSV implements ITransformer {

	@Override
	public String transform(Student st) {
		// TODO Auto-generated method stub
		return st.name+"\t"+st.email+"\t"+st.roll+"\n";
	}

}
