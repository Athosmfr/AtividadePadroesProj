package Ex02;

//Todos os personagens possuem pontos de dano (força do ataque) e um método atacar()
//Todos os personagens possuem nome e vitalidade
//
//O dano do ataque do Orcs é dado pela multiplicação do dano pelo peso (que varia de acordo com as condições do jogo)
//O dano do ataque das bruxas é dado pelo dano do personagem dividido pela sua vitalidade (hp)
//O dano do ataque dos dragões é dividido pela distância relativa ao a seu alvo.

//Implemente um cliente que simule o dano do ataque de cada personagem.

public abstract class Personagem {
	
	protected String nome;
	protected int dano;
	protected int vida;
	
	public abstract int atacar();

	
}
