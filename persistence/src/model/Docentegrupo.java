package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DOCENTEGRUPO database table.
 * 
 */
@Entity
@NamedQuery(name="Docentegrupo.findAll", query="SELECT d FROM Docentegrupo d")
public class Docentegrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GRUP_ID")
	private long grupId;

	@Column(name="DOGR_DICTA")
	private String dogrDicta;

	@Temporal(TemporalType.DATE)
	@Column(name="DOGR_FECHACAMBIO")
	private Date dogrFechacambio;

	@Column(name="DOGR_HORASEMANADIRIGIDO")
	private BigDecimal dogrHorasemanadirigido;

	@Column(name="DOGR_PESOHORACLASE")
	private BigDecimal dogrPesohoraclase;

	@Column(name="DOGR_REGISTRADOPOR")
	private String dogrRegistradopor;

	@Column(name="DOGR_RESPONSABLE")
	private String dogrResponsable;

	@Column(name="DOUN_ID")
	private BigDecimal dounId;

	@Column(name="NORG_ID")
	private BigDecimal norgId;

	@Column(name="TCVE_ID")
	private BigDecimal tcveId;

	public Docentegrupo() {
	}

	public long getGrupId() {
		return this.grupId;
	}

	public void setGrupId(long grupId) {
		this.grupId = grupId;
	}

	public String getDogrDicta() {
		return this.dogrDicta;
	}

	public void setDogrDicta(String dogrDicta) {
		this.dogrDicta = dogrDicta;
	}

	public Date getDogrFechacambio() {
		return this.dogrFechacambio;
	}

	public void setDogrFechacambio(Date dogrFechacambio) {
		this.dogrFechacambio = dogrFechacambio;
	}

	public BigDecimal getDogrHorasemanadirigido() {
		return this.dogrHorasemanadirigido;
	}

	public void setDogrHorasemanadirigido(BigDecimal dogrHorasemanadirigido) {
		this.dogrHorasemanadirigido = dogrHorasemanadirigido;
	}

	public BigDecimal getDogrPesohoraclase() {
		return this.dogrPesohoraclase;
	}

	public void setDogrPesohoraclase(BigDecimal dogrPesohoraclase) {
		this.dogrPesohoraclase = dogrPesohoraclase;
	}

	public String getDogrRegistradopor() {
		return this.dogrRegistradopor;
	}

	public void setDogrRegistradopor(String dogrRegistradopor) {
		this.dogrRegistradopor = dogrRegistradopor;
	}

	public String getDogrResponsable() {
		return this.dogrResponsable;
	}

	public void setDogrResponsable(String dogrResponsable) {
		this.dogrResponsable = dogrResponsable;
	}

	public BigDecimal getDounId() {
		return this.dounId;
	}

	public void setDounId(BigDecimal dounId) {
		this.dounId = dounId;
	}

	public BigDecimal getNorgId() {
		return this.norgId;
	}

	public void setNorgId(BigDecimal norgId) {
		this.norgId = norgId;
	}

	public BigDecimal getTcveId() {
		return this.tcveId;
	}

	public void setTcveId(BigDecimal tcveId) {
		this.tcveId = tcveId;
	}

}