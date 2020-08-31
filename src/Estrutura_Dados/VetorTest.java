package Estrutura_Dados;

public class VetorTest {

	public static void main(String[] args) {
		
		stringVetor();
		charVetor();
		tempVetor();
	}

	private static void tempVetor() {
		
		 Vetor vetTemp = new Vetor();
		 
		 vetTemp.Empty();
		 vetTemp.Cheia();
			 
		 vetTemp.adicionaInicio("4c");
		 vetTemp.adicionaFinal("150c");
		 vetTemp.adiciona(1, "451c");
		 vetTemp.adiciona("78c");
		 vetTemp.adiciona("987c");
		 vetTemp.removeInicio();
		 vetTemp.removeFinal();
		 vetTemp.remove(2);
		 vetTemp.adiciona("987c");
		 vetTemp.adiciona("977c");
		 vetTemp.adiciona("93c");
		
		 System.out.println(vetTemp.toString());
	}

	private static void charVetor() {
		
		Vetor vetChar = new Vetor();
		 
	       vetChar.Empty();
	       vetChar.Cheia();
			 
			 vetChar.adicionaInicio('N');
			 vetChar.adicionaFinal('J');
			 vetChar.adiciona(1, '5');
			 vetChar.adiciona('8');
			 vetChar.adiciona('j');
			 vetChar.removeInicio();
			 vetChar.removeFinal();
			 vetChar.remove(2);
			 vetChar.adiciona('k');
			 vetChar.adiciona('ç');
			 vetChar.adiciona('p');
			
			 System.out.println(vetChar.toString());
	}

	private static void stringVetor() {
		
        Vetor vetString = new Vetor();
		 
		 vetString.Empty();
		 vetString.Cheia();
		 
		 vetString.adicionaInicio("Teste");
		 vetString.adicionaFinal("Fim 9/11");
		 vetString.adiciona(1, "Latitude 33");
		 vetString.adiciona("Jose da silva");
		 vetString.adiciona("Alton Pererira");
		 vetString.removeInicio();
		 vetString.removeFinal();
		 vetString.remove(2);
		 vetString.adiciona("Jose da silva");
		 vetString.adiciona("Alton Pererira");
		 vetString.adiciona("Amarildo jose");
				 
		 System.out.println(vetString.toString());
	}
}
