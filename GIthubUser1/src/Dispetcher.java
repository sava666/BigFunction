import java.util.Scanner;

public class Dispetcher {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number a: ");
		int a = reader.nextInt();
		System.out.println("Enter a number b: ");
		int b = reader.nextInt();
		reader.close();
		System.out.println(a);
		System.out.println(b);
}
}
