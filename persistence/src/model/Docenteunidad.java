package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DOCENTEUNIDAD database table.
 * 
 */
@Entity
@NamedQuery(name="Docenteunidad.findAll", query="SELECT d FROM Docenteunidad d")
public class Docenteunidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocenteunidadPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="DOUN_FECHACAMBIO")
	private Date dounFechacambio;

	@Column(name="DOUN_REGISTRADOPOR")
	private String dounRegistradopor;

	@Column(name="DOVI_ID")
	private BigDecimal doviId;

	@Column(name="LABO_ID")
	private BigDecimal laboId;

	@Column(name="TRLU_ID")
	private BigDecimal trluId;

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	public Docenteunidad() {
	}

	public DocenteunidadPK getId() {
		return this.id;
	}

	public void setId(DocenteunidadPK id) {
		this.id = id;
	}

	public Date getDounFechacambio() {
		return this.dounFechacambio;
	}

	public void setDounFechacambio(Date dounFechacambio) {
		this.dounFechacambio = dounFechacambio;
	}

	public String getDounRegistradopor() {
		return this.dounRegistradopor;
	}

	public void setDounRegistradopor(String dounRegistradopor) {
		this.dounRegistradopor = dounRegistradopor;
	}

	public BigDecimal getDoviId() {
		return this.doviId;
	}

	public void setDoviId(BigDecimal doviId) {
		this.doviId = doviId;
	}

	public BigDecimal getLaboId() {
		return this.laboId;
	}

	public void setLaboId(BigDecimal laboId) {
		this.laboId = laboId;
	}

	public BigDecimal getTrluId() {
		return this.trluId;
	}

	public void setTrluId(BigDecimal trluId) {
		this.trluId = trluId;
	}

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

}