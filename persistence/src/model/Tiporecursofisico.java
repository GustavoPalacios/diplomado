package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TIPORECURSOFISICO database table.
 * 
 */
@Entity
@NamedQuery(name="Tiporecursofisico.findAll", query="SELECT t FROM Tiporecursofisico t")
public class Tiporecursofisico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TIRF_ID")
	private long tirfId;

	@Column(name="TIRF_DESCRIPCION")
	private String tirfDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="TIRF_FECHACAMBIO")
	private Date tirfFechacambio;

	@Column(name="TIRF_REGISTRADOPOR")
	private String tirfRegistradopor;

	public Tiporecursofisico() {
	}

	public long getTirfId() {
		return this.tirfId;
	}

	public void setTirfId(long tirfId) {
		this.tirfId = tirfId;
	}

	public String getTirfDescripcion() {
		return this.tirfDescripcion;
	}

	public void setTirfDescripcion(String tirfDescripcion) {
		this.tirfDescripcion = tirfDescripcion;
	}

	public Date getTirfFechacambio() {
		return this.tirfFechacambio;
	}

	public void setTirfFechacambio(Date tirfFechacambio) {
		this.tirfFechacambio = tirfFechacambio;
	}

	public String getTirfRegistradopor() {
		return this.tirfRegistradopor;
	}

	public void setTirfRegistradopor(String tirfRegistradopor) {
		this.tirfRegistradopor = tirfRegistradopor;
	}

}