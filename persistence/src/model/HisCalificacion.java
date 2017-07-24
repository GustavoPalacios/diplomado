package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HIS_CALIFICACION database table.
 * 
 */
@Entity
@Table(name="HIS_CALIFICACION")
@NamedQuery(name="HisCalificacion.findAll", query="SELECT h FROM HisCalificacion h")
public class HisCalificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HICA_ID")
	private long hicaId;

	@Column(name="HICA_ESTADO")
	private String hicaEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="HICA_FECHACAMBIO")
	private Date hicaFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="HICA_FECHAFUERA")
	private Date hicaFechafuera;

	@Column(name="HICA_JUSTIFICACION")
	private String hicaJustificacion;

	@Column(name="HICA_REGISTRADOPOR")
	private String hicaRegistradopor;

	@Column(name="HICA_SUPLETORIO")
	private String hicaSupletorio;

	@Column(name="HICA_VALOR")
	private BigDecimal hicaValor;

	@Column(name="HINO_ID")
	private BigDecimal hinoId;

	@Column(name="NORG_ID")
	private BigDecimal norgId;

	@Column(name="REAC_ID")
	private BigDecimal reacId;

	@Column(name="TICL_ID")
	private BigDecimal ticlId;

	public HisCalificacion() {
	}

	public long getHicaId() {
		return this.hicaId;
	}

	public void setHicaId(long hicaId) {
		this.hicaId = hicaId;
	}

	public String getHicaEstado() {
		return this.hicaEstado;
	}

	public void setHicaEstado(String hicaEstado) {
		this.hicaEstado = hicaEstado;
	}

	public Date getHicaFechacambio() {
		return this.hicaFechacambio;
	}

	public void setHicaFechacambio(Date hicaFechacambio) {
		this.hicaFechacambio = hicaFechacambio;
	}

	public Date getHicaFechafuera() {
		return this.hicaFechafuera;
	}

	public void setHicaFechafuera(Date hicaFechafuera) {
		this.hicaFechafuera = hicaFechafuera;
	}

	public String getHicaJustificacion() {
		return this.hicaJustificacion;
	}

	public void setHicaJustificacion(String hicaJustificacion) {
		this.hicaJustificacion = hicaJustificacion;
	}

	public String getHicaRegistradopor() {
		return this.hicaRegistradopor;
	}

	public void setHicaRegistradopor(String hicaRegistradopor) {
		this.hicaRegistradopor = hicaRegistradopor;
	}

	public String getHicaSupletorio() {
		return this.hicaSupletorio;
	}

	public void setHicaSupletorio(String hicaSupletorio) {
		this.hicaSupletorio = hicaSupletorio;
	}

	public BigDecimal getHicaValor() {
		return this.hicaValor;
	}

	public void setHicaValor(BigDecimal hicaValor) {
		this.hicaValor = hicaValor;
	}

	public BigDecimal getHinoId() {
		return this.hinoId;
	}

	public void setHinoId(BigDecimal hinoId) {
		this.hinoId = hinoId;
	}

	public BigDecimal getNorgId() {
		return this.norgId;
	}

	public void setNorgId(BigDecimal norgId) {
		this.norgId = norgId;
	}

	public BigDecimal getReacId() {
		return this.reacId;
	}

	public void setReacId(BigDecimal reacId) {
		this.reacId = reacId;
	}

	public BigDecimal getTiclId() {
		return this.ticlId;
	}

	public void setTiclId(BigDecimal ticlId) {
		this.ticlId = ticlId;
	}

}