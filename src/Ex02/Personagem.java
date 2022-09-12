package Ex02;

//Todos os personagens possuem pontos de dano (for�a do ataque) e um m�todo atacar()
//Todos os personagens possuem nome e vitalidade
//
//O dano do ataque do Orcs � dado pela multiplica��o do dano pelo peso (que varia de acordo com as condi��es do jogo)
//O dano do ataque das bruxas � dado pelo dano do personagem dividido pela sua vitalidade (hp)
//O dano do ataque dos drag�es � dividido pela dist�ncia relativa ao a seu alvo.

//Implemente um cliente que simule o dano do ataque de cada personagem.

public abstract class Personagem {
	
	protected String nome;
	protected int dano;
	protected int vida;
	
	public abstract int atacar();

	
}
