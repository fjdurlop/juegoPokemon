public class Pocion{
	String nombre;
	String tipo;

	Pocion (String nombre, String tipo){
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public void usar(Pokemon prueba){
		if(tipo=="Vida"){
			prueba.vida = prueba.vida * 1.2;
		}
		if(tipo=="Ataque"){
			prueba.ataque = prueba.ataque * 1.1;
		}
		if(tipo=="Defensa"){
			prueba.defensa = prueba.defensa * 1.1;
		}
	}
}