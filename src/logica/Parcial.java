package logica;

public class Parcial {
	public int ejercicio1(int b,int e) throws Exception {
		if ((b > 0 && b < 1) || e<1 && e>0) { // Si se le pidieran datos al usuario, 
											  // esta validación es importante, pero como se 
											  // declaran los valores por consola no se podrá tener
											  // valores decimales debido a que las variables son declaradas int 
			throw new Exception ("Error: Solo numeros enteros");
		}
		if (b == 0 && e == 0) { // 0 a la 0 es una indeterminación, pero el metodo powExact retorna 1.
			throw new Exception ("Error: 0 a la 0 es una indeterminación");
		}
		else if (e < 0) { //Si e es un num negativo el resultado no sería un entero, esta condición también es cubierta por el try/catch
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