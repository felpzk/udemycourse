//Crie um programa para ler cotacao do dolar, depois um valor em dolares a ser comprado por uma pessoa
//Informar quantos reais a pessoa vai pagar pelos dolares
// adicionar 6% de IOF sobre o valor em dolar

package CurrencyConverter.app;

import java.util.Locale;
import java.util.Scanner;

import CurrencyConverter.util.CalculatorPrice;



public class CurrencyConverter {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What's the dollar price?");
        double dollar = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dollarbought = sc.nextDouble();

        double res = CalculatorPrice.CurrencyConverted(dollar, dollarbought);

        System.out.printf("Amount to be paid in reais = %.2f%n", res);

        sc.close();
    }
}
