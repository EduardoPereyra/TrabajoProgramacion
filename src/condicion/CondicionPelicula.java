package condicion;

import cliente.Usuario;
import pelicula.Pelicula;

public abstract class CondicionPelicula {
	
	public abstract boolean cumple(Usuario u,Pelicula p);
}
