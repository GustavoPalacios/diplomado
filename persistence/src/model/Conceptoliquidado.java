package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CONCEPTOLIQUIDADO database table.
 * 
 */
@Entity
@NamedQuery(name="Conceptoliquidado.findAll", query="SELECT c FROM Conceptoliquidado c")
public class Conceptoliquidado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COLI_ID")
	private long coliId;

	@Temporal(TemporalType.DATE)
	@Column(name="COLI_FECHACAMBIO")
	private Date coliFechacambio;

	@Column(name="COLI_LIQUIDADOPOR")
	private String coliLiquidadopor;

	@Column(name="COLI_REGISTRADOPOR")
	private String coliRegistradopor;

	@Column(name="COLI_VALORLIQUIDADO")
	private BigDecimal coliValorliquidado;

	@Column(name="LIQU_ID")
	private BigDecimal liquId;

	@Column(name="NOCO_ID")
	private BigDecimal nocoId;

	public Conceptoliquidado() {
	}

	public long getColiId() {
		return this.coliId;
	}

	public void setColiId(long coliId) {
		this.coliId = coliId;
	}

	public Date getColiFechacambio() {
		return this.coliFechacambio;
	}

	public void setColiFechacambio(Date coliFechacambio) {
		this.coliFechacambio = coliFechacambio;
	}

	public String getColiLiquidadopor() {
		return this.coliLiquidadopor;
	}

	public void setColiLiquidadopor(String coliLiquidadopor) {
		this.coliLiquidadopor = coliLiquidadopor;
	}

	public String getColiRegistradopor() {
		return this.coliRegistradopor;
	}

	public void setColiRegistradopor(String coliRegistradopor) {
		this.coliRegistradopor = coliRegistradopor;
	}

	public BigDecimal getColiValorliquidado() {
		return this.coliValorliquidado;
	}

	public void setColiValorliquidado(BigDecimal coliValorliquidado) {
		this.coliValorliquidado = coliValorliquidado;
	}

	public BigDecimal getLiquId() {
		return this.liquId;
	}

	public void setLiquId(BigDecimal liquId) {
		this.liquId = liquId;
	}

	public BigDecimal getNocoId() {
		return this.nocoId;
	}

	public void setNocoId(BigDecimal nocoId) {
		this.nocoId = nocoId;
	}

}