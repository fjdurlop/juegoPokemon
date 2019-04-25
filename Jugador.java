import java.util.*;

public class Jugador{
	private String nombre;
	private List<Pokemon> listaPokemones = new ArrayList<Pokemon>();
	private List<Pocion> listaPociones = new ArrayList<Pocion>();

	Jugador(String nombre,List<Pokemon> listaPokemones,List<Pocion> listaPociones){
		this.nombre = nombre;
		this.listaPokemones = listaPokemones;
		this.listaPociones = listaPociones;
	}

	public void guardarPokemon(Pokemon poke){
		int indice= checaIndice(poke.getNombre());
		listaPokemones.set(indice,poke);
	}
	public Pokemon elegirPokemon(Pokemon poke){
		int indice= checaIndice(poke.getNombre());
		return listaPokemones.get(indice);
	}
	public void usarPocion(){
		//saca pocion
		//utiliza
		//eliminar pocion de la lista
	}
	public void listarPokemon(){
		for(Pokemon poke : listaPokemones ){
			System.out.println(poke.getNombre()+"  Vida: "+poke.getVida()+"   Estado: "+poke.getEstado());
		}
	}

	public int checaIndice(String nombrePoke){
		for(int i=0; i<=listaPokemones.size()-1 ; i++){
			if(nombrePoke.equals(this.nombre)){
				return i;
			}
		}
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
}