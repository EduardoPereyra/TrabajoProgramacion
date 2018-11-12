package cliente;

import java.util.ArrayList;
import java.util.Iterator;
import pelicula.Pelicula;

public class Grupo extends Usuario{
	private ArrayList<Usuario> usuarios;
	
	//Contructor
	public Grupo(String nombre) {	
		super(nombre);
		this.usuarios = new ArrayList<>();
	}
	
	//Gets y Sets
	public void setCliente(Usuario c) {
		this.usuarios.add(c);
	}
	
	public Iterator<String> getGenerosPreferidos() {
		ArrayList<String> generos_preferidos = new ArrayList<>();
		for(int i = 0; i < this.usuarios.size(); i++) {
			Iterator<String> it = this.usuarios.get(i).getGenerosPreferidos();
			while(it.hasNext()) {
				String aux = it.next();
				if(!generos_preferidos.contains(aux))
				generos_preferidos.add(aux);
			}
		}
		return  generos_preferidos.iterator();			
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
	
	//Funciones
	public void valorarPelicula(Pelicula pelicula, int granos_cafe) {
		for(int i = 0; i < this.usuarios.size(); i++) {
			this.usuarios.get(i).valorarPelicula(pelicula,granos_cafe);
		}		
	}
	
	public boolean noLaVio(Pelicula pelicula) {
		for(int i = 0; i < this.usuarios.size(); i++) {
			if(this.usuarios.get(i).noLaVio(pelicula)) { //si algun usuario la vio ya no es recomendable
				return false;
			}
		}
		return true;
	}
}
