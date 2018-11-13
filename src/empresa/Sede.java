package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import buscador.Busqueda;
import cliente.Usuario;
import comparator.ComparadorPorVistas;
import condicion.CondicionPelicula;
import condicion.ContieneAlgunGenero;
import pelicula.Pelicula;

public class Sede /*extends Busqueda*/{
	private ArrayList <Pelicula> peliculas;
	private ArrayList <Usuario> usuarios;
	private Comparator<Pelicula> comparador;
	private CondicionPelicula condicionPelicula;
	private String nombre;
	
	//Contructor
	public Sede(String nombre) {
		this.nombre = nombre;
		this.comparador  = new ComparadorPorVistas();
		this.condicionPelicula = new ContieneAlgunGenero();
		this.peliculas = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}

	//Gets y Sets
	public void setComparador(Comparator<Pelicula> comparador) {
		this.comparador = comparador;
	}

	public void setCondicionPelicula(CondicionPelicula condicionPelicula) {
		this.condicionPelicula = condicionPelicula;
	}

	public Iterator<Pelicula> getPeliculas() {
		return this.peliculas.iterator();
	}

	public void setPelicula(Pelicula pelicula) {
		this.peliculas.add(pelicula);
	}
	
	public Pelicula getPelicula(String titulo) {
		for(int i = 0; i < this.peliculas.size(); i++) {
			if(this.peliculas.get(i).getTitulo().equals(titulo)) {
				return this.peliculas.get(i);
			}
		}
		return null;
	}
	
	public Iterator<Usuario> getUsuarios() {
		return this.usuarios.iterator();
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios.add(usuarios);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Funciones
	public ArrayList<Pelicula> recomendar(Usuario usuario,int cantidad_peliculas) {
		return this.recomendar(usuario, cantidad_peliculas, this.condicionPelicula, this.comparador);
	}

	public ArrayList<Pelicula> recomendar(Usuario usuario,int cantidad_peliculas,CondicionPelicula c, Comparator<Pelicula> ordenamiento) {
		ArrayList <Pelicula> peliculas_recomendables = new ArrayList<>();
		for(Pelicula p : this.peliculas) {
			if((!usuario.laVio(p))&&(c.cumple(usuario, p))) {
				peliculas_recomendables.add(p);
			}
		}
		Collections.sort(peliculas_recomendables, ordenamiento.reversed());
		if(peliculas_recomendables.size() > cantidad_peliculas) {
			return new ArrayList<Pelicula>(peliculas_recomendables.subList(0,cantidad_peliculas));
		}
		return peliculas_recomendables;
	}

	public ArrayList<Pelicula> busqueda(Busqueda buscar) {
		ArrayList <Pelicula> peliculas_encontradas = new ArrayList<>();
		for(Pelicula p : this.peliculas) {
			if(buscar.filtro(p)) {
				peliculas_encontradas.add(p);
			}
		}
		return peliculas_encontradas;
	}
}
