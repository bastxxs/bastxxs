
//Programa para calcular a m�dia ponderada semestral de um aluno V2.0

//por: Pedro Henrique Bastos

public class TarefaMediaPonderada {

	public static void main(String[] args) {

		double nota1, nota2, nota3, peso1, peso2, peso3, media1;

		InOut.MsgDeAviso("Media Ponderada Semestral", "Bem Vindo! \nVamos calcular sua m�dia ponderada semestral!");

		nota1 = InOut.leDouble("Digite sua primeira nota:");
		peso1 = InOut.leDouble("Digite o peso de sua primeira nota:");

		nota2 = InOut.leDouble("Digite sua segunda nota:");
		peso2 = InOut.leDouble("Digite o peso de sua segunda nota:");

		nota3 = InOut.leDouble("Digite sua terceira nota:");
		peso3 = InOut.leDouble("Digite o peso de sua terceira nota:");

		// Opera��o de calculo da m�dia
		media1 = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

		InOut.MsgDeAviso("M�dia Ponderada Semestral", "Sua m�dia ponderada semestral �: \n" + media1);

		// M�dia maior ou igual a 6 = passou de ano
		if (media1 >= 6) {

			InOut.MsgDeAviso("M�dia Ponderada Semestral", "Voc� passou de ano!");

		}
		// M�dia menor que 6 = reprovado
		else {
			InOut.MsgDeAviso("M�dia Ponderada Semestral", "Infelizmente sua nota n�o foi suficiente");
		}

	}

}
