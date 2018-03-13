package br.com.fiap.jpa.intity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CORRIDA")
@SequenceGenerator(name="corrida", sequenceName="SQ_T_CORRIDA",allocationSize=1)
public class Corrida {
	
	@Id
	@GeneratedValue(generator="corrida",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_CORRIDA")
	private int codigoCorrida;
	
	@Column(name="DS_ORIGEM",length=150)
	private String origem;
	
	@Column(name="DS_DESTINO",length=150)
	private String destino;
	
	@Column(name="DT_CORRIDA")
	private Calendar dataCorrida;
	
	@Column(name="VL_CORRIDA",nullable=false)
	private float valorCorrida;

	public int getCodigoCorrida() {
		return codigoCorrida;
	}

	public void setCodigoCorrida(int codigoCorrida) {
		this.codigoCorrida = codigoCorrida;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataCorrida() {
		return dataCorrida;
	}

	public void setDataCorrida(Calendar dataCorrida) {
		this.dataCorrida = dataCorrida;
	}

	public float getValorCorrida() {
		return valorCorrida;
	}

	public void setValorCorrida(float valorCorrida) {
		this.valorCorrida = valorCorrida;
	}

	public Corrida() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Corrida(String origem, String destino, Calendar dataCorrida, float valorCorrida) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.dataCorrida = dataCorrida;
		this.valorCorrida = valorCorrida;
	}
}
