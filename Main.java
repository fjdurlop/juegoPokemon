public class Main {
	public static void main(String[] args) {
		Juego juego = new Juego();
		juego.pideJugadores();
		juego.primerTurno();
		do{
			juego.turno();//checar esta func en Juego.java
		}while(); //mientras alguien no pierda
		
		System.out.println("FIN DEL JUEGO");

	}
}