package br.com.fiap.jpa.intity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_VEICULO")
public class Veiculo {

	
	public Veiculo(int codVeiculo, String placa, String cor, int ano) {
		super();
		this.codVeiculo = codVeiculo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}

	@Id
	@Column(name="CD_VEICULO")
	private int codVeiculo;
	
	@Column(name="DS_PLACA",nullable=false,length=9)
	private String placa;
	
	@Column(name="DS_COR",nullable=false,length=20)
	private String cor;
	
	@Column(name="NR_ANO")
	private int ano;

	public int getCodVeiculo() {
		return codVeiculo;
	}

	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}