package sintaxe_variaveis_fluso;

public class Programa {

	public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco.logradouro  = "Avenida XYZ";
        
        System.out.println(p.endereco.logradouro);
	}

}
