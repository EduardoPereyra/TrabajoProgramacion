package main;

//import java.util.Iterator;
import pelicula.Pelicula;
import empresa.Sede;
import cliente.Grupo;
import cliente.Persona;
//import buscador.BuscarActor;
//import buscador.BuscarAnd;
//import buscador.BuscarAnio;
//import buscador.BuscarCategoria;
//import buscador.BuscarDirector;
//import buscador.BuscarOr;
//import condicion.ContieneAlgunGenero;
//import condicion.ContieneTodosGeneros;
//import comparator.ComparadorPorPromedio;
//import comparator.ComparadorPorVistas;


public class Main {

	public static void main(String[] args) {
		
		//Creacion sede
		Sede pop_corn_time = new Sede("Pop Corn Time");
		
		//Creacion Personas
		Persona lisa = new Persona("Lisa", 8);
		lisa.setGeneroPreferido("Romántico");
		lisa.setGeneroPreferido("Musical");
		lisa.setGeneroPreferido("Infantil");
		lisa.setGeneroPreferido("Aventura");

		Persona bart = new Persona("Bart", 10);
		bart.setGeneroPreferido("Musical");
		bart.setGeneroPreferido("Infantil");
		bart.setGeneroPreferido("Aventura");
		bart.setGeneroPreferido("Accion");
		
		Persona maggie = new Persona("Maggie", 1);
		maggie.setGeneroPreferido("Musical");
		maggie.setGeneroPreferido("Infantil");
		maggie.setGeneroPreferido("Aventura");
		
		Persona marge = new Persona("Marge", 30);
		marge.setGeneroPreferido("Romántico");
		marge.setGeneroPreferido("Musical");
		marge.setGeneroPreferido("Infantil");
		marge.setGeneroPreferido("Aventura");
		
		Persona homero = new Persona("Homero", 30);
		homero.setGeneroPreferido("Musical");
		homero.setGeneroPreferido("Infantil");
		homero.setGeneroPreferido("Accion");
		
		//Agregar los usuarios a la sede
		pop_corn_time.setUsuarios(lisa);
		pop_corn_time.setUsuarios(bart);
		pop_corn_time.setUsuarios(maggie);
		pop_corn_time.setUsuarios(marge);
		pop_corn_time.setUsuarios(homero);
		
		//Creacion de Grupos
		Grupo hombres_simpson = new Grupo("Hombres Simpson");
		hombres_simpson.setCliente(bart);
		hombres_simpson.setCliente(homero);
		
		Grupo hermanos_simpson = new Grupo("Hermanos Simpson");
		hermanos_simpson.setCliente(lisa);
		hermanos_simpson.setCliente(bart);
		hermanos_simpson.setCliente(maggie);
		
		Grupo familia_simpson = new Grupo("Familia Simpson");
		familia_simpson.setCliente(hermanos_simpson);
		familia_simpson.setCliente(homero);
		familia_simpson.setCliente(marge);
		
		//Agregar los grupos a la sede
		pop_corn_time.setUsuarios(hombres_simpson);
		pop_corn_time.setUsuarios(hermanos_simpson);
		pop_corn_time.setUsuarios(familia_simpson);
		
		//Creacion de peliculas
		Pelicula up = new Pelicula("Up","Carl Fredricksen es un vendedor de globos de 78 años de edad dispuesto a cumplir su sueño:"+
									" atar miles de globos a su casa y volar a Sudamérica. Sin embargo,"+
									" descubre demasiado tarde a un joven e inesperado polizón. Lo que en principio será recelo,"+
									" acabará por tornarse simpatía hacia el muchacho mientras juntos pasan fascinantes aventuras en exóticos lugares.",
									2009,130);
		up.setDirector("Pete Docter");
		up.setDirector("Bob Peterson");
		up.setActor("Pete Docter");
		up.setActor("Bob Peterson");
		up.setActor("Jordan Nagai");
		up.setCategoria("Infantil");
		up.setCategoria("Accion");
		up.setCategoria("Drama");
		
		Pelicula los_simpson = new Pelicula("Los Simpson",
											"La combinación de Homero (Dan Castellaneta), su nuevo puerco mascota, "+ 
											"y un silo lleno de excremento podrían provocar un desastre que amenace no sólo a Springfield,"+
											" sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,"+ 
											" dividiendo a la familia. Con el destino de la Tierra en equilibrio,"+
											" Homero se prepara para intentar redimirse con la intención de salvar al mundo y ganarse el perdón de Marge (Julie Kavner).",
											2007,110);
		
		los_simpson.setDirector("David Silverman");
		los_simpson.setActor("Dan Castellaneta");
		los_simpson.setActor("Harry Shearer");
		los_simpson.setActor("Julie Kavner");
		los_simpson.setCategoria("Romantico");
		los_simpson.setCategoria("Musical");
		los_simpson.setCategoria("Infantil");
		los_simpson.setCategoria("Aventura");
		los_simpson.setCategoria("Comedia");
		
		Pelicula los_increibles = new Pelicula("Los Increibles","Un súper héroe retirado lucha contra el aburrimiento en un suburbio y junto con su"+ 
												"familia tiene la oportunidad de salvar al mundo.",
												2004,90);
		los_increibles.setDirector("Brad Bird");
		los_increibles.setActor("Brad Bird");
		los_increibles.setActor("Craig T. Nelson");
		los_increibles.setActor("Holly Hunter");
		los_increibles.setCategoria("Musical");
		los_increibles.setCategoria("Infantil");
		los_increibles.setCategoria("Aventura");
		los_increibles.setCategoria("Accion");
		
		Pelicula los_increibles2 = new Pelicula("Los Increibles 2",
												" Helen entra en acción y debe luchar contra un cibercriminal que planea hipnotizar el mundo a través de las pantallas de las computadoras."+
												" Eso deja al Sr. Increíble con uno de sus mayores desafíos: quedarse en casa y cuidar de tres niños traviesos.",
												2018,120);
		los_increibles2.setDirector("Brad Bird");
		los_increibles2.setActor("Brad Bird");
		los_increibles2.setActor("Craig T. Nelson");
		los_increibles2.setActor("Holly Hunter");
		los_increibles2.setCategoria("Musical");
		los_increibles2.setCategoria("Infantil");
		los_increibles2.setCategoria("Aventura");
		los_increibles2.setCategoria("Accion");
		
		Pelicula toy_story = new Pelicula("Toy Story",
											"Lo mejor de la animación computarizada produce esta historia sobre juguetes que cobran vida cuando su dueño se ausenta.",
											1995,120);
		toy_story.setDirector("John Lasseter");
		toy_story.setActor("Tim Allen");
		toy_story.setActor("Tom Hanks");
		toy_story.setActor("Don Rickles");
		toy_story.setActor("Wallace Shawn");
		toy_story.setCategoria("Infantil");
		toy_story.setCategoria("Aventura");
		toy_story.setCategoria("Accion");
		
		Pelicula monstersinc = new Pelicula("Monsters Inc.",
											"Monsters, Incorporated es la fábrica de sustos más grande en el mundo de los"+ 
											" monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores. Sullivan es un monstruo "+ 
											"grande e intimidante de piel azul, grandes manchas color púrpura y cuernos. Su asistente, mejor amigo y "+ 
											"compañero de cuarto es Mike Wazowski (Billy Crystal), un pequeño y alegre monstruo verde con un solo ojo."+ 
											" Boo (Mary Gibbs), una niña pequeña visita lugares en donde nunca antes había estado un ser humano.",
											2001,90);
		monstersinc.setDirector("Pete Docter");
		monstersinc.setActor("John Goodman");
		monstersinc.setActor("Billy Crystal");
		monstersinc.setActor("John Ratzenberger");
		monstersinc.setCategoria("Infantil");
		monstersinc.setCategoria("Musical");
		monstersinc.setCategoria("Aventura");
		monstersinc.setCategoria("Accion");
		
		//Agregar votos a las peliculas
		los_increibles.setVoto(lisa,5);
		los_increibles.setVoto(bart,2);
		los_increibles.setVoto(homero,4);
		los_increibles.setVoto(marge,2);
		los_increibles2.setVoto(marge,5);
		toy_story.setVoto(maggie,1);
		
		//Agregar las peliculas a la sede
		pop_corn_time.setPelicula(up);
		pop_corn_time.setPelicula(los_simpson);
		pop_corn_time.setPelicula(los_increibles);
		pop_corn_time.setPelicula(los_increibles2);
		pop_corn_time.setPelicula(toy_story);
		pop_corn_time.setPelicula(monstersinc);
	}
}
