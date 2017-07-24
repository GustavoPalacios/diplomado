package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the SITUACIONESTUDIANTE database table.
 * 
 */
@Entity
@NamedQuery(name="Situacionestudiante.findAll", query="SELECT s FROM Situacionestudiante s")
public class Situacionestudiante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SITE_ID")
	private long siteId;

	@Column(name="SITE_ACTIVO")
	private String siteActivo;

	@Column(name="SITE_DESCRIPCION")
	private String siteDescripcion;

	@Column(name="SITE_DESCRIPCIONACADEMUSOFT")
	private String siteDescripcionacademusoft;

	@Temporal(TemporalType.DATE)
	@Column(name="SITE_FECHACAMBIO")
	private Date siteFechacambio;

	@Column(name="SITE_REGISTRADOPOR")
	private String siteRegistradopor;

	public Situacionestudiante() {
	}

	public long getSiteId() {
		return this.siteId;
	}

	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}

	public String getSiteActivo() {
		return this.siteActivo;
	}

	public void setSiteActivo(String siteActivo) {
		this.siteActivo = siteActivo;
	}

	public String getSiteDescripcion() {
		return this.siteDescripcion;
	}

	public void setSiteDescripcion(String siteDescripcion) {
		this.siteDescripcion = siteDescripcion;
	}

	public String getSiteDescripcionacademusoft() {
		return this.siteDescripcionacademusoft;
	}

	public void setSiteDescripcionacademusoft(String siteDescripcionacademusoft) {
		this.siteDescripcionacademusoft = siteDescripcionacademusoft;
	}

	public Date getSiteFechacambio() {
		return this.siteFechacambio;
	}

	public void setSiteFechacambio(Date siteFechacambio) {
		this.siteFechacambio = siteFechacambio;
	}

	public String getSiteRegistradopor() {
		return this.siteRegistradopor;
	}

	public void setSiteRegistradopor(String siteRegistradopor) {
		this.siteRegistradopor = siteRegistradopor;
	}

}