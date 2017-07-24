package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HIS_NOTA database table.
 * 
 */
@Entity
@Table(name="HIS_NOTA")
@NamedQuery(name="HisNota.findAll", query="SELECT h FROM HisNota h")
public class HisNota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HINO_ID")
	private long hinoId;

	@Column(name="EVAC_ID")
	private BigDecimal evacId;

	@Column(name="GRUP_ID")
	private BigDecimal grupId;

	@Column(name="NOTA_DESCRIPCION")
	private String notaDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="NOTA_FECHACAMBIO")
	private Date notaFechacambio;

	@Column(name="NOTA_ID")
	private BigDecimal notaId;

	@Column(name="NOTA_PESO")
	private BigDecimal notaPeso;

	@Column(name="NOTA_REGISTRADOPOR")
	private String notaRegistradopor;

	public HisNota() {
	}

	public long getHinoId() {
		return this.hinoId;
	}

	public void setHinoId(long hinoId) {
		this.hinoId = hinoId;
	}

	public BigDecimal getEvacId() {
		return this.evacId;
	}

	public void setEvacId(BigDecimal evacId) {
		this.evacId = evacId;
	}

	public BigDecimal getGrupId() {
		return this.grupId;
	}

	public void setGrupId(BigDecimal grupId) {
		this.grupId = grupId;
	}

	public String getNotaDescripcion() {
		return this.notaDescripcion;
	}

	public void setNotaDescripcion(String notaDescripcion) {
		this.notaDescripcion = notaDescripcion;
	}

	public Date getNotaFechacambio() {
		return this.notaFechacambio;
	}

	public void setNotaFechacambio(Date notaFechacambio) {
		this.notaFechacambio = notaFechacambio;
	}

	public BigDecimal getNotaId() {
		return this.notaId;
	}

	public void setNotaId(BigDecimal notaId) {
		this.notaId = notaId;
	}

	public BigDecimal getNotaPeso() {
		return this.notaPeso;
	}

	public void setNotaPeso(BigDecimal notaPeso) {
		this.notaPeso = notaPeso;
	}

	public String getNotaRegistradopor() {
		return this.notaRegistradopor;
	}

	public void setNotaRegistradopor(String notaRegistradopor) {
		this.notaRegistradopor = notaRegistradopor;
	}

}