package desafio_Logica_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listPar = new ArrayList<Integer>();
		List<Integer> listImpar = new ArrayList<Integer>();

		System.out.print("quantos numeros irá digita? ");
		int line = scan.nextInt();

		for (int i = 0; i < line; i++) {
			list.add(scan.nextInt());
		}

		for (int i : list) {
			if (i % 2 == 0) {
				listPar.add(i);
			}

		}
		for (int i : list) {
			if (i % 2 == 1) {
				listImpar.add(i);
			}

		}
		Collections.sort(listPar);
		Collections.sort(listImpar,Collections.reverseOrder());
		
		
		for (int i : listPar) {
			System.out.println(i);
		}
		for (int i : listImpar) {
			System.out.println(i);
		}

		scan.close();
	}

}
