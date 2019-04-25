public class Pocion{
	//borrar nombre
	private String nombre;
	private String tipo;

	Pocion (String nombre, String tipo){
		this.nombre = nombre;
		this.tipo = tipo;
	}
	Pocion(String tipo){
		this.tipo=tipo;
	}

	
	public void usar(Pokemon prueba){
		if(tipo=="Vida"){
			prueba.setVida(prueba.getVida() * 1.2);
		}
		if(tipo=="Ataque"){
			prueba.setAtaque ( prueba.getAtaque() * 1.1);
		}
		if(tipo=="Defensa"){
			prueba.setDefensa (prueba.getDefensa() * 1.1);
		}
	}

	//getters setters
	public void getNombre(){
		return nombre;
	}

	public void getTipo(){
		return tipo;
	}

}