package aulas;

public class Usuario {
	public static void main(String[]args) {	
		SmartTv smartTv = new SmartTv();
		System.out.println("estado: "+smartTv.ligado);
		System.out.println("canal: " +smartTv.canal);
		System.out.println("volume: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo estado: "+smartTv.ligado);
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		System.out.println("Novo canal: " +smartTv.canal);
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		System.out.println("Novo volume: "+smartTv.volume);
	}
	
}
