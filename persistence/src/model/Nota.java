package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the NOTA database table.
 * 
 */
@Entity
@NamedQuery(name="Nota.findAll", query="SELECT n FROM Nota n")
public class Nota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NOTA_ID")
	private long notaId;

	@Column(name="EVAC_ID")
	private BigDecimal evacId;

	@Column(name="GRUP_ID")
	private BigDecimal grupId;

	@Column(name="NOTA_DESCRIPCION")
	private String notaDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="NOTA_FECHACAMBIO")
	private Date notaFechacambio;

	@Column(name="NOTA_PESO")
	private BigDecimal notaPeso;

	@Column(name="NOTA_REGISTRADOPOR")
	private String notaRegistradopor;

	public Nota() {
	}

	public long getNotaId() {
		return this.notaId;
	}

	public void setNotaId(long notaId) {
		this.notaId = notaId;
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