package sintaxe_variaveis_fluso;

public class Principal3 {

	public static void main(String[] args) {
		Paciente p = new Paciente();
		p.peso = 122.5;
		p.altura = 1.78;
		
		double imcCalculado = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("IMC do Paciente : " + imcCalculado);

	}

}
