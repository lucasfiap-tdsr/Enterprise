package br.com.fiap.jpa.intity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PASSAGEIRO")
@SequenceGenerator(name="passageiro",sequenceName="SQ_T_PASSAGEIRO",allocationSize=1)
public class Passageiro {
	
	@Id
	@GeneratedValue(generator="passageiro",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_PASSAGEIRO")
	private int codigoPassageiro;
	
	@Column(name="NM_PASSAGEIRO",nullable=false)
	private String nomePassageiro;
	
	@Lob
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento;
	
	@Column(name="DS_GENERO")
	private String genero;

	public Passageiro(String nomePassageiro, Calendar dataNascimento, String genero) {
		super();
		this.nomePassageiro = nomePassageiro;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public int getCodigoPassageiro() {
		return codigoPassageiro;
	}

	public void setCodigoPassageiro(int codigoPassageiro) {
		this.codigoPassageiro = codigoPassageiro;
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Passageiro() {
		super();
		// TODO Auto-generated constructor stub
	}

}
