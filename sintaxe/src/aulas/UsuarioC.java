package aulas;
import java.util.Scanner;


public class UsuarioC {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Enter: a");
		double a = s.nextDouble();
    	System.out.println("Enter: b");
    	double b = s.nextDouble();
    	
		double r = calculadora.divisao(a,b);
		System.out.println("o resultado e : " + r);
		
		
		
	};
}
