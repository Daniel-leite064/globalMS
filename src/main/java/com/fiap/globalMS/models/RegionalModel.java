package com.fiap.globalMS.models;

import java.util.Date;
import java.util.List;

public class RegionalModel {

	public RegionalModel() {
		
	}
	
	private long idRegional;
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
