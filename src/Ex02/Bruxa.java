package Ex02;

public class Bruxa extends Personagem {

	//O dano do ataque das bruxas é dado pelo dano 
	//do personagem dividido pela sua vitalidade (hp)	

	@Override
	public int atacar() {
		return dano/vida;
	}

	
}
