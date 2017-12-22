import java.util.Scanner;

public class Dispetcher {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter number a:");
		int a = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Enter number b:");
		int b = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		reader.close(); 

	}

}
