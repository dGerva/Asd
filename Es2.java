import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.Scanner;

public class Somma {
	Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		int a, b;
		int c;
		java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		Scanner input = new Scanner (System.in);

		System.out.println("Somma");

		System.out.println("Immetti primo Numero");
		a = input.nextInt();

		System.out.println("Immetti secondo Numero");
		b = input.nextInt();

		c = a + b;
		System.out.println("La somma è "+ c);

	}
}
