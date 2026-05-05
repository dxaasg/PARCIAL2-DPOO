package presentacion;

import logica.parcial;

public class principal {
	public principal() throws Exception{
		parcial parcial = new parcial();
		int b = 10;
		int e=  2;
		
		
		
		System.out.println(parcial.ejercicio1(b, e));
		
	}
	public static void main(String[] args) throws Exception {
		new principal();
	}
}
