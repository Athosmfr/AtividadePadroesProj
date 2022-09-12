
public class Natal extends CartaoWeb {

	public Natal(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.printf("\nPara: %s - Feliz Natal!", destinatario);
	}

}
