package buscador;

import pelicula.Pelicula;

public class BuscarAnd extends Busqueda{
	private Busqueda b1;
	private Busqueda b2;
	
	public BuscarAnd(Busqueda b1, Busqueda b2) {
		this.b1 = b1;
		this.b2 = b2;
	}
	@Override
	public boolean filtro(Pelicula p){
		return b1.filtro(p)&&b2.filtro(p);
	}

}
