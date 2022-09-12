package Ex02;

public class Orcs extends Personagem {
	
	protected int peso;
	
	//O dano do ataque do 
	//Orcs é dado pela multiplicação do dano pelo peso 
	//(que varia de acordo com as condições do jogo)
	
	public Orcs(int peso) {
		this.peso = peso;
	}

	@Override
	public int atacar() {
		return dano * peso;
	}
	
	
}
