package Ex02;

public class Dragao extends Personagem {

	//O dano do ataque dos dragões é dividido pela distância relativa ao a seu alvo.
	
	protected int distancia;
	
	public Dragao(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public int atacar() {
		return  dano * distancia;
	}
	
}
