
public class DescontoLoja {

	public static void main(String[] args) {

		String opcompra;
		double valcompra, descacresc, parcelamento;

		valcompra = InOut.leDouble("Digite o valor da compra");
		opcompra = InOut.leString("Digite: "
				+ "" + "\nV - Para pagamento � vista "
				+ "\nCC - Para cr�dito � vista "
				+ "\nP - Para parcelamentos");

		switch (opcompra) {

		case "V":
		case "v":

			opcompra = "houve um desconto";

			descacresc = valcompra * 0.15;

			valcompra = valcompra - descacresc;

			break;

		case "CC":
		case "cc":

			opcompra = "houve um desconto";

			descacresc = valcompra * 0.10;

			valcompra = valcompra - descacresc;

			break;

		case "P":
		case "p":

			parcelamento = InOut
					.leDouble("Digite em quantas vezes voc� deseja parcelar: "
			+ "\n3 vezes\n6 vezes\n12 vezes");

			if (parcelamento == 3) {

				opcompra = "n�o houve desconto nem acr�scimo";

			} else if (parcelamento == 6) {

				opcompra = "houve um acr�scimo";

				descacresc = valcompra * 0.05;

				valcompra = valcompra + descacresc;

			} else if (parcelamento == 12) {

				opcompra = "houve um acr�scimo";

				descacresc = valcompra * 0.08;

				valcompra = valcompra + descacresc;

			} else {

				InOut.MsgDeErro("aten��o", "Digite um m�todo de parcelamento v�lido!");

				do {

					parcelamento = InOut.leDouble(
							"Digite em quantas vezes voc� deseja parcelar: " 
					+ "\n3 vezes\n6 vezes\n12 vezes");
				} while ((parcelamento != 3) && (parcelamento != 6) && (parcelamento != 12));

			}

			break;

		default:

			InOut.MsgDeErro("aten��o", "Digite um m�todo de pagamento v�lido!");

			do {

				opcompra = InOut.leString("Digite: " 
				+ "\nV - Para pagamento � vista "	
				+ "\nCC - Para cr�dito � vista "
				+ "\nP - Para parcelamentos");

			} while ((opcompra != "V") && (opcompra != "v") && (opcompra != "CC") && (opcompra != "cc")
					&& (opcompra != "P") && (opcompra != "p"));

		}

		InOut.MsgDeInformacao("Ol�", "Em sua conta " + opcompra + " e o valor a ser pago �: R$ " + valcompra);

	}

}
