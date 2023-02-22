package sintaxe_variaveis_fluso;

public class Principal2 {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Civic";
		meuCarro.anoDeFabricacao = 2009;
		meuCarro.cor = "Preto";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Palio";
		seuCarro.anoDeFabricacao = 2009;
		seuCarro.cor = "Preto";
	
		meuCarro.ligar();
		seuCarro.ligar();
		
	}

}
