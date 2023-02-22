package sintaxe_variaveis_fluso;

public class If_Else {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		if(idade >=18) {
			System.out.println("Vc tem mais de 18 anos");
		}else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, mas esta acompanhado "
									+ "por Maior de 18. Pode entrar");
			} else {
			System.out.println("Infelizmente você não pode entrar.");
			}
		}
	}
}
