import java.util.Scanner;

public class Example {
	public static void main( String[] args ) {
		/**
		 * Le um valor introduzido pelo utilizador que vai definir o numero de
		 * eleitores
		 */

		Scanner numvotantes = new Scanner(System.in);
		int votantes = 0;

		do {

			System.out.print("Numero de eleitores: ");
			votantes = numvotantes.nextInt();

			if (votantes < 1)
				System.out.println("Numero de eleitores invalido. ");
			System.out.println("");

		} while (votantes < 1);

		int somaA = 0;
		int somaB = 0;
		int somaC = 0;
		int contadora = 0;
		int contadorb = 0;
		int contadorc = 0;
		boolean erro = false;

		/** Faz o scan das pontuacoes introduzidas pelo utilizador */

		for (int eleitor = 1; eleitor <= votantes; eleitor++) {

			System.out.println("");
			System.out
					.println("Eleitor "
							+ eleitor
							+ ", faca o favor de introduzir a pontuacao desejada. ( A soma das pontuacoes atribuidas a cada uma das opcoes nao deve exceder o numero 100 e, alem disso, nao deve atribuir valores negativos nem superiores a 100 a nenhuma das opcoes ).");
			System.out.println("");

			Scanner pontos = new Scanner(System.in);

			do {

				System.out.print("Pontuacao para A: ");
				int votoa = pontos.nextInt();

				System.out.print("Pontuacao para B: ");
				int votob = pontos.nextInt();

				System.out.print("Pontuacao para C: ");
				int votoc = pontos.nextInt();

				/** Aplica as restricoes */

				if (votoa > 100 || votob > 100 || votoc > 100
						|| votoa + votob + votoc > 100) {
					erro = true;

					System.out.println("");
					System.out
							.println("A pontuacao que introduziu nao respeita as regras. Efectue nova votacao");
					System.out.println("");

				}

				else {

					somaA += votoa;
					somaB += votob;
					somaC += votoc;
					erro = false;
					System.out.println("");
					System.out.println("Obrigado pelo seu voto");

					if (votoa > 0 && votoa <= 100)
						contadora++;
					if (votob > 0 && votob <= 100)
						contadorb++;
					if (votoc > 0 && votoc <= 100)
						contadorc++;
				}

			} while (erro);
		}

		/** Faz a media de cada uma das opcoes */

		double mediaA = Math.round(((double) somaA / (double) contadora) * 10.0) / 10.0;
		double mediaB = Math.round(((double) somaB / (double) contadorb) * 10.0) / 10.0;
		double mediaC = Math.round(((double) somaC / (double) contadorc) * 10.0) / 10.0;

		/**
		 * Imprime no ecra o valor da pontuacao obtida por cada uma das opcoes e
		 * tambem a media
		 */

		System.out.println("");

		System.out.println("Pontuacao total de A = " + somaA);
		System.out.println("Media de A = " + mediaA);

		System.out.println("");

		System.out.println("Pontuacao total de B = " + somaB);
		System.out.println("Media de B = " + mediaB);

		System.out.println("");

		System.out.println("Pontuacao total de C = " + somaC);
		System.out.println("Media de C = " + mediaC);
	}
}