package cursojava.basico;
/*
 * classe demonstrativa de variaveis e constantes
 * Vers�o:1.0
 * Autor:nicholas bezerra cirqueira
 *  * */
public class Variaveiseconstantes {

	public static void main(String[] args) {
		//Cria��o de constantes
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		//Cria��o de Vari�veis
		String nome = "jose"; 
		int idade = 48;
		double peso = 74.5, altura = 1.73;
		char sexo = 'm', cnh = 'a';
		boolean doadorOrgaos = true;
		
		System.out.println("Nome: "+ nome);
		System.out.println("idade: " + idade);
		System.out.println("peso: " + peso);
		System.out.println("altura: " + altura);
		System.out.println("sexo: " + sexo);
		System.out.println("Habilita��o: " + cnh);
		System.out.println("Doador de Org�os: " + doadorOrgaos);
		System.out.println("Gravidade na terra �: " +ACELERACAO_GRAVIDADE_TERRA+ "m/s2" );
		
		
		

	}

}
