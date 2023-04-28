package com.cursoceat.servicios;

public interface Validacion {

	/**
	 * 
	 * @param texto
	 * @return texto con la primera letra en may�scula.
	* @Description m�todo para pasar la primera letra a may�scula de cualquier texto
	*/
public default String pasarPmayuscula(String texto) {
	texto = texto.toLowerCase(); //paso todo el texto a min�sculas
	String[] arrayTexto = texto.split(" "); //si es m�s de una palabra la separamos en una array
	String temp =""; //creo la variable que se formar� por cada interacci�n del bucle que recorre el array
	for (int i = 0; i<arrayTexto.length; i++) { //recorremos el array
		arrayTexto[i] = arrayTexto[i].substring(0,1).toUpperCase()+arrayTexto[i].substring(1); //pasamos la primera letra de cada palabra en may�scula
		temp+=arrayTexto[i]+" "; //lo acumulamos en el temp
	}
	return temp.trim(); //enviamos temp ya formateada y quitamos espacios del principio y final
}

	public default boolean validaCantidad(String cantidadP) {
		try {	
			int cantidad=Integer.parseInt(cantidadP);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
