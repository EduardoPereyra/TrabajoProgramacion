package comparator;

import java.util.Comparator;
import pelicula.Pelicula;

public class ComparadorPorVistas implements Comparator<Pelicula>{

	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		return (p1.getVecesVista() - p2.getVecesVista());
	}

}
