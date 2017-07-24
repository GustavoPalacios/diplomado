package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MATRICULAACADEMICA database table.
 * 
 */
@Entity
@NamedQuery(name="Matriculaacademica.findAll", query="SELECT m FROM Matriculaacademica m")
public class Matriculaacademica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MAAC_ID")
	private long maacId;

	@Column(name="ESTP_ID")
	private BigDecimal estpId;

	@Column(name="MAAC_ESTADO")
	private String maacEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="MAAC_FECHACAMBIO")
	private Date maacFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="MAAC_FECHAMATRICULA")
	private Date maacFechamatricula;

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

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	public Matriculaacademica() {
	}

	public long getMaacId() {
		return this.maacId;
	}

	public void setMaacId(long maacId) {
		this.maacId = maacId;
	}

	public BigDecimal getEstpId() {
		return this.estpId;
	}

	public void setEstpId(BigDecimal estpId) {
		this.estpId = estpId;
	}

	public String getMaacEstado() {
		return this.maacEstado;
	}

	public void setMaacEstado(String maacEstado) {
		this.maacEstado = maacEstado;
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

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

}