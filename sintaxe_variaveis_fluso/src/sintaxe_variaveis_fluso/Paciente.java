package sintaxe_variaveis_fluso;

public class Paciente {
	double peso;
	double altura;
	
	double calcularIndiceDeMassaCorporal() {
		double imc = peso / (altura * altura);
		return imc;
	}

}
