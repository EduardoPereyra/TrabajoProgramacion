package buscador;

import pelicula.Pelicula;

public class BuscarDirector extends Busqueda{
	private String director;
	
	public BuscarDirector(String director) {
		this.director = director;
	}
	@Override
	public boolean filtro(Pelicula p){
		return p.getDirectores().contains(this.director);
	}

}
