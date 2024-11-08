package aulas;


public class classes {
	
	 int teste = 1;
	
    public static void main(String[] args) {
    	
    	classes classes = new classes();
    	
        System.out.println("Hello, World! teste");
        String NAME = "gt";
        int YEARS = 25 ;
        System.out.printf("My name is %s i have a %d years old " , NAME,YEARS);
        
        System.out.println(" ");
        System.out.println("variavel global : " + classes.teste);
        
        String pName = "Gerson";
        String sName = "Silva";
        String nomeC = nomeCompleto(pName , sName);
        System.out.print(nomeC);
        
    }
    
    
    public static String nomeCompleto (String pName , String sName) {
    	
    	return pName.concat(" ").concat(sName);
    	
    }

    
    
    
}
