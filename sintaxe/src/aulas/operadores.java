package aulas;
import java.util.Scanner;

public class operadores {
	
	boolean tv = true;
	
	public void tvl() {
		tv = tv==true?!tv:!tv;
		System.out.println(tv);
		}
		

	
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    	System.out.println("Enter username");       
	    	String userName = myObj.nextLine();  // Read user input
	    	System.out.println("Username is: " + userName);  // Output user input
	    
	    	System.out.println("Enter a");
	    	int a = myObj.nextInt();
	    	System.out.println("Enter b");
	    	int b = myObj.nextInt();
	    	int soma = a + b; 
	    	soma = soma*4;
	    	System.out.println("resultado: " + ++ soma);  // Output user input

	    	String resultado = soma>20?"E maior q vinte: " + soma : "nao e maior q 20 :" + soma;
	    	System.out.println(resultado);
	    	
	    	operadores operador = new operadores();
	    	System.out.println(operador.tv);
	    	operador.tvl();
	    	
	    	

	  }
	


}
