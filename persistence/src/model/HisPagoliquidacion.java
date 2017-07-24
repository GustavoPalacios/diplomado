package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HIS_PAGOLIQUIDACION database table.
 * 
 */
@Entity
@Table(name="HIS_PAGOLIQUIDACION")
@NamedQuery(name="HisPagoliquidacion.findAll", query="SELECT h FROM HisPagoliquidacion h")
public class HisPagoliquidacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PALI_ID")
	private long paliId;

	@Column(name="HILI_ID")
	private BigDecimal hiliId;

	@Column(name="HPAL_ESTADO")
	private String hpalEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="HPAL_FECHA")
	private Date hpalFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="HPAL_FECHACAMBIO")
	private Date hpalFechacambio;

	@Column(name="HPAL_ID")
	private BigDecimal hpalId;

	@Column(name="HPAL_IDORIGEN")
	private BigDecimal hpalIdorigen;

	@Column(name="HPAL_ORIGEN")
	private String hpalOrigen;

	@Column(name="HPAL_REGISTRADOPOR")
	private String hpalRegistradopor;

	@Column(name="HPAL_VALOR")
	private BigDecimal hpalValor;

	@Column(name="LIQU_ID")
	private BigDecimal liquId;

	@Column(name="TIPL_ID")
	private BigDecimal tiplId;

	public HisPagoliquidacion() {
	}

	public long getPaliId() {
		return this.paliId;
	}

	public void setPaliId(long paliId) {
		this.paliId = paliId;
	}

	public BigDecimal getHiliId() {
		return this.hiliId;
	}

	public void setHiliId(BigDecimal hiliId) {
		this.hiliId = hiliId;
	}

	public String getHpalEstado() {
		return this.hpalEstado;
	}

	public void setHpalEstado(String hpalEstado) {
		this.hpalEstado = hpalEstado;
	}

	public Date getHpalFecha() {
		return this.hpalFecha;
	}

	public void setHpalFecha(Date hpalFecha) {
		this.hpalFecha = hpalFecha;
	}

	public Date getHpalFechacambio() {
		return this.hpalFechacambio;
	}

	public void setHpalFechacambio(Date hpalFechacambio) {
		this.hpalFechacambio = hpalFechacambio;
	}

	public BigDecimal getHpalId() {
		return this.hpalId;
	}

	public void setHpalId(BigDecimal hpalId) {
		this.hpalId = hpalId;
	}

	public BigDecimal getHpalIdorigen() {
		return this.hpalIdorigen;
	}

	public void setHpalIdorigen(BigDecimal hpalIdorigen) {
		this.hpalIdorigen = hpalIdorigen;
	}

	public String getHpalOrigen() {
		return this.hpalOrigen;
	}

	public void setHpalOrigen(String hpalOrigen) {
		this.hpalOrigen = hpalOrigen;
	}

	public String getHpalRegistradopor() {
		return this.hpalRegistradopor;
	}

	public void setHpalRegistradopor(String hpalRegistradopor) {
		this.hpalRegistradopor = hpalRegistradopor;
	}

	public BigDecimal getHpalValor() {
		return this.hpalValor;
	}

	public void setHpalValor(BigDecimal hpalValor) {
		this.hpalValor = hpalValor;
	}

	public BigDecimal getLiquId() {
		return this.liquId;
	}

	public void setLiquId(BigDecimal liquId) {
		this.liquId = liquId;
	}

	public BigDecimal getTiplId() {
		return this.tiplId;
	}

	public void setTiplId(BigDecimal tiplId) {
		this.tiplId = tiplId;
	}

}