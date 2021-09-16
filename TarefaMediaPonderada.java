
//Programa para calcular a média ponderada semestral de um aluno V2.0

//por: Pedro Henrique Bastos

public class TarefaMediaPonderada {

	public static void main(String[] args) {

		double nota1, nota2, nota3, peso1, peso2, peso3, media1;

		InOut.MsgDeAviso("Media Ponderada Semestral", "Bem Vindo! \nVamos calcular sua média ponderada semestral!");

		nota1 = InOut.leDouble("Digite sua primeira nota:");
		peso1 = InOut.leDouble("Digite o peso de sua primeira nota:");

		nota2 = InOut.leDouble("Digite sua segunda nota:");
		peso2 = InOut.leDouble("Digite o peso de sua segunda nota:");

		nota3 = InOut.leDouble("Digite sua terceira nota:");
		peso3 = InOut.leDouble("Digite o peso de sua terceira nota:");

		// Operação de calculo da média
		media1 = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

		InOut.MsgDeAviso("Média Ponderada Semestral", "Sua média ponderada semestral é: \n" + media1);

		// Média maior ou igual a 6 = passou de ano
		if (media1 >= 6) {

			InOut.MsgDeAviso("Média Ponderada Semestral", "Você passou de ano!");

		}
		// Média menor que 6 = reprovado
		else {
			InOut.MsgDeAviso("Média Ponderada Semestral", "Infelizmente sua nota não foi suficiente");
		}

	}

}
