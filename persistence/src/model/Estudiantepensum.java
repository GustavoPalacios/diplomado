package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ESTUDIANTEPENSUM database table.
 * 
 */
@Entity
@NamedQuery(name="Estudiantepensum.findAll", query="SELECT e FROM Estudiantepensum e")
public class Estudiantepensum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ESTP_ID")
	private long estpId;

	@Column(name="CATE_ID")
	private BigDecimal cateId;

	@Column(name="ESTP_CODIGOMATRICULA")
	private String estpCodigomatricula;

	@Column(name="ESTP_CREDITOSAPROBADOS")
	private BigDecimal estpCreditosaprobados;

	@Column(name="ESTP_ESTADO")
	private String estpEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="ESTP_FECHACAMBIO")
	private Date estpFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="ESTP_FECHAINGRESO")
	private Date estpFechaingreso;

	@Temporal(TemporalType.DATE)
	@Column(name="ESTP_FECHAVIGENCIANORMA")
	private Date estpFechavigencianorma;

	@Column(name="ESTP_MODIFICADOPOR")
	private String estpModificadopor;

	@Column(name="ESTP_PERIODOACADEMICO")
	private BigDecimal estpPeriodoacademico;

	@Column(name="ESTP_PERIODOCRONOLOGICO")
	private BigDecimal estpPeriodocronologico;

	@Column(name="ESTP_PROMEDIOGENERAL")
	private BigDecimal estpPromediogeneral;

	@Column(name="ESTP_PROMEDIOSEMESTRE")
	private BigDecimal estpPromediosemestre;

	@Column(name="ESTP_REGISTRADOPOR")
	private String estpRegistradopor;

	@Column(name="FRAN_ID")
	private BigDecimal franId;

	@Column(name="PEGE_ID")
	private BigDecimal pegeId;

	@Column(name="PENS_ID")
	private BigDecimal pensId;

	@Column(name="PEUN_ID")
	private BigDecimal peunId;

	@Column(name="SITE_ID")
	private BigDecimal siteId;

	@Column(name="TINS_ID")
	private BigDecimal tinsId;

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	@Column(name="UNPR_ID")
	private BigDecimal unprId;

	public Estudiantepensum() {
	}

	public long getEstpId() {
		return this.estpId;
	}

	public void setEstpId(long estpId) {
		this.estpId = estpId;
	}

	public BigDecimal getCateId() {
		return this.cateId;
	}

	public void setCateId(BigDecimal cateId) {
		this.cateId = cateId;
	}

	public String getEstpCodigomatricula() {
		return this.estpCodigomatricula;
	}

	public void setEstpCodigomatricula(String estpCodigomatricula) {
		this.estpCodigomatricula = estpCodigomatricula;
	}

	public BigDecimal getEstpCreditosaprobados() {
		return this.estpCreditosaprobados;
	}

	public void setEstpCreditosaprobados(BigDecimal estpCreditosaprobados) {
		this.estpCreditosaprobados = estpCreditosaprobados;
	}

	public String getEstpEstado() {
		return this.estpEstado;
	}

	public void setEstpEstado(String estpEstado) {
		this.estpEstado = estpEstado;
	}

	public Date getEstpFechacambio() {
		return this.estpFechacambio;
	}

	public void setEstpFechacambio(Date estpFechacambio) {
		this.estpFechacambio = estpFechacambio;
	}

	public Date getEstpFechaingreso() {
		return this.estpFechaingreso;
	}

	public void setEstpFechaingreso(Date estpFechaingreso) {
		this.estpFechaingreso = estpFechaingreso;
	}

	public Date getEstpFechavigencianorma() {
		return this.estpFechavigencianorma;
	}

	public void setEstpFechavigencianorma(Date estpFechavigencianorma) {
		this.estpFechavigencianorma = estpFechavigencianorma;
	}

	public String getEstpModificadopor() {
		return this.estpModificadopor;
	}

	public void setEstpModificadopor(String estpModificadopor) {
		this.estpModificadopor = estpModificadopor;
	}

	public BigDecimal getEstpPeriodoacademico() {
		return this.estpPeriodoacademico;
	}

	public void setEstpPeriodoacademico(BigDecimal estpPeriodoacademico) {
		this.estpPeriodoacademico = estpPeriodoacademico;
	}

	public BigDecimal getEstpPeriodocronologico() {
		return this.estpPeriodocronologico;
	}

	public void setEstpPeriodocronologico(BigDecimal estpPeriodocronologico) {
		this.estpPeriodocronologico = estpPeriodocronologico;
	}

	public BigDecimal getEstpPromediogeneral() {
		return this.estpPromediogeneral;
	}

	public void setEstpPromediogeneral(BigDecimal estpPromediogeneral) {
		this.estpPromediogeneral = estpPromediogeneral;
	}

	public BigDecimal getEstpPromediosemestre() {
		return this.estpPromediosemestre;
	}

	public void setEstpPromediosemestre(BigDecimal estpPromediosemestre) {
		this.estpPromediosemestre = estpPromediosemestre;
	}

	public String getEstpRegistradopor() {
		return this.estpRegistradopor;
	}

	public void setEstpRegistradopor(String estpRegistradopor) {
		this.estpRegistradopor = estpRegistradopor;
	}

	public BigDecimal getFranId() {
		return this.franId;
	}

	public void setFranId(BigDecimal franId) {
		this.franId = franId;
	}

	public BigDecimal getPegeId() {
		return this.pegeId;
	}

	public void setPegeId(BigDecimal pegeId) {
		this.pegeId = pegeId;
	}

	public BigDecimal getPensId() {
		return this.pensId;
	}

	public void setPensId(BigDecimal pensId) {
		this.pensId = pensId;
	}

	public BigDecimal getPeunId() {
		return this.peunId;
	}

	public void setPeunId(BigDecimal peunId) {
		this.peunId = peunId;
	}

	public BigDecimal getSiteId() {
		return this.siteId;
	}

	public void setSiteId(BigDecimal siteId) {
		this.siteId = siteId;
	}

	public BigDecimal getTinsId() {
		return this.tinsId;
	}

	public void setTinsId(BigDecimal tinsId) {
		this.tinsId = tinsId;
	}

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

	public BigDecimal getUnprId() {
		return this.unprId;
	}

	public void setUnprId(BigDecimal unprId) {
		this.unprId = unprId;
	}

}