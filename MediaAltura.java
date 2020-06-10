import br.edu.uniopet.Reader;

public class TimeFutebol {

	public static void main(String[] args) {

		double altura = 0;
		int numerojogadores = Reader.readIntNotNull("Digite o número de jogadores:").intValue();
		int i = 0;

		while (i < numerojogadores) {

			
			i = i + 1;

			altura = altura + Reader.readDoubleNotNull("Digite a altura do jogador:").doubleValue();

		}

		System.out.println("Media da altura é: " + altura / numerojogadores);

	}

}
 