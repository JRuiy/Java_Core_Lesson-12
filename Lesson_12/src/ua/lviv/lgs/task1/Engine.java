package ua.lviv.lgs.task1;

public class Engine {
	private int numberOfCylinder;

	public Engine(int numberOfCylinder) {
		super();
		this.numberOfCylinder = numberOfCylinder;
	}

	public int getNumberOfCylinder() {
		return numberOfCylinder;
	}

	public void setNumberOfCylinder(int numberOfCylinder) {
		this.numberOfCylinder = numberOfCylinder;
	}

	@Override
	public String toString() {
		return "Engine [numberOfCylinder=" + numberOfCylinder + "]";
	}
}
