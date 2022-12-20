package desafio_logica_4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o numero de frases a serem decifradas: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String phrase = readLine(sc);
			StringBuilder part1 = new StringBuilder(phrase.substring(0, phrase.length()/2));
			StringBuilder part2 = new StringBuilder(phrase.substring(phrase.length()/2,phrase.length()));
			part1.reverse();
			part2.reverse();
			String complete = part1.toString() + part2.toString();
			System.out.println(complete);

		}

		sc.close();
	}

	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}

}
