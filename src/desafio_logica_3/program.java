package desafio_logica_3;

import java.util.Arrays;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diff = 0;

		System.out.print("Digite o tamanho do array: ");
		int n = sc.nextInt();
		
		System.out.print("Digite o valor alvo: ");
		int k = sc.nextInt();
		
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			vect[i] = i+1;
		}

		System.out.println(Arrays.toString(vect));
		for (int i = 0; i < vect.length - 1; i++) {
			for (int j = 0; j < vect.length - 1; j++) {
				if (vect[i] == vect.length) {
					break;
				} else if (vect[j + 1] - vect[i] == k) {
					diff++;
				}

			}
		}


		System.out.println(diff);
		sc.close();

	}
}
