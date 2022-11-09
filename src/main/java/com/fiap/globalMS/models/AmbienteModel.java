package com.fiap.globalMS.models;

public class AmbienteModel {

	public AmbienteModel() {
		
	}
	
	private long idAmbiente;
	private String localizacao;
	private String temperatura;
	private String qualidadeAr;
	
	public long getIdAmbiente() {
		return idAmbiente;
	}
	public void setIdAmbiente(long idAmbiente) {
		this.idAmbiente = idAmbiente;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getQualidadeAr() {
		return qualidadeAr;
	}
	public void setQualidadeAr(String qualidadeAr) {
		this.qualidadeAr = qualidadeAr;
	}
	
}
