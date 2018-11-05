package cliente;

import java.util.ArrayList;
import java.util.Iterator;
import pelicula.Pelicula;

public class Grupo extends Cliente{
	private ArrayList<Cliente> clientes;
	
	public void setCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public Iterator<String> getGenerosPreferidos() {
		ArrayList<String> generos_preferidos = new ArrayList<>();
		for(int i = 0; i < this.clientes.size(); i++) {
			Iterator<String> it = this.clientes.get(i).getGenerosPreferidos();
			while(it.hasNext()) {
				generos_preferidos.add(it.next());
			}
		}
		return  generos_preferidos.iterator();			
	}
	
	public void valorarPelicula(Pelicula pelicula, int granos_cafe) {
		for(int i = 0; i < this.clientes.size(); i++) {
			this.clientes.get(i).
		}		
	}

	public Iterator<Pelicula> getPeliculasVistas() {
		ArrayList<Pelicula> peliculasvistas = new ArrayList<>();
		for(int i = 0; i < this.clientes.size(); i++) {
			Iterator<Pelicula> it = this.clientes.get(i).getPeliculasVistas();
			while(it.hasNext()) {
				peliculasvistas.add(it.next());
			}
		}
		return  peliculasvistas.iterator();
	}
}
