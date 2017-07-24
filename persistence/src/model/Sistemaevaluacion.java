package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SISTEMAEVALUACION database table.
 * 
 */
@Entity
@NamedQuery(name="Sistemaevaluacion.findAll", query="SELECT s FROM Sistemaevaluacion s")
public class Sistemaevaluacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SIEV_ID")
	private long sievId;

	@Column(name="NORG_ID")
	private BigDecimal norgId;

	@Column(name="SIEV_DESCRIPCION")
	private String sievDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="SIEV_FECHACAMBIO")
	private Date sievFechacambio;

	@Column(name="SIEV_PARHABAPR")
	private String sievParhabapr;

	@Column(name="SIEV_PARHABNAPR")
	private String sievParhabnapr;

	@Column(name="SIEV_PESODEFINITIVA")
	private BigDecimal sievPesodefinitiva;

	@Column(name="SIEV_PESOHABILITACION")
	private BigDecimal sievPesohabilitacion;

	@Column(name="SIEV_REGISTRADOPOR")
	private String sievRegistradopor;

	public Sistemaevaluacion() {
	}

	public long getSievId() {
		return this.sievId;
	}

	public void setSievId(long sievId) {
		this.sievId = sievId;
	}

	public BigDecimal getNorgId() {
		return this.norgId;
	}

	public void setNorgId(BigDecimal norgId) {
		this.norgId = norgId;
	}

	public String getSievDescripcion() {
		return this.sievDescripcion;
	}

	public void setSievDescripcion(String sievDescripcion) {
		this.sievDescripcion = sievDescripcion;
	}

	public Date getSievFechacambio() {
		return this.sievFechacambio;
	}

	public void setSievFechacambio(Date sievFechacambio) {
		this.sievFechacambio = sievFechacambio;
	}

	public String getSievParhabapr() {
		return this.sievParhabapr;
	}

	public void setSievParhabapr(String sievParhabapr) {
		this.sievParhabapr = sievParhabapr;
	}

	public String getSievParhabnapr() {
		return this.sievParhabnapr;
	}

	public void setSievParhabnapr(String sievParhabnapr) {
		this.sievParhabnapr = sievParhabnapr;
	}

	public BigDecimal getSievPesodefinitiva() {
		return this.sievPesodefinitiva;
	}

	public void setSievPesodefinitiva(BigDecimal sievPesodefinitiva) {
		this.sievPesodefinitiva = sievPesodefinitiva;
	}

	public BigDecimal getSievPesohabilitacion() {
		return this.sievPesohabilitacion;
	}

	public void setSievPesohabilitacion(BigDecimal sievPesohabilitacion) {
		this.sievPesohabilitacion = sievPesohabilitacion;
	}

	public String getSievRegistradopor() {
		return this.sievRegistradopor;
	}

	public void setSievRegistradopor(String sievRegistradopor) {
		this.sievRegistradopor = sievRegistradopor;
	}

}