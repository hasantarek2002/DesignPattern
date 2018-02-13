package strategyObject;



public class XML implements ITransformer{

	@Override
	public String transform(Student st) {
		// TODO Auto-generated method stub
		
		return "<name> "+st.name+" </name>"+"\n"+"<email> "+st.email+" </email>"+"\n"+"<roll> "+st.roll+" </roll>"+"\n\n";
	}

}
