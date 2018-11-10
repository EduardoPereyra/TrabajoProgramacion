package condicion;

import java.util.Iterator;
import cliente.Usuario;
import pelicula.Pelicula;

public class ContieneAlgunGenero {
	
	public boolean cumple(Usuario u,Pelicula p) {
			Iterator<String> it = u.getGenerosPreferidos();
			while(it.hasNext()) {
				if(p.contieneCategoria(it.next())) {
					return true;
				}
			}
		return false;
	}
}
