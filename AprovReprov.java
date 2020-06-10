import br.edu.uniopet.Reader;

public class AprovReprov {

	public static void main(String[] args) {

		double nota = Reader.readIntNotNull("Digite a nota do aluno: ");

		if (nota < 4) 
		{
			System.out.println("Reprovado");
		}
		
		else if (nota >= 4 && nota < 7) {
		    
	        System.out.println("Recuperação");
	        
		}else 
		{
			System.out.println("Aprovado");
		}
	}
}
