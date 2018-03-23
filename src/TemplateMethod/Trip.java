package TemplateMethod;

public abstract class Trip {
	public abstract void journeyFromDhakaToCoxBazar();

	public abstract void roamingAround();

	public abstract void journeyFromCoxBazarToDhaka();

	public void execute() {
		journeyFromDhakaToCoxBazar();
		roamingAround();
		journeyFromCoxBazarToDhaka();
	}

}
