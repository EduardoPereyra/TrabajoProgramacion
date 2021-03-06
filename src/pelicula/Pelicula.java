package pelicula;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import cliente.Persona;

public class Pelicula {
	private Hashtable <Persona,Integer> votos;
	private ArrayList<String> actores;
	private ArrayList<String> directores;
	private ArrayList<String> categorias;
	private String titulo;
	private String sinopsis;
	private int anio_estreno;
	private int duracion;
	
	//Contructor
	public Pelicula(String titulo, String sinopsis, int anio_estreno, int duracion) {
		super();
		this.actores = new ArrayList<>();
		this.directores = new ArrayList<>();
		this.categorias = new ArrayList<>();
		this.votos = new Hashtable<>();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.anio_estreno = anio_estreno;
		this.duracion = duracion;
	}
	
	//Gets y Sets
	public void setActor(String actor) {
		this.actores.add(actor);
	}
	
	public void setDirector(String director) {
		this.directores.add(director);
	}
	
	public void setCategoria(String categoria) {
		this.categorias.add(categoria);
	}
	
	public ArrayList<String> getActores() {
		ArrayList<String> copy = new ArrayList<>(this.actores);
		return copy;
	}
	
	public ArrayList<String> getDirectores() {
		ArrayList<String> copy = new ArrayList<>(this.directores);
		return copy;
	}
	
	public ArrayList<String> getCategorias() {
		ArrayList<String> copy = new ArrayList<>(this.categorias);
		return copy;		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	public int getAnioEstreno() {
		return anio_estreno;
	}
	
	public void setAnioEstreno(int anio_estreno) {
		this.anio_estreno = anio_estreno;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setVoto(Persona persona, int voto) {
		Integer n = (Integer) voto;
		this.votos.put(persona, n);
	}
	
	public int getVecesVista() { //Para agregar una pelicula como vista tiene que votarla
		return this.votos.size();
	}	
	
	public double getPuntuacionPromedio() {
		double suma = 0;
		Iterator<Persona> iteVotos = this.votos.keySet().iterator();
		while(iteVotos.hasNext()) {
			Persona persona = iteVotos.next();
			suma += this.votos.get(persona);
		}
		if(getVecesVista() != 0) {
			return suma/getVecesVista();
		}
		return 0;
	}
	
	//Funciones
	public boolean contieneCategoria(String c) {
		return this.categorias.contains(c);
	}
	
	//Equals
	public boolean equals(Pelicula p) {
		if(this.titulo.equals(p.getTitulo())) {
			return true;
		}
		return false;
	}
}
