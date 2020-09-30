package progetto_maven_test;

public class Arnia {
	
	String nomeArnia;
	boolean completamentoRaccolta;
	boolean fineTrattamento;
	int numeroTrattamenti;
	
	
	public Arnia (String nomeArn, boolean completamentoRac, boolean fineTrat, int numeroTrat)
	{
		this.nomeArnia=nomeArn;
		this.completamentoRaccolta=completamentoRac;
		this.fineTrattamento=fineTrat;
		this.numeroTrattamenti=numeroTrat;
	}
	
	boolean getStatusRaccolta()
	{
		return completamentoRaccolta;
	}
	

	boolean getStatusTrattamento()
	{
		return fineTrattamento;
	}
	
	int getNumeroTrattamenti()
	{
		return numeroTrattamenti;
	}
}
