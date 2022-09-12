import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		// Criando o Array
		ArrayList<CartaoWeb> listaCartao = new ArrayList<>();
		
		//Criando os metodos das classes
		DiaDosNamorados carta01 = new DiaDosNamorados("Athos");
		Natal carta02 = new Natal("Athos");
		Aniversario carta03 = new Aniversario("Athos");
		
		// Atribuindo os valores ao Array
		listaCartao.add(carta01);
		listaCartao.add(carta02);
		listaCartao.add(carta03);
		
		// Lendo o array
		for(CartaoWeb lista: listaCartao) {
			lista.showMessage();
		}
	}
	
}
