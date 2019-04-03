package org.formacion.di.bbdd;


import org.formacion.di.negocio.Inventable;

public class InventarioBBDD implements Inventable {


	// Metodo de consulta a la base de datos
	
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}

}
