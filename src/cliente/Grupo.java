package cliente;

import java.util.ArrayList;
import java.util.Iterator;
import pelicula.Pelicula;

public class Grupo extends Usuario{
	private ArrayList<Usuario> usuarios;
	
	public void setCliente(Usuario c) {
		this.usuarios.add(c);
	}
	
	public Iterator<String> getGenerosPreferidos() {
		ArrayList<String> generos_preferidos = new ArrayList<>();
		for(int i = 0; i < this.usuarios.size(); i++) {
			Iterator<String> it = this.usuarios.get(i).getGenerosPreferidos();
			while(it.hasNext()) {
				generos_preferidos.add(it.next());
			}
		}
		return  generos_preferidos.iterator();			
	}
	
	public void valorarPelicula(Pelicula pelicula, int granos_cafe) {
		for(int i = 0; i < this.usuarios.size(); i++) {
			this.usuarios.get(i).valorarPelicula(pelicula,granos_cafe);
		}		
	}

	public Iterator<Pelicula> getPeliculasVistas() {
		ArrayList<Pelicula> peliculasvistas = new ArrayList<>();
		for(int i = 0; i < this.usuarios.size(); i++) {
			Iterator<Pelicula> it = this.usuarios.get(i).getPeliculasVistas();
			while(it.hasNext()) {
				peliculasvistas.add(it.next());
			}
		}
		return  peliculasvistas.iterator();
	}
}
