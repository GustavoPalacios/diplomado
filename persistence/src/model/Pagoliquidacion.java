package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PAGOLIQUIDACION database table.
 * 
 */
@Entity
@NamedQuery(name="Pagoliquidacion.findAll", query="SELECT p FROM Pagoliquidacion p")
public class Pagoliquidacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PALI_ID")
	private long paliId;

	@Column(name="LIQU_ID")
	private BigDecimal liquId;

	@Column(name="PALI_ESTADO")
	private String paliEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="PALI_FECHA")
	private Date paliFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="PALI_FECHACAMBIO")
	private Date paliFechacambio;

	@Column(name="PALI_IDORIGEN")
	private BigDecimal paliIdorigen;

	@Column(name="PALI_OBSERVACIONES")
	private String paliObservaciones;

	@Column(name="PALI_ORIGEN")
	private String paliOrigen;

	@Column(name="PALI_REGISTRADOPOR")
	private String paliRegistradopor;

	@Column(name="PALI_VALOR")
	private BigDecimal paliValor;

	@Column(name="TIPL_ID")
	private BigDecimal tiplId;

	public Pagoliquidacion() {
	}

	public long getPaliId() {
		return this.paliId;
	}

	public void setPaliId(long paliId) {
		this.paliId = paliId;
	}

	public BigDecimal getLiquId() {
		return this.liquId;
	}

	public void setLiquId(BigDecimal liquId) {
		this.liquId = liquId;
	}

	public String getPaliEstado() {
		return this.paliEstado;
	}

	public void setPaliEstado(String paliEstado) {
		this.paliEstado = paliEstado;
	}

	public Date getPaliFecha() {
		return this.paliFecha;
	}

	public void setPaliFecha(Date paliFecha) {
		this.paliFecha = paliFecha;
	}

	public Date getPaliFechacambio() {
		return this.paliFechacambio;
	}

	public void setPaliFechacambio(Date paliFechacambio) {
		this.paliFechacambio = paliFechacambio;
	}

	public BigDecimal getPaliIdorigen() {
		return this.paliIdorigen;
	}

	public void setPaliIdorigen(BigDecimal paliIdorigen) {
		this.paliIdorigen = paliIdorigen;
	}

	public String getPaliObservaciones() {
		return this.paliObservaciones;
	}

	public void setPaliObservaciones(String paliObservaciones) {
		this.paliObservaciones = paliObservaciones;
	}

	public String getPaliOrigen() {
		return this.paliOrigen;
	}

	public void setPaliOrigen(String paliOrigen) {
		this.paliOrigen = paliOrigen;
	}

	public String getPaliRegistradopor() {
		return this.paliRegistradopor;
	}

	public void setPaliRegistradopor(String paliRegistradopor) {
		this.paliRegistradopor = paliRegistradopor;
	}

	public BigDecimal getPaliValor() {
		return this.paliValor;
	}

	public void setPaliValor(BigDecimal paliValor) {
		this.paliValor = paliValor;
	}

	public BigDecimal getTiplId() {
		return this.tiplId;
	}

	public void setTiplId(BigDecimal tiplId) {
		this.tiplId = tiplId;
	}

}