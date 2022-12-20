package desafio_logica_2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		double valor =  scan.nextDouble();
		DecimalFormat df = new DecimalFormat("#");
		df.setRoundingMode(RoundingMode.DOWN);
		
		
		System.out.println("Notas");
		System.out.println(df.format(valor/100) + " nota(s) de R$ 100.00");
		valor = valor%100;
		System.out.println(df.format(valor/50) + " nota(s) de R$ 50.00");
		valor=valor%50;
		System.out.println(df.format(valor/20) + " nota(s) de R$ 20.00");
		valor=valor%20;
		System.out.println(df.format(valor/10) + " nota(s) de R$ 10.00");
		valor=valor%10;
		System.out.println(df.format(valor/5) + " nota(s) de R$ 5.00");
		valor=valor%5;
		System.out.println(df.format(valor/2) + " nota(s) de R$ 2.00");
		valor=valor%2;
		
		System.out.println();		
		
		System.out.println("Moedas");
		System.out.println(df.format(valor/1) + " nota(s) de R$ 1.00");
		valor=valor%1;
		System.out.println(df.format(valor/0.5) + " nota(s) de R$ 0.50");
		valor=valor % 0.50;
		System.out.println(df.format(valor/0.25) + " nota(s) de R$ 0.25");
		valor=valor%0.25;
		System.out.println(df.format(valor/0.10) + " nota(s) de R$ 0.10");
		valor=valor%0.10;
		System.out.println(df.format(valor/0.05) + " nota(s) de R$ 0.05");
		valor=valor%0.05;
		System.out.println(df.format(valor/0.01) + " nota(s) de R$ 0.01");

		
		scan.close();

	}

}
