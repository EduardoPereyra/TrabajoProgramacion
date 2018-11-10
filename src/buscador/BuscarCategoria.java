package buscador;

import pelicula.Pelicula;

public class BuscarCategoria extends Busqueda{
	private String categoria;
	
	public BuscarCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public boolean filtro(Pelicula p){
		return p.getCategorias().contains(this.categoria);
	}

}
