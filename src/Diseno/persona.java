package Diseno;

public class persona {
	public String nombre;
	public String apellido;
	private static persona instance = new persona();
	
	
	private persona() {}
	
	public static persona getInstance() {
		return instance;
	}
}
