package org.estados;

public class SistemaIbge {

	public static void main(String[] args) {
		
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			
			System.out.println(e.getNome() + " - " + e.getSigla() + " N-" + e.getIbge() );
		}

	}

}
