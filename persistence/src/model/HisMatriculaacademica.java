package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HIS_MATRICULAACADEMICA database table.
 * 
 */
@Entity
@Table(name="HIS_MATRICULAACADEMICA")
@NamedQuery(name="HisMatriculaacademica.findAll", query="SELECT h FROM HisMatriculaacademica h")
public class HisMatriculaacademica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MAAC_ID")
	private long maacId;

	@Column(name="CATE_ID")
	private BigDecimal cateId;

	@Column(name="ESTP_ID")
	private BigDecimal estpId;

	@Column(name="MAAC_ANTIGUEDAD")
	private BigDecimal maacAntiguedad;

	@Temporal(TemporalType.DATE)
	@Column(name="MAAC_FECHACAMBIO")
	private Date maacFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="MAAC_FECHAMATRICULA")
	private Date maacFechamatricula;

	@Column(name="MAAC_PERDIOSEMESTRE")
	private String maacPerdiosemestre;

	@Column(name="MAAC_PERIODOACADEMICO")
	private BigDecimal maacPeriodoacademico;

	@Column(name="MAAC_PROMEDIO")
	private BigDecimal maacPromedio;

	@Column(name="MAAC_PROMEDIOGENERAL")
	private BigDecimal maacPromediogeneral;

	@Column(name="MAAC_REGISTRADOPOR")
	private String maacRegistradopor;

	@Column(name="MAAC_TIPO")
	private String maacTipo;

	@Column(name="PEUN_ID")
	private BigDecimal peunId;

	@Column(name="SITE_ID")
	private BigDecimal siteId;

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	public HisMatriculaacademica() {
	}

	public long getMaacId() {
		return this.maacId;
	}

	public void setMaacId(long maacId) {
		this.maacId = maacId;
	}

	public BigDecimal getCateId() {
		return this.cateId;
	}

	public void setCateId(BigDecimal cateId) {
		this.cateId = cateId;
	}

	public BigDecimal getEstpId() {
		return this.estpId;
	}

	public void setEstpId(BigDecimal estpId) {
		this.estpId = estpId;
	}

	public BigDecimal getMaacAntiguedad() {
		return this.maacAntiguedad;
	}

	public void setMaacAntiguedad(BigDecimal maacAntiguedad) {
		this.maacAntiguedad = maacAntiguedad;
	}

	public Date getMaacFechacambio() {
		return this.maacFechacambio;
	}

	public void setMaacFechacambio(Date maacFechacambio) {
		this.maacFechacambio = maacFechacambio;
	}

	public Date getMaacFechamatricula() {
		return this.maacFechamatricula;
	}

	public void setMaacFechamatricula(Date maacFechamatricula) {
		this.maacFechamatricula = maacFechamatricula;
	}

	public String getMaacPerdiosemestre() {
		return this.maacPerdiosemestre;
	}

	public void setMaacPerdiosemestre(String maacPerdiosemestre) {
		this.maacPerdiosemestre = maacPerdiosemestre;
	}

	public BigDecimal getMaacPeriodoacademico() {
		return this.maacPeriodoacademico;
	}

	public void setMaacPeriodoacademico(BigDecimal maacPeriodoacademico) {
		this.maacPeriodoacademico = maacPeriodoacademico;
	}

	public BigDecimal getMaacPromedio() {
		return this.maacPromedio;
	}

	public void setMaacPromedio(BigDecimal maacPromedio) {
		this.maacPromedio = maacPromedio;
	}

	public BigDecimal getMaacPromediogeneral() {
		return this.maacPromediogeneral;
	}

	public void setMaacPromediogeneral(BigDecimal maacPromediogeneral) {
		this.maacPromediogeneral = maacPromediogeneral;
	}

	public String getMaacRegistradopor() {
		return this.maacRegistradopor;
	}

	public void setMaacRegistradopor(String maacRegistradopor) {
		this.maacRegistradopor = maacRegistradopor;
	}

	public String getMaacTipo() {
		return this.maacTipo;
	}

	public void setMaacTipo(String maacTipo) {
		this.maacTipo = maacTipo;
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

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

}