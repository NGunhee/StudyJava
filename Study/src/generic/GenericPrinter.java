package generic;

public class GenericPrinter<T extends Metrial> {
	
	private T material;
	
	

	public T getMaterial() {
		return material;
	}



	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}



}
