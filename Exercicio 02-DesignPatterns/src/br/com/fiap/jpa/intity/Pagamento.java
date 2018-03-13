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
@Table(name="T_PAGAMENTO")
@SequenceGenerator(name="pagamento",sequenceName="SQ_T_PAGAMENTO",allocationSize=1)
public class Pagamento {
	
	@Id
	@Column(name="CD_PAGAMENTO")
	@GeneratedValue(generator="pagamento", strategy=GenerationType.SEQUENCE)
	private int codigoPagamento;
	
	@Column(name="DT_NAME",nullable=false)
	private Calendar dataPagamento;
	
	@Column(name="VL_PAGAMENTO",nullable=false)
	private float valorPagamento;
	
	@Column(name="DS_FORMA_PAGAMENTO",nullable=false)
	private FormaPagamento formaPagamento;

	public int getCodigoPagamento() {
		return codigoPagamento;
	}

	public void setCodigoPagamento(int codigoPagamento) {
		this.codigoPagamento = codigoPagamento;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public float getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(float valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Pagamento(Calendar dataPagamento, float valorPagamento, FormaPagamento formaPagamento) {
		super();
		this.dataPagamento = dataPagamento;
		this.valorPagamento = valorPagamento;
		this.formaPagamento = formaPagamento;
	}

	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
