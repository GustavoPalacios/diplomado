package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ESPACIOFISICO database table.
 * 
 */
@Entity
@NamedQuery(name="Espaciofisico.findAll", query="SELECT e FROM Espaciofisico e")
public class Espaciofisico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ESFI_ID")
	private long esfiId;

	@Column(name="ESFI_AREA")
	private String esfiArea;

	@Column(name="ESFI_DESCRIPCION")
	private String esfiDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="ESFI_FECHACAMBIO")
	private Date esfiFechacambio;

	@Column(name="ESFI_NOMBRE")
	private String esfiNombre;

	@Column(name="ESFI_NOMENCLATURA")
	private String esfiNomenclatura;

	@Column(name="ESFI_NRONIVELES")
	private BigDecimal esfiNroniveles;

	@Column(name="ESFI_REGISTRADOPOR")
	private String esfiRegistradopor;

	@Column(name="LOCA_ID")
	private BigDecimal locaId;

	@Column(name="TIEF_ID")
	private BigDecimal tiefId;

	@Column(name="TIPO_ID")
	private BigDecimal tipoId;

	public Espaciofisico() {
	}

	public long getEsfiId() {
		return this.esfiId;
	}

	public void setEsfiId(long esfiId) {
		this.esfiId = esfiId;
	}

	public String getEsfiArea() {
		return this.esfiArea;
	}

	public void setEsfiArea(String esfiArea) {
		this.esfiArea = esfiArea;
	}

	public String getEsfiDescripcion() {
		return this.esfiDescripcion;
	}

	public void setEsfiDescripcion(String esfiDescripcion) {
		this.esfiDescripcion = esfiDescripcion;
	}

	public Date getEsfiFechacambio() {
		return this.esfiFechacambio;
	}

	public void setEsfiFechacambio(Date esfiFechacambio) {
		this.esfiFechacambio = esfiFechacambio;
	}

	public String getEsfiNombre() {
		return this.esfiNombre;
	}

	public void setEsfiNombre(String esfiNombre) {
		this.esfiNombre = esfiNombre;
	}

	public String getEsfiNomenclatura() {
		return this.esfiNomenclatura;
	}

	public void setEsfiNomenclatura(String esfiNomenclatura) {
		this.esfiNomenclatura = esfiNomenclatura;
	}

	public BigDecimal getEsfiNroniveles() {
		return this.esfiNroniveles;
	}

	public void setEsfiNroniveles(BigDecimal esfiNroniveles) {
		this.esfiNroniveles = esfiNroniveles;
	}

	public String getEsfiRegistradopor() {
		return this.esfiRegistradopor;
	}

	public void setEsfiRegistradopor(String esfiRegistradopor) {
		this.esfiRegistradopor = esfiRegistradopor;
	}

	public BigDecimal getLocaId() {
		return this.locaId;
	}

	public void setLocaId(BigDecimal locaId) {
		this.locaId = locaId;
	}

	public BigDecimal getTiefId() {
		return this.tiefId;
	}

	public void setTiefId(BigDecimal tiefId) {
		this.tiefId = tiefId;
	}

	public BigDecimal getTipoId() {
		return this.tipoId;
	}

	public void setTipoId(BigDecimal tipoId) {
		this.tipoId = tipoId;
	}

}