package com.fiap.globalMS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_ambiente")
public class Ambiente {

	public Ambiente() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ambiente")
	private long idAmbiente;
	
	@Column(name = "localizacao")
	private String localizacao;
	
	@Column(name = "temperatura")
	private String temperatura;
	
	@Column(name = "qualidadeAr")
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
