package entornos;

public class circulo {
	private int id;
	private double radio;
	private String color;
	
	public circulo() {
	}

	public circulo(int id, double radio, String color) {
		super();
		this.id = id;
		this.radio = radio;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}
	
	
		
}
