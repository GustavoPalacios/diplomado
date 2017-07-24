package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CALIFICACION database table.
 * 
 */
@Entity
@NamedQuery(name="Calificacion.findAll", query="SELECT c FROM Calificacion c")
public class Calificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CALF_ID")
	private long calfId;

	@Column(name="CALF_ESTADO")
	private String calfEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="CALF_FECHACAMBIO")
	private Date calfFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="CALF_FECHAFUERA")
	private Date calfFechafuera;

	@Column(name="CALF_JUSTIFICACION")
	private String calfJustificacion;

	@Column(name="CALF_REGISTRADOPOR")
	private String calfRegistradopor;

	@Column(name="CALF_SUPLETORIO")
	private String calfSupletorio;

	@Column(name="CALF_VALOR")
	private BigDecimal calfValor;

	@Column(name="GRMA_ID")
	private BigDecimal grmaId;

	@Column(name="NORG_ID")
	private BigDecimal norgId;

	@Column(name="NOTA_ID")
	private BigDecimal notaId;

	@Column(name="TICL_ID")
	private BigDecimal ticlId;

	public Calificacion() {
	}

	public long getCalfId() {
		return this.calfId;
	}

	public void setCalfId(long calfId) {
		this.calfId = calfId;
	}

	public String getCalfEstado() {
		return this.calfEstado;
	}

	public void setCalfEstado(String calfEstado) {
		this.calfEstado = calfEstado;
	}

	public Date getCalfFechacambio() {
		return this.calfFechacambio;
	}

	public void setCalfFechacambio(Date calfFechacambio) {
		this.calfFechacambio = calfFechacambio;
	}

	public Date getCalfFechafuera() {
		return this.calfFechafuera;
	}

	public void setCalfFechafuera(Date calfFechafuera) {
		this.calfFechafuera = calfFechafuera;
	}

	public String getCalfJustificacion() {
		return this.calfJustificacion;
	}

	public void setCalfJustificacion(String calfJustificacion) {
		this.calfJustificacion = calfJustificacion;
	}

	public String getCalfRegistradopor() {
		return this.calfRegistradopor;
	}

	public void setCalfRegistradopor(String calfRegistradopor) {
		this.calfRegistradopor = calfRegistradopor;
	}

	public String getCalfSupletorio() {
		return this.calfSupletorio;
	}

	public void setCalfSupletorio(String calfSupletorio) {
		this.calfSupletorio = calfSupletorio;
	}

	public BigDecimal getCalfValor() {
		return this.calfValor;
	}

	public void setCalfValor(BigDecimal calfValor) {
		this.calfValor = calfValor;
	}

	public BigDecimal getGrmaId() {
		return this.grmaId;
	}

	public void setGrmaId(BigDecimal grmaId) {
		this.grmaId = grmaId;
	}

	public BigDecimal getNorgId() {
		return this.norgId;
	}

	public void setNorgId(BigDecimal norgId) {
		this.norgId = norgId;
	}

	public BigDecimal getNotaId() {
		return this.notaId;
	}

	public void setNotaId(BigDecimal notaId) {
		this.notaId = notaId;
	}

	public BigDecimal getTiclId() {
		return this.ticlId;
	}

	public void setTiclId(BigDecimal ticlId) {
		this.ticlId = ticlId;
	}

}