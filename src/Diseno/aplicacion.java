package Diseno;

public class aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona p = persona.getInstance();
		
		p.apellido = "Areche";
		p.nombre = "Brian";
		
		System.out.println(p.nombre);
	}

}
