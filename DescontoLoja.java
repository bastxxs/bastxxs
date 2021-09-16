
public class DescontoLoja {

	public static void main(String[] args) {

		String opcompra;
		double valcompra, descacresc, parcelamento;

		valcompra = InOut.leDouble("Digite o valor da compra");
		opcompra = InOut.leString("Digite: "
				+ "" + "\nV - Para pagamento à vista "
				+ "\nCC - Para crédito à vista "
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
					.leDouble("Digite em quantas vezes você deseja parcelar: "
			+ "\n3 vezes\n6 vezes\n12 vezes");

			if (parcelamento == 3) {

				opcompra = "não houve desconto nem acréscimo";

			} else if (parcelamento == 6) {

				opcompra = "houve um acréscimo";

				descacresc = valcompra * 0.05;

				valcompra = valcompra + descacresc;

			} else if (parcelamento == 12) {

				opcompra = "houve um acréscimo";

				descacresc = valcompra * 0.08;

				valcompra = valcompra + descacresc;

			} else {

				InOut.MsgDeErro("atenção", "Digite um método de parcelamento válido!");

				do {

					parcelamento = InOut.leDouble(
							"Digite em quantas vezes você deseja parcelar: " 
					+ "\n3 vezes\n6 vezes\n12 vezes");
				} while ((parcelamento != 3) && (parcelamento != 6) && (parcelamento != 12));

			}

			break;

		default:

			InOut.MsgDeErro("atenção", "Digite um método de pagamento válido!");

			do {

				opcompra = InOut.leString("Digite: " 
				+ "\nV - Para pagamento à vista "	
				+ "\nCC - Para crédito à vista "
				+ "\nP - Para parcelamentos");

			} while ((opcompra != "V") && (opcompra != "v") && (opcompra != "CC") && (opcompra != "cc")
					&& (opcompra != "P") && (opcompra != "p"));

		}

		InOut.MsgDeInformacao("Olá", "Em sua conta " + opcompra + " e o valor a ser pago é: R$ " + valcompra);

	}

}
