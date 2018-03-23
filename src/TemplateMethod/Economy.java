package TemplateMethod;

public class Economy extends Trip{

	@Override
	public void journeyFromDhakaToCoxBazar() {
		System.out.println("Journey from dhaka to cox bazar (Economy class)");
		
	}

	@Override
	public void roamingAround() {
		// TODO Auto-generated method stub
		System.out.println("roaming in economy class");
	}

	@Override
	public void journeyFromCoxBazarToDhaka() {
		// TODO Auto-generated method stub
		System.out.println("Journey from cox bazar to Dhaka  (Economy class).");
		
	}

}
