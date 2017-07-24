package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RECURSOFISICOUNIDAD database table.
 * 
 */
@Entity
@NamedQuery(name="Recursofisicounidad.findAll", query="SELECT r FROM Recursofisicounidad r")
public class Recursofisicounidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFI_ID")
	private long refiId;

	@Temporal(TemporalType.DATE)
	@Column(name="REFU_FECHACAMBIO")
	private Date refuFechacambio;

	@Column(name="REFU_REGISTRADOPOR")
	private String refuRegistradopor;

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	public Recursofisicounidad() {
	}

	public long getRefiId() {
		return this.refiId;
	}

	public void setRefiId(long refiId) {
		this.refiId = refiId;
	}

	public Date getRefuFechacambio() {
		return this.refuFechacambio;
	}

	public void setRefuFechacambio(Date refuFechacambio) {
		this.refuFechacambio = refuFechacambio;
	}

	public String getRefuRegistradopor() {
		return this.refuRegistradopor;
	}

	public void setRefuRegistradopor(String refuRegistradopor) {
		this.refuRegistradopor = refuRegistradopor;
	}

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

}