
public class DiaDosNamorados extends CartaoWeb {

	public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.printf("Para: %s - Feliz Dia dos Namorados!", destinatario);
	}
	
}
