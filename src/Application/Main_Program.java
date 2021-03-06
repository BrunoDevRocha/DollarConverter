package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main_Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Dollar's price $: ");
		double price = sc.nextDouble();
		System.out.print("How many Dollars will be bought? ");
		double amount = sc.nextDouble();

		double c = CurrencyConverter.Converter(price, amount);
		
		
		System.out.printf("Amount to be paid in Reais R$: %.2f", c);
		
		sc.close();

	}

}
