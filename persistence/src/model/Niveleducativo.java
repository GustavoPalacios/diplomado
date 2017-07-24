package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the NIVELEDUCATIVO database table.
 * 
 */
@Entity
@NamedQuery(name="Niveleducativo.findAll", query="SELECT n FROM Niveleducativo n")
public class Niveleducativo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NIED_ID")
	private long niedId;

	@Column(name="NIED_DESCRIPCION")
	private String niedDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="NIED_FECHACAMBIO")
	private Date niedFechacambio;

	@Column(name="NIED_OBSERVACION")
	private String niedObservacion;

	@Column(name="NIED_PARA_IES")
	private String niedParaIes;

	@Column(name="NIED_REGISTRADOPOR")
	private String niedRegistradopor;

	public Niveleducativo() {
	}

	public long getNiedId() {
		return this.niedId;
	}

	public void setNiedId(long niedId) {
		this.niedId = niedId;
	}

	public String getNiedDescripcion() {
		return this.niedDescripcion;
	}

	public void setNiedDescripcion(String niedDescripcion) {
		this.niedDescripcion = niedDescripcion;
	}

	public Date getNiedFechacambio() {
		return this.niedFechacambio;
	}

	public void setNiedFechacambio(Date niedFechacambio) {
		this.niedFechacambio = niedFechacambio;
	}

	public String getNiedObservacion() {
		return this.niedObservacion;
	}

	public void setNiedObservacion(String niedObservacion) {
		this.niedObservacion = niedObservacion;
	}

	public String getNiedParaIes() {
		return this.niedParaIes;
	}

	public void setNiedParaIes(String niedParaIes) {
		this.niedParaIes = niedParaIes;
	}

	public String getNiedRegistradopor() {
		return this.niedRegistradopor;
	}

	public void setNiedRegistradopor(String niedRegistradopor) {
		this.niedRegistradopor = niedRegistradopor;
	}

}