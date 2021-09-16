//Programa para calcular valor do pedido do cliente

//by: Pedro Henrique Bastos

//Ultima modificacao: 12/09/2021

public class Lanches {

	public static void main(String[] args) {

		int lanche, bebida, valorLanche, valorBebida, preco;

		lanche = InOut.leInt("Digite um valor de 100 a 104");
		bebida = InOut.leInt("Digite um valor de 90 a 92");

//comando para saber quanto ira valer o lanche

		switch (lanche) {

		case 100, 103:

			valorLanche = 12;

			break;

		case 101:

			valorLanche = 23;

			break;

		case 102:

			valorLanche = 25;

			break;

		case 104:

			valorLanche = 13;

			break;

		default:

			InOut.MsgDeAviso("ATENÇÂO", "Digite um valor válido entre 100 e 104");

			valorLanche = 0;

		}

//comando para saber o valor da bebida

		switch (bebida) {

		case 90:

			valorBebida = 5;

			break;

		case 91:

			valorBebida = 7;

			break;

		case 92:

			valorBebida = 9;

			break;

		default:

			InOut.MsgDeAviso("ATENÇÂO", "Digite um valor válido entre 90 e 92");

			valorBebida = 0;

		}

//condicional, caso pedido for 101 ou 102 o cliente nao ira pagar a bebida.

		if ((lanche == 101) && (bebida >= 90) && (bebida <= 92)) {

			InOut.MsgDeAviso("Resultado", "O valor a ser pago é R$ 23");

		} else if ((lanche == 102) && (bebida >= 90) && (bebida <= 92)) {

			InOut.MsgDeAviso("Resultado", "O valor a ser pago é R$ 25");

		} else {

			preco = valorLanche + valorBebida;

			InOut.MsgDeAviso("Resultado", "O valor a ser pago é: R$" + preco);

		}

	}
}
