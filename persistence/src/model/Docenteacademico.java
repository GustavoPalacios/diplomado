package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DOCENTEACADEMICO database table.
 * 
 */
@Entity
@NamedQuery(name="Docenteacademico.findAll", query="SELECT d FROM Docenteacademico d")
public class Docenteacademico implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocenteacademicoPK id;

	@Column(name="CAES_ID")
	private BigDecimal caesId;

	@Temporal(TemporalType.DATE)
	@Column(name="DOCE_FECHACAMBIO")
	private Date doceFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="DOCE_FECHAINICIOCATEGORIA")
	private Date doceFechainiciocategoria;

	@Column(name="DOCE_PUNTOS")
	private BigDecimal docePuntos;

	@Column(name="DOCE_REGISTRADOPOR")
	private String doceRegistradopor;

	@Column(name="NORG_ID")
	private BigDecimal norgId;

	public Docenteacademico() {
	}

	public DocenteacademicoPK getId() {
		return this.id;
	}

	public void setId(DocenteacademicoPK id) {
		this.id = id;
	}

	public BigDecimal getCaesId() {
		return this.caesId;
	}

	public void setCaesId(BigDecimal caesId) {
		this.caesId = caesId;
	}

	public Date getDoceFechacambio() {
		return this.doceFechacambio;
	}

	public void setDoceFechacambio(Date doceFechacambio) {
		this.doceFechacambio = doceFechacambio;
	}

	public Date getDoceFechainiciocategoria() {
		return this.doceFechainiciocategoria;
	}

	public void setDoceFechainiciocategoria(Date doceFechainiciocategoria) {
		this.doceFechainiciocategoria = doceFechainiciocategoria;
	}

	public BigDecimal getDocePuntos() {
		return this.docePuntos;
	}

	public void setDocePuntos(BigDecimal docePuntos) {
		this.docePuntos = docePuntos;
	}

	public String getDoceRegistradopor() {
		return this.doceRegistradopor;
	}

	public void setDoceRegistradopor(String doceRegistradopor) {
		this.doceRegistradopor = doceRegistradopor;
	}

	public BigDecimal getNorgId() {
		return this.norgId;
	}

	public void setNorgId(BigDecimal norgId) {
		this.norgId = norgId;
	}

}