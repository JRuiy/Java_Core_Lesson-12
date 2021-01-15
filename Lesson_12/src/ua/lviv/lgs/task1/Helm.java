package ua.lviv.lgs.task1;

public class Helm {
private double diametrOfHelm;
	
	private String material;

	public Helm(double diametrOfHelm, String material) {
		super();
		this.diametrOfHelm = diametrOfHelm;
		this.material = material;
	}

	public double getDiametrOfHelm() {
		return diametrOfHelm;
	}

	public void setDiametrOfHelm(double diametrOfHelm) {
		this.diametrOfHelm = diametrOfHelm;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helm [diametrOfHelm=" + diametrOfHelm + ", material=" + material + "]";
	}
}
