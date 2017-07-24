package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HIS_GRUPOMATRICULADO database table.
 * 
 */
@Entity
@Table(name="HIS_GRUPOMATRICULADO")
@NamedQuery(name="HisGrupomatriculado.findAll", query="SELECT h FROM HisGrupomatriculado h")
public class HisGrupomatriculado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GRUP_ID")
	private long grupId;

	@Column(name="EQPM_ID")
	private BigDecimal eqpmId;

	@Column(name="GRMA_APROBADO")
	private String grmaAprobado;

	@Column(name="GRMA_ASISTENCIA")
	private BigDecimal grmaAsistencia;

	@Column(name="GRMA_DEFINITIVA")
	private BigDecimal grmaDefinitiva;

	@Column(name="GRMA_DEFINITIVANCL_ID")
	private String grmaDefinitivanclId;

	@Column(name="GRMA_ESTADO")
	private String grmaEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="GRMA_FECHACAMBIO")
	private Date grmaFechacambio;

	@Column(name="GRMA_FINAL")
	private BigDecimal grmaFinal;

	@Column(name="GRMA_FINALNCL_ID")
	private String grmaFinalnclId;

	@Column(name="GRMA_HABILITACION")
	private BigDecimal grmaHabilitacion;

	@Column(name="GRMA_HABILITACIONNCL_ID")
	private String grmaHabilitacionnclId;

	@Column(name="GRMA_ID")
	private BigDecimal grmaId;

	@Column(name="GRMA_PENDIENTE")
	private String grmaPendiente;

	@Column(name="GRMA_REGISTRADOPOR")
	private String grmaRegistradopor;

	@Column(name="MAAC_ID")
	private BigDecimal maacId;

	@Column(name="MATE_CODIGOMATERIAREAL")
	private String mateCodigomateriareal;

	@Column(name="PENS_IDEQUIVALENTE")
	private BigDecimal pensIdequivalente;

	public HisGrupomatriculado() {
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

	public BigDecimal getGrmaAsistencia() {
		return this.grmaAsistencia;
	}

	public void setGrmaAsistencia(BigDecimal grmaAsistencia) {
		this.grmaAsistencia = grmaAsistencia;
	}

	public BigDecimal getGrmaDefinitiva() {
		return this.grmaDefinitiva;
	}

	public void setGrmaDefinitiva(BigDecimal grmaDefinitiva) {
		this.grmaDefinitiva = grmaDefinitiva;
	}

	public String getGrmaDefinitivanclId() {
		return this.grmaDefinitivanclId;
	}

	public void setGrmaDefinitivanclId(String grmaDefinitivanclId) {
		this.grmaDefinitivanclId = grmaDefinitivanclId;
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

	public BigDecimal getGrmaFinal() {
		return this.grmaFinal;
	}

	public void setGrmaFinal(BigDecimal grmaFinal) {
		this.grmaFinal = grmaFinal;
	}

	public String getGrmaFinalnclId() {
		return this.grmaFinalnclId;
	}

	public void setGrmaFinalnclId(String grmaFinalnclId) {
		this.grmaFinalnclId = grmaFinalnclId;
	}

	public BigDecimal getGrmaHabilitacion() {
		return this.grmaHabilitacion;
	}

	public void setGrmaHabilitacion(BigDecimal grmaHabilitacion) {
		this.grmaHabilitacion = grmaHabilitacion;
	}

	public String getGrmaHabilitacionnclId() {
		return this.grmaHabilitacionnclId;
	}

	public void setGrmaHabilitacionnclId(String grmaHabilitacionnclId) {
		this.grmaHabilitacionnclId = grmaHabilitacionnclId;
	}

	public BigDecimal getGrmaId() {
		return this.grmaId;
	}

	public void setGrmaId(BigDecimal grmaId) {
		this.grmaId = grmaId;
	}

	public String getGrmaPendiente() {
		return this.grmaPendiente;
	}

	public void setGrmaPendiente(String grmaPendiente) {
		this.grmaPendiente = grmaPendiente;
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