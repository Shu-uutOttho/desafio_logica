package desafio_Logica_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.print("quantos numeros irá digita? ");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("digite um numero:  ");
			list.add(scan.nextInt());

		}

		List<Integer> listPar = list.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
		List<Integer> listImpar = list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());

		Collections.sort(listImpar, Collections.reverseOrder());
		System.out.println();
		System.out.println("Números Pares");
		listPar.stream().forEach(p -> System.out.println(p));
		System.out.println("Números Impares");
		listImpar.stream().forEach(i -> System.out.println(i));

		scan.close();
	}

}
