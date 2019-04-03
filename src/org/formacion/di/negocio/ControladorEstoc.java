package org.formacion.di.negocio;

import org.formacion.di.bbdd.InventarioBBDD;

public class ControladorEstoc {
	
	
	public ControladorEstoc(InventarioBBDD inventario) {
		this.inventario = inventario;
	}

	public boolean necesitaReponer (String tienda, String producto) {
		int cantidadActual = inventario.numeroProductos(tienda, producto);
		
		return  cantidadActual < producto.length() * 100;
	}

}
