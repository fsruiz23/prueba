package mx.edu.itlapiedad;

public class Circulo {
	private float radio;

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public Circulo() {
		super();
	}

	public Circulo(float radio) {
		super();
		this.radio = radio;
	}
	
	public float getArea() {
		return (float) (Math.PI * radio * radio);
	}

}
