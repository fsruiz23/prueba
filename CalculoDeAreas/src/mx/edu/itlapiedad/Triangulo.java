package mx.edu.itlapiedad;

public class Triangulo {
	private int base;
	private int altura;
	
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float getArea () {
		float area;
		area = (base * altura) / 2;
		return area;
	}


}
