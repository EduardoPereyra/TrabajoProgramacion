package condicion;

import java.util.ArrayList;
import java.util.Iterator;
import cliente.Usuario;
import pelicula.Pelicula;

public class ContieneTodosGeneros extends CondicionPelicula{

	public boolean cumple(Usuario u,Pelicula p) {
		ArrayList<String> categorias = p.getCategorias();
		Iterator<String> it = u.getGenerosPreferidos();
		while(it.hasNext()) {
			if(!categorias.contains(it.next())) {
				return false;
			}
		}
		return true;
	}
}
