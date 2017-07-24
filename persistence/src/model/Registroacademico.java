package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the REGISTROACADEMICO database table.
 * 
 */
@Entity
@NamedQuery(name="Registroacademico.findAll", query="SELECT r FROM Registroacademico r")
public class Registroacademico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REAC_ID")
	private long reacId;

	@Column(name="EQPM_ID")
	private BigDecimal eqpmId;

	@Column(name="ESTP_ID")
	private BigDecimal estpId;

	@Column(name="GRUP_ID")
	private BigDecimal grupId;

	@Column(name="MAAC_ID")
	private BigDecimal maacId;

	@Column(name="MATE_CODIGOMATERIA")
	private String mateCodigomateria;

	@Column(name="MATE_CODIGOMATERIAREAL")
	private String mateCodigomateriareal;

	@Column(name="PENSEQUIVALENTE_ID")
	private BigDecimal pensequivalenteId;

	@Column(name="PEUN_ID")
	private BigDecimal peunId;

	@Column(name="REAC_APROBADO")
	private String reacAprobado;

	@Column(name="REAC_BANCOMATERIA")
	private String reacBancomateria;

	@Column(name="REAC_CUENTAPROMEDIO")
	private String reacCuentapromedio;

	@Column(name="REAC_DESEMPENO")
	private BigDecimal reacDesempeno;

	@Column(name="REAC_ESTADO")
	private String reacEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="REAC_FECHACAMBIO")
	private Date reacFechacambio;

	@Column(name="REAC_HABILITACION")
	private BigDecimal reacHabilitacion;

	@Column(name="REAC_HABILITACIONCL")
	private BigDecimal reacHabilitacioncl;

	@Column(name="REAC_NOTAANTESHAB")
	private BigDecimal reacNotaanteshab;

	@Column(name="REAC_NOTAANTESHABCL")
	private BigDecimal reacNotaanteshabcl;

	@Column(name="REAC_NOTAANTESHABCL1")
	private String reacNotaanteshabcl1;

	@Column(name="REAC_NOTAFINAL")
	private BigDecimal reacNotafinal;

	@Column(name="REAC_NOTAFINALCL")
	private BigDecimal reacNotafinalcl;

	@Column(name="REAC_NOTAFINALCL1")
	private String reacNotafinalcl1;

	@Column(name="REAC_NUMEROFALLAS")
	private BigDecimal reacNumerofallas;

	@Column(name="REAC_NUMEROFALLAS2")
	private BigDecimal reacNumerofallas2;

	@Column(name="REAC_PERDIDAFALLAS")
	private String reacPerdidafallas;

	@Column(name="REAC_PONDERACIONACADEMICA")
	private BigDecimal reacPonderacionacademica;

	@Column(name="REAC_REGISTRADOPOR")
	private String reacRegistradopor;

	@Column(name="REAC_TIPO")
	private String reacTipo;

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	public Registroacademico() {
	}

	public long getReacId() {
		return this.reacId;
	}

	public void setReacId(long reacId) {
		this.reacId = reacId;
	}

	public BigDecimal getEqpmId() {
		return this.eqpmId;
	}

	public void setEqpmId(BigDecimal eqpmId) {
		this.eqpmId = eqpmId;
	}

	public BigDecimal getEstpId() {
		return this.estpId;
	}

	public void setEstpId(BigDecimal estpId) {
		this.estpId = estpId;
	}

	public BigDecimal getGrupId() {
		return this.grupId;
	}

	public void setGrupId(BigDecimal grupId) {
		this.grupId = grupId;
	}

	public BigDecimal getMaacId() {
		return this.maacId;
	}

	public void setMaacId(BigDecimal maacId) {
		this.maacId = maacId;
	}

	public String getMateCodigomateria() {
		return this.mateCodigomateria;
	}

	public void setMateCodigomateria(String mateCodigomateria) {
		this.mateCodigomateria = mateCodigomateria;
	}

	public String getMateCodigomateriareal() {
		return this.mateCodigomateriareal;
	}

	public void setMateCodigomateriareal(String mateCodigomateriareal) {
		this.mateCodigomateriareal = mateCodigomateriareal;
	}

	public BigDecimal getPensequivalenteId() {
		return this.pensequivalenteId;
	}

	public void setPensequivalenteId(BigDecimal pensequivalenteId) {
		this.pensequivalenteId = pensequivalenteId;
	}

	public BigDecimal getPeunId() {
		return this.peunId;
	}

	public void setPeunId(BigDecimal peunId) {
		this.peunId = peunId;
	}

	public String getReacAprobado() {
		return this.reacAprobado;
	}

	public void setReacAprobado(String reacAprobado) {
		this.reacAprobado = reacAprobado;
	}

	public String getReacBancomateria() {
		return this.reacBancomateria;
	}

	public void setReacBancomateria(String reacBancomateria) {
		this.reacBancomateria = reacBancomateria;
	}

	public String getReacCuentapromedio() {
		return this.reacCuentapromedio;
	}

	public void setReacCuentapromedio(String reacCuentapromedio) {
		this.reacCuentapromedio = reacCuentapromedio;
	}

	public BigDecimal getReacDesempeno() {
		return this.reacDesempeno;
	}

	public void setReacDesempeno(BigDecimal reacDesempeno) {
		this.reacDesempeno = reacDesempeno;
	}

	public String getReacEstado() {
		return this.reacEstado;
	}

	public void setReacEstado(String reacEstado) {
		this.reacEstado = reacEstado;
	}

	public Date getReacFechacambio() {
		return this.reacFechacambio;
	}

	public void setReacFechacambio(Date reacFechacambio) {
		this.reacFechacambio = reacFechacambio;
	}

	public BigDecimal getReacHabilitacion() {
		return this.reacHabilitacion;
	}

	public void setReacHabilitacion(BigDecimal reacHabilitacion) {
		this.reacHabilitacion = reacHabilitacion;
	}

	public BigDecimal getReacHabilitacioncl() {
		return this.reacHabilitacioncl;
	}

	public void setReacHabilitacioncl(BigDecimal reacHabilitacioncl) {
		this.reacHabilitacioncl = reacHabilitacioncl;
	}

	public BigDecimal getReacNotaanteshab() {
		return this.reacNotaanteshab;
	}

	public void setReacNotaanteshab(BigDecimal reacNotaanteshab) {
		this.reacNotaanteshab = reacNotaanteshab;
	}

	public BigDecimal getReacNotaanteshabcl() {
		return this.reacNotaanteshabcl;
	}

	public void setReacNotaanteshabcl(BigDecimal reacNotaanteshabcl) {
		this.reacNotaanteshabcl = reacNotaanteshabcl;
	}

	public String getReacNotaanteshabcl1() {
		return this.reacNotaanteshabcl1;
	}

	public void setReacNotaanteshabcl1(String reacNotaanteshabcl1) {
		this.reacNotaanteshabcl1 = reacNotaanteshabcl1;
	}

	public BigDecimal getReacNotafinal() {
		return this.reacNotafinal;
	}

	public void setReacNotafinal(BigDecimal reacNotafinal) {
		this.reacNotafinal = reacNotafinal;
	}

	public BigDecimal getReacNotafinalcl() {
		return this.reacNotafinalcl;
	}

	public void setReacNotafinalcl(BigDecimal reacNotafinalcl) {
		this.reacNotafinalcl = reacNotafinalcl;
	}

	public String getReacNotafinalcl1() {
		return this.reacNotafinalcl1;
	}

	public void setReacNotafinalcl1(String reacNotafinalcl1) {
		this.reacNotafinalcl1 = reacNotafinalcl1;
	}

	public BigDecimal getReacNumerofallas() {
		return this.reacNumerofallas;
	}

	public void setReacNumerofallas(BigDecimal reacNumerofallas) {
		this.reacNumerofallas = reacNumerofallas;
	}

	public BigDecimal getReacNumerofallas2() {
		return this.reacNumerofallas2;
	}

	public void setReacNumerofallas2(BigDecimal reacNumerofallas2) {
		this.reacNumerofallas2 = reacNumerofallas2;
	}

	public String getReacPerdidafallas() {
		return this.reacPerdidafallas;
	}

	public void setReacPerdidafallas(String reacPerdidafallas) {
		this.reacPerdidafallas = reacPerdidafallas;
	}

	public BigDecimal getReacPonderacionacademica() {
		return this.reacPonderacionacademica;
	}

	public void setReacPonderacionacademica(BigDecimal reacPonderacionacademica) {
		this.reacPonderacionacademica = reacPonderacionacademica;
	}

	public String getReacRegistradopor() {
		return this.reacRegistradopor;
	}

	public void setReacRegistradopor(String reacRegistradopor) {
		this.reacRegistradopor = reacRegistradopor;
	}

	public String getReacTipo() {
		return this.reacTipo;
	}

	public void setReacTipo(String reacTipo) {
		this.reacTipo = reacTipo;
	}

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

}