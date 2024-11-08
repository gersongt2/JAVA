package org.estados;

public enum EstadoBrasileiro {
	
	
	SAO_PAULO("SP","SAO PAULO",11),
	RIO_JANEIRO("RJ","RIO DE JANEIRO",12),
	PIAUI("PI", "Piaui",13),
	MARANHAO("MA", "MARANHÃO",14);
	
	private String sigla;
	private String nome ; 
	private int ibge;


	//constructor
	private EstadoBrasileiro( String sigla,String nome,int ibge) {
		this.nome = nome;
		this.sigla = sigla;
		this.ibge = ibge;
	}
	
	// method get
	public int getIbge() {
		return ibge;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

	
}
