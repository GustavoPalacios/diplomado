package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PERIODOUNIVERSIDAD database table.
 * 
 */
@Entity
@NamedQuery(name="Periodouniversidad.findAll", query="SELECT p FROM Periodouniversidad p")
public class Periodouniversidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PEUN_ID")
	private long peunId;

	@Column(name="PEUN_ACTUAL")
	private String peunActual;

	@Column(name="PEUN_ANO")
	private BigDecimal peunAno;

	@Column(name="PEUN_CODIGOPERIODO")
	private String peunCodigoperiodo;

	@Temporal(TemporalType.DATE)
	@Column(name="PEUN_FECHACAMBIO")
	private Date peunFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="PEUN_FECHAFIN")
	private Date peunFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="PEUN_FECHAFINCLASES")
	private Date peunFechafinclases;

	@Temporal(TemporalType.DATE)
	@Column(name="PEUN_FECHAINICIO")
	private Date peunFechainicio;

	@Temporal(TemporalType.DATE)
	@Column(name="PEUN_FECHAINICIOCLASES")
	private Date peunFechainicioclases;

	@Column(name="PEUN_PERIODO")
	private String peunPeriodo;

	@Column(name="PEUN_REGISTRADOPOR")
	private String peunRegistradopor;

	@Column(name="TPPA_ID")
	private BigDecimal tppaId;

	public Periodouniversidad() {
	}

	public long getPeunId() {
		return this.peunId;
	}

	public void setPeunId(long peunId) {
		this.peunId = peunId;
	}

	public String getPeunActual() {
		return this.peunActual;
	}

	public void setPeunActual(String peunActual) {
		this.peunActual = peunActual;
	}

	public BigDecimal getPeunAno() {
		return this.peunAno;
	}

	public void setPeunAno(BigDecimal peunAno) {
		this.peunAno = peunAno;
	}

	public String getPeunCodigoperiodo() {
		return this.peunCodigoperiodo;
	}

	public void setPeunCodigoperiodo(String peunCodigoperiodo) {
		this.peunCodigoperiodo = peunCodigoperiodo;
	}

	public Date getPeunFechacambio() {
		return this.peunFechacambio;
	}

	public void setPeunFechacambio(Date peunFechacambio) {
		this.peunFechacambio = peunFechacambio;
	}

	public Date getPeunFechafin() {
		return this.peunFechafin;
	}

	public void setPeunFechafin(Date peunFechafin) {
		this.peunFechafin = peunFechafin;
	}

	public Date getPeunFechafinclases() {
		return this.peunFechafinclases;
	}

	public void setPeunFechafinclases(Date peunFechafinclases) {
		this.peunFechafinclases = peunFechafinclases;
	}

	public Date getPeunFechainicio() {
		return this.peunFechainicio;
	}

	public void setPeunFechainicio(Date peunFechainicio) {
		this.peunFechainicio = peunFechainicio;
	}

	public Date getPeunFechainicioclases() {
		return this.peunFechainicioclases;
	}

	public void setPeunFechainicioclases(Date peunFechainicioclases) {
		this.peunFechainicioclases = peunFechainicioclases;
	}

	public String getPeunPeriodo() {
		return this.peunPeriodo;
	}

	public void setPeunPeriodo(String peunPeriodo) {
		this.peunPeriodo = peunPeriodo;
	}

	public String getPeunRegistradopor() {
		return this.peunRegistradopor;
	}

	public void setPeunRegistradopor(String peunRegistradopor) {
		this.peunRegistradopor = peunRegistradopor;
	}

	public BigDecimal getTppaId() {
		return this.tppaId;
	}

	public void setTppaId(BigDecimal tppaId) {
		this.tppaId = tppaId;
	}

}