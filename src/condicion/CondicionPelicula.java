package condicion;

import cliente.Usuario;
import pelicula.Pelicula;

public interface CondicionPelicula {
	
	public abstract boolean cumple(Usuario u,Pelicula p);
}
