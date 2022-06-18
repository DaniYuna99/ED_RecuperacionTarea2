package main.java.model;

public class Cadena {

	private Object contenido;
	
	
	public Cadena(Object contenido) {
		this.contenido = contenido;
	}
	
	
	
	public boolean esCapicua() {
		
		/*He quitado la condición que usaba la palabra reservada "instanceof" de la variable "content", 
		que limitaba el método a sólo Integers. He eliminado los métodos "esAnagrama()" y lo he acoplado a 
		este y al genérico de debajo para que funcionen para variables numéricas y cadenas.*/
		
		String content = String.valueOf(this.contenido);
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		//Parte adonde se redirige la variable si es un Integer, Double, Long y Float
		if (capicua && (this.contenido instanceof Integer || this.contenido instanceof Double || this.contenido instanceof Long || this.contenido instanceof Float)) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		
		//Parte adonde se redirige la variable si es un String		
		}else if (capicua && this.contenido instanceof String) {
			content = content.toLowerCase();
			
			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		
		return capicua;
		
	}
	
	
	/*He comprimido los metodos hechos para cada tipo de variable, haciendo uno solo 
	 * generico, para que admita Long, Integer y Double y String. He anadido que también admita Floats*/
	public static <T> boolean esCapicua(T variable) {

		boolean capicua = false;
	
		String contenido = String.valueOf(variable);
		capicua = contenido!=null && !contenido.isEmpty() && !contenido.trim().isEmpty();
			
			//Parte adonde se redirige la variable si es un Integer, Double, Long y Float
			if(capicua && (variable instanceof Integer || variable instanceof Double || variable instanceof Long || variable instanceof Float)) {
	
				for(int i=0; i<Integer.valueOf(contenido.length()/2); i++) {
					if(!Character.isDigit(contenido.charAt(i)) || contenido.charAt(i)!=contenido.charAt(contenido.length()-i-1)) {
						capicua = false;
					}
				}
				
			//Parte adonde se redirige la variable si es un String		
			}else if (capicua && variable instanceof String) {
				contenido = contenido.toLowerCase();
				
				for(int i=0; i<Integer.valueOf(contenido.length()/2); i++) {
					if(!Character.isAlphabetic(contenido.charAt(i)) || contenido.charAt(i)!=contenido.charAt(contenido.length()-i-1)) {
						capicua = false;
					}
				}
			}
		
		return capicua;
		
	}
	
}

