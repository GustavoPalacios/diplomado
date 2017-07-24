package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SERVICIOPERIODO database table.
 * 
 */
@Entity
@NamedQuery(name="Servicioperiodo.findAll", query="SELECT s FROM Servicioperiodo s")
public class Servicioperiodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEPE_ID")
	private long sepeId;

	@Column(name="PEUN_ID")
	private BigDecimal peunId;

	@Column(name="SEIN_ID")
	private BigDecimal seinId;

	@Temporal(TemporalType.DATE)
	@Column(name="SEPE_FECHACAMBIO")
	private Date sepeFechacambio;

	@Column(name="SEPE_REGISTRADOPOR")
	private String sepeRegistradopor;

	@Column(name="SEPE_VALOR")
	private BigDecimal sepeValor;

	public Servicioperiodo() {
	}

	public long getSepeId() {
		return this.sepeId;
	}

	public void setSepeId(long sepeId) {
		this.sepeId = sepeId;
	}

	public BigDecimal getPeunId() {
		return this.peunId;
	}

	public void setPeunId(BigDecimal peunId) {
		this.peunId = peunId;
	}

	public BigDecimal getSeinId() {
		return this.seinId;
	}

	public void setSeinId(BigDecimal seinId) {
		this.seinId = seinId;
	}

	public Date getSepeFechacambio() {
		return this.sepeFechacambio;
	}

	public void setSepeFechacambio(Date sepeFechacambio) {
		this.sepeFechacambio = sepeFechacambio;
	}

	public String getSepeRegistradopor() {
		return this.sepeRegistradopor;
	}

	public void setSepeRegistradopor(String sepeRegistradopor) {
		this.sepeRegistradopor = sepeRegistradopor;
	}

	public BigDecimal getSepeValor() {
		return this.sepeValor;
	}

	public void setSepeValor(BigDecimal sepeValor) {
		this.sepeValor = sepeValor;
	}

}