package Ex02;

public class Dragao extends Personagem {

	//O dano do ataque dos drag�es � dividido pela dist�ncia relativa ao a seu alvo.
	
	protected int distancia;
	
	public Dragao(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public int atacar() {
		return  dano * distancia;
	}
	
}
