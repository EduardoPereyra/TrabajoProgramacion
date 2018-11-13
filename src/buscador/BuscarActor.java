package buscador;

import pelicula.Pelicula;

public class BuscarActor implements Busqueda{
	private String actor;
	
	public BuscarActor(String actor) {
		this.actor = actor;
	}

	@Override
	public  boolean filtro(Pelicula p){
		return p.getActores().contains(this.actor);
	}

}
