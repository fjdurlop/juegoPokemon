import java.util.*;

public class Juego{
	//Se recomienda crear una clase que lleve el control del flujo del juego (control de turnos, de
//Pokémon activos, menús, etc).

	List<Pokemon> listaPokemonesTodos = new ArrayList<Pokemon>();
	List<Pocion> listaPocionesTodas = new ArrayList<Pocion>();

	List<Pokemon> listaPokemonTemporal = new ArrayList<Pokemon>();
	List<Pocion> listaPocionesTemporal = new ArrayList<Pocion>();

	Pokemon poke1;
	Pokemon poke2;

	Scanner scanner = new Scanner(System.in);

	public void pideJugadores(){
		System.out.println("Ingresa la informacion del jugador 1:");
		Jugador jugador1 = infoJugador();
		System.out.println("Ingresa la informacion del jugador 2:");
		Jugador jugador2 = infoJugador();
	}
	public Jugador infoJugador(){
    	System.out.println("Nombre:");
    	String nombre = scanner.nextLine();
    	for(int i=0; i<6 ; i++){
    		listarTodosPokemones();
    		System.out.println("Numero del pokemon "+i +" para tu equipo:");
    		listaPokemonTemporal.add(listaPokemonesTodos.get(scanner.nextLine()));
    	}
    	listaPocionesTemporal.add(new Pocion("Vida"));
    	listaPocionesTemporal.add(new Pocion("Vida"));
    	listaPocionesTemporal.add(new Pocion("Defensa"));
    	listaPocionesTemporal.add(new Pocion("Defensa"));
    	listaPocionesTemporal.add(new Pocion("Ataque"));
    	listaPocionesTemporal.add(new Pocion("Ataque"));
    	Jugador jugador = new Jugador(nombre,listaPokemonTemporal,listaPocionesTemporal);

    	return jugador;
	}
	
	public void primerTurno(){
		jugador1.listarPokemon();
		System.out.println("J1->Elige tu primer pokemon para luchar:");
		String op= scanner.nextLine();
		int indice = Integer.parseInt(op);
		poke1 = jugador1.elegirPokemon(indice);		

	}

	public void turno(int turno){
		if(int==1){

		}
		else if(int==2){

		}
		else{
			System.out.println("Error en los turnos");
		}
	}

}