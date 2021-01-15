package ua.lviv.lgs.task1;

public class Car {
	private int numberOfHorsepower;
	private int graduationYear;

	private Helm helm;
	private Engine engine;


	public Car(int numberOfHorsepower, int graduationYear, Helm helm, Engine engine) {
		super();
		this.numberOfHorsepower = numberOfHorsepower;
		this.graduationYear = graduationYear;
		this.helm = helm;
		this.engine = engine;
	}


	public int getNumberOfHorsepower() {
		return numberOfHorsepower;
	}


	public void setNumberOfHorsepower(int numberOfHorsepower) {
		this.numberOfHorsepower = numberOfHorsepower;
	}


	public int getGraduationYear() {
		return graduationYear;
	}


	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}


	public Helm getHelm() {
		return helm;
	}


	public void setHelm(Helm helm) {
		this.helm = helm;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car [numberOfHorsepower=" + numberOfHorsepower + ", graduationYear=" + graduationYear + ", helm=" + helm
				+ ", engine=" + engine + "]";
	}
}
