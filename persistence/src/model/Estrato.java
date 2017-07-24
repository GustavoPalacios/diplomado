package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ESTRATO database table.
 * 
 */
@Entity
@NamedQuery(name="Estrato.findAll", query="SELECT e FROM Estrato e")
public class Estrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ESTR_ID")
	private long estrId;

	@Column(name="ESTR_DESCRIPCION")
	private String estrDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="ESTR_FECHACAMBIO")
	private Date estrFechacambio;

	@Column(name="ESTR_REGISTRADOPOR")
	private String estrRegistradopor;

	public Estrato() {
	}

	public long getEstrId() {
		return this.estrId;
	}

	public void setEstrId(long estrId) {
		this.estrId = estrId;
	}

	public String getEstrDescripcion() {
		return this.estrDescripcion;
	}

	public void setEstrDescripcion(String estrDescripcion) {
		this.estrDescripcion = estrDescripcion;
	}

	public Date getEstrFechacambio() {
		return this.estrFechacambio;
	}

	public void setEstrFechacambio(Date estrFechacambio) {
		this.estrFechacambio = estrFechacambio;
	}

	public String getEstrRegistradopor() {
		return this.estrRegistradopor;
	}

	public void setEstrRegistradopor(String estrRegistradopor) {
		this.estrRegistradopor = estrRegistradopor;
	}

}