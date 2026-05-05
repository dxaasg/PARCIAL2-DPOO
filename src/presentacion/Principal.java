package presentacion;

import logica.Parcial;

public class Principal {
	public Principal() throws Exception{
		Parcial parcial = new Parcial();
		int b = 0;
		int e=  0;
		
		 
		
		System.out.println(parcial.ejercicio1(b, e));
		
	}
	public static void main(String[] args) throws Exception {
		new Principal();
	}
}
