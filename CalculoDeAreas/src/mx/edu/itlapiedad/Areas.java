package mx.edu.itlapiedad;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo miTriangulo= new Triangulo(70,300);
		Circulo miCirculo = new Circulo(3);
		System.out.println("El area del triangulo es: "+miTriangulo.getArea());
		System.out.println("El area del triangulo es: "+miCirculo.getArea());
	}

}
