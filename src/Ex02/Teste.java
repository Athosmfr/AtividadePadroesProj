package Ex02;

public class Teste {
	
	public static void main(String[] args) {
		
		// Criando um Orc
		Orcs o01 = new Orcs(50);
		o01.nome = "Pipo";
		o01.dano = 200;
		o01.vida = 2000;
		
		// Criando uma Bruxa
		Bruxa b01 = new Bruxa();
		b01.nome = "Krav";
		b01.dano = 400000;
		b01.vida = 2000;
		
		// Criando um Dragao
		Dragao d01 = new Dragao(4);
		d01.nome = "Carlinhos";
		d01.dano = 4000;
		d01.vida = 5000;
		
		// Saida dos Personagens Criados
		
		System.out.printf("Personagem: %s - Dano: %d - Vida: %d - Peso: %d", o01.nome, o01.dano, o01.vida, o01.peso);
		System.out.printf("\nPersonagem: %s - Dano: %d - Vida: %d", b01.nome, b01.dano, b01.vida);
		System.out.printf("\nPersonagem: %s - Dano: %d - Vida: %d - Distância: %d", d01.nome, d01.dano, d01.vida, d01.distancia);
		
		// Saida do Dano Causado por cada Personagem
		System.out.printf("\n\n%s Causou %d de Dano.", o01.nome, o01.atacar());
		System.out.printf("\n%s Causou %d de Dano.", b01.nome, b01.atacar());
		System.out.printf("\n%s Causou %d de Dano.", d01.nome, d01.atacar());
		
	}

}
