package Ex02;

public class Orcs extends Personagem {
	
	protected int peso;
	
	//O dano do ataque do 
	//Orcs � dado pela multiplica��o do dano pelo peso 
	//(que varia de acordo com as condi��es do jogo)
	
	public Orcs(int peso) {
		this.peso = peso;
	}

	@Override
	public int atacar() {
		return dano * peso;
	}
	
	
}
