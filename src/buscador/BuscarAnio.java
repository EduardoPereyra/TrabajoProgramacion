package buscador;

import pelicula.Pelicula;

public class BuscarAnio implements Busqueda{
	private int anio;
	
	public BuscarAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public boolean filtro(Pelicula p){
		return p.getAnioEstreno() >= this.anio;
	}

}
