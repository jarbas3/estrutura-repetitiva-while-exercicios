import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int alcohol = 0, gasoline = 0, diesel = 0, code;
		
		code = sc.nextInt();
		
		while (code != 4) {
			if (code == 1) {
				alcohol++;
			}
			else if (code == 2) {
				gasoline++;
			}
			else if (code == 3) {
				diesel++;
			}
			code = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcohol);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
