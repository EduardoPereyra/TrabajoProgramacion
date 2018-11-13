package condicion;

import java.util.Iterator;
import cliente.Usuario;
import pelicula.Pelicula;

public class ContieneTodosGeneros implements CondicionPelicula{

	public boolean cumple(Usuario u,Pelicula p) {
		
		Iterator<String> itUsuario = u.getGenerosPreferidos();
		while(itUsuario.hasNext()) {
			if(!p.contieneCategoria(itUsuario.next())) {
				return false;
			}
		}
		return true;
	}
}
