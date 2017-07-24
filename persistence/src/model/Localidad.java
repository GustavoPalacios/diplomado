package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LOCALIDAD database table.
 * 
 */
@Entity
@NamedQuery(name="Localidad.findAll", query="SELECT l FROM Localidad l")
public class Localidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOCA_ID")
	private long locaId;

	@Column(name="CIGE_ID")
	private BigDecimal cigeId;

	@Column(name="LOCA_AREA")
	private String locaArea;

	@Column(name="LOCA_DESCRIPCION")
	private String locaDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="LOCA_FECHACAMBIO")
	private Date locaFechacambio;

	@Column(name="LOCA_REGISTRADOPOR")
	private String locaRegistradopor;

	@Column(name="TIPO_ID")
	private BigDecimal tipoId;

	public Localidad() {
	}

	public long getLocaId() {
		return this.locaId;
	}

	public void setLocaId(long locaId) {
		this.locaId = locaId;
	}

	public BigDecimal getCigeId() {
		return this.cigeId;
	}

	public void setCigeId(BigDecimal cigeId) {
		this.cigeId = cigeId;
	}

	public String getLocaArea() {
		return this.locaArea;
	}

	public void setLocaArea(String locaArea) {
		this.locaArea = locaArea;
	}

	public String getLocaDescripcion() {
		return this.locaDescripcion;
	}

	public void setLocaDescripcion(String locaDescripcion) {
		this.locaDescripcion = locaDescripcion;
	}

	public Date getLocaFechacambio() {
		return this.locaFechacambio;
	}

	public void setLocaFechacambio(Date locaFechacambio) {
		this.locaFechacambio = locaFechacambio;
	}

	public String getLocaRegistradopor() {
		return this.locaRegistradopor;
	}

	public void setLocaRegistradopor(String locaRegistradopor) {
		this.locaRegistradopor = locaRegistradopor;
	}

	public BigDecimal getTipoId() {
		return this.tipoId;
	}

	public void setTipoId(BigDecimal tipoId) {
		this.tipoId = tipoId;
	}

}