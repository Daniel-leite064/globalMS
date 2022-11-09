package com.fiap.globalMS.models;

import java.util.Date;

public class VeiculoModel {

	private long idVeiculo;
	private double valorPreco;
	private String quilometragem;
	private String modelo;
	private String marca;
	private String placa;
	private Date dtAlteracao;
	private Date dtCadastro;
	
	public VeiculoModel() {
		
	}
	
	public long getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public double getValorPreco() {
		return valorPreco;
	}
	public void setValorPreco(double valorPreco) {
		this.valorPreco = valorPreco;
	}
	public String getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Date getDtAlteracao() {
		return dtAlteracao;
	}
	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	
	
	
}
