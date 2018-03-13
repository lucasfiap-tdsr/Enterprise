package br.com.fiap.jpa.intity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MOTORISTA")
public class Motorista {
	
	@Id
	@Column(name="NR_CARTEIRA")
	private int numeroCarteira;
	
	@Column(name="NM_MOTORISTA",nullable=false,length=150)
	private String nomeMotorista;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento;
	
	@Lob
	@Column(name="FL_CARTEIRA")
	private byte[] fotoCarteira;
	
	@Column(name="DS_GENERO")
	private String genero;

	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(int numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFotoCarteira() {
		return fotoCarteira;
	}

	public void setFotoCarteira(byte[] fotoCarteira) {
		this.fotoCarteira = fotoCarteira;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Motorista(int numeroCarteira, String nomeMotorista, Calendar dataNascimento, byte[] fotoCarteira,
			String genero) {
		super();
		this.numeroCarteira = numeroCarteira;
		this.nomeMotorista = nomeMotorista;
		this.dataNascimento = dataNascimento;
		this.fotoCarteira = fotoCarteira;
		this.genero = genero;
	}

}
