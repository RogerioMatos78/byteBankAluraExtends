package sintaxe_variaveis_fluso;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao; // 0
	boolean biCombustivel; // false
	
	Proprietario dono; // null
	
	void ligar() {
		System.out.println("Ligando o Carro: " + modelo);
		System.out.println("Cor do Carro: " + cor);
	}
}
