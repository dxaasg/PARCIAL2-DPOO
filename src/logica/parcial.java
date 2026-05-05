package logica;

public class parcial {
	public int ejercicio1(int b,int e) throws Exception {
		if (b == 0 && e == 0) { // 0 a la 0 es una indeterminación
			throw new Exception ("Error: 0 a la 0 es una indeterminación");
		}
		else if (e < 0) { //Si e es un num negativo el resultado no sería un entero
			throw new Exception (" Error: si el exponente es negativo el resultado no será un número entero");
		
	}
	    try {
	        Math.powExact(b, e); // Revisar si el resultado excede el tamaño de int
	    } catch (Exception ex) {
	        System.out.println("Error: " + ex.getMessage());
	    		
		
	}
	return Math.powExact(b, e);
	}
}