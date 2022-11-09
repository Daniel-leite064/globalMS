package com.fiap.globalMS.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Regional {

	public Regional() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_regional")
	private long idRegional;
	
	@Column(name = "dt_operacao")
	private Date dtOperacao;
	
	private List<Veiculo> listaVeiculos;

	public long getIdRegional() {
		return idRegional;
	}

	public void setIdRegional(long idRegional) {
		this.idRegional = idRegional;
	}

	public Date getDtOperacao() {
		return dtOperacao;
	}

	public void setDtOperacao(Date dtOperacao) {
		this.dtOperacao = dtOperacao;
	}

	public List<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(List<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}

	
	
	
}
