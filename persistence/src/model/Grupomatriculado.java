package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GRUPOMATRICULADO database table.
 * 
 */
@Entity
@NamedQuery(name="Grupomatriculado.findAll", query="SELECT g FROM Grupomatriculado g")
public class Grupomatriculado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GRUP_ID")
	private long grupId;

	@Column(name="EQPM_ID")
	private BigDecimal eqpmId;

	@Column(name="GRMA_APROBADO")
	private String grmaAprobado;

	@Column(name="GRMA_BANCOMATERIA")
	private String grmaBancomateria;

	@Column(name="GRMA_DEFINITIVA")
	private BigDecimal grmaDefinitiva;

	@Column(name="GRMA_DEFINITIVANCL_ID")
	private BigDecimal grmaDefinitivanclId;

	@Column(name="GRMA_DESEMPENO")
	private BigDecimal grmaDesempeno;

	@Column(name="GRMA_ESTADO")
	private String grmaEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="GRMA_FECHACAMBIO")
	private Date grmaFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="GRMA_FECHAREGISTRO")
	private Date grmaFecharegistro;

	@Column(name="GRMA_FINAL")
	private BigDecimal grmaFinal;

	@Column(name="GRMA_FINALNCL_ID")
	private BigDecimal grmaFinalnclId;

	@Column(name="GRMA_HABILITACION")
	private BigDecimal grmaHabilitacion;

	@Column(name="GRMA_HABILITACIONNCL_ID")
	private BigDecimal grmaHabilitacionnclId;

	@Column(name="GRMA_ID")
	private BigDecimal grmaId;

	@Column(name="GRMA_NUMEROFALLAS")
	private BigDecimal grmaNumerofallas;

	@Column(name="GRMA_NUMEROFALLAS2")
	private BigDecimal grmaNumerofallas2;

	@Column(name="GRMA_PERDIDAFALLAS")
	private String grmaPerdidafallas;

	@Column(name="GRMA_REGISTRADOPOR")
	private String grmaRegistradopor;

	@Column(name="MAAC_ID")
	private BigDecimal maacId;

	@Column(name="MATE_CODIGOMATERIAREAL")
	private String mateCodigomateriareal;

	@Column(name="PENS_IDEQUIVALENTE")
	private BigDecimal pensIdequivalente;

	public Grupomatriculado() {
	}

	public long getGrupId() {
		return this.grupId;
	}

	public void setGrupId(long grupId) {
		this.grupId = grupId;
	}

	public BigDecimal getEqpmId() {
		return this.eqpmId;
	}

	public void setEqpmId(BigDecimal eqpmId) {
		this.eqpmId = eqpmId;
	}

	public String getGrmaAprobado() {
		return this.grmaAprobado;
	}

	public void setGrmaAprobado(String grmaAprobado) {
		this.grmaAprobado = grmaAprobado;
	}

	public String getGrmaBancomateria() {
		return this.grmaBancomateria;
	}

	public void setGrmaBancomateria(String grmaBancomateria) {
		this.grmaBancomateria = grmaBancomateria;
	}

	public BigDecimal getGrmaDefinitiva() {
		return this.grmaDefinitiva;
	}

	public void setGrmaDefinitiva(BigDecimal grmaDefinitiva) {
		this.grmaDefinitiva = grmaDefinitiva;
	}

	public BigDecimal getGrmaDefinitivanclId() {
		return this.grmaDefinitivanclId;
	}

	public void setGrmaDefinitivanclId(BigDecimal grmaDefinitivanclId) {
		this.grmaDefinitivanclId = grmaDefinitivanclId;
	}

	public BigDecimal getGrmaDesempeno() {
		return this.grmaDesempeno;
	}

	public void setGrmaDesempeno(BigDecimal grmaDesempeno) {
		this.grmaDesempeno = grmaDesempeno;
	}

	public String getGrmaEstado() {
		return this.grmaEstado;
	}

	public void setGrmaEstado(String grmaEstado) {
		this.grmaEstado = grmaEstado;
	}

	public Date getGrmaFechacambio() {
		return this.grmaFechacambio;
	}

	public void setGrmaFechacambio(Date grmaFechacambio) {
		this.grmaFechacambio = grmaFechacambio;
	}

	public Date getGrmaFecharegistro() {
		return this.grmaFecharegistro;
	}

	public void setGrmaFecharegistro(Date grmaFecharegistro) {
		this.grmaFecharegistro = grmaFecharegistro;
	}

	public BigDecimal getGrmaFinal() {
		return this.grmaFinal;
	}

	public void setGrmaFinal(BigDecimal grmaFinal) {
		this.grmaFinal = grmaFinal;
	}

	public BigDecimal getGrmaFinalnclId() {
		return this.grmaFinalnclId;
	}

	public void setGrmaFinalnclId(BigDecimal grmaFinalnclId) {
		this.grmaFinalnclId = grmaFinalnclId;
	}

	public BigDecimal getGrmaHabilitacion() {
		return this.grmaHabilitacion;
	}

	public void setGrmaHabilitacion(BigDecimal grmaHabilitacion) {
		this.grmaHabilitacion = grmaHabilitacion;
	}

	public BigDecimal getGrmaHabilitacionnclId() {
		return this.grmaHabilitacionnclId;
	}

	public void setGrmaHabilitacionnclId(BigDecimal grmaHabilitacionnclId) {
		this.grmaHabilitacionnclId = grmaHabilitacionnclId;
	}

	public BigDecimal getGrmaId() {
		return this.grmaId;
	}

	public void setGrmaId(BigDecimal grmaId) {
		this.grmaId = grmaId;
	}

	public BigDecimal getGrmaNumerofallas() {
		return this.grmaNumerofallas;
	}

	public void setGrmaNumerofallas(BigDecimal grmaNumerofallas) {
		this.grmaNumerofallas = grmaNumerofallas;
	}

	public BigDecimal getGrmaNumerofallas2() {
		return this.grmaNumerofallas2;
	}

	public void setGrmaNumerofallas2(BigDecimal grmaNumerofallas2) {
		this.grmaNumerofallas2 = grmaNumerofallas2;
	}

	public String getGrmaPerdidafallas() {
		return this.grmaPerdidafallas;
	}

	public void setGrmaPerdidafallas(String grmaPerdidafallas) {
		this.grmaPerdidafallas = grmaPerdidafallas;
	}

	public String getGrmaRegistradopor() {
		return this.grmaRegistradopor;
	}

	public void setGrmaRegistradopor(String grmaRegistradopor) {
		this.grmaRegistradopor = grmaRegistradopor;
	}

	public BigDecimal getMaacId() {
		return this.maacId;
	}

	public void setMaacId(BigDecimal maacId) {
		this.maacId = maacId;
	}

	public String getMateCodigomateriareal() {
		return this.mateCodigomateriareal;
	}

	public void setMateCodigomateriareal(String mateCodigomateriareal) {
		this.mateCodigomateriareal = mateCodigomateriareal;
	}

	public BigDecimal getPensIdequivalente() {
		return this.pensIdequivalente;
	}

	public void setPensIdequivalente(BigDecimal pensIdequivalente) {
		this.pensIdequivalente = pensIdequivalente;
	}

}