package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MATERIARECURSOFISICO database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Materiarecursofisico.findAll", query="SELECT m FROM Materiarecursofisico m"),
@NamedQuery(name="Materiarecursofisico.findRFisico", query="SELECT m FROM Materiarecursofisico m where m.refiId = :refiId"),
@NamedQuery(name="Materiarecursofisico.findIdMateria", query="SELECT m FROM Materiarecursofisico m where m.mateCodigomateria = :mateCodigomateria")
}) 
public class Materiarecursofisico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MATE_CODIGOMATERIA")
	private String mateCodigomateria;

	@Temporal(TemporalType.DATE)
	@Column(name="MARF_FECHACAMBIO")
	private Date marfFechacambio;

	@Column(name="MARF_HORAS")
	private BigDecimal marfHoras;

	@Column(name="MARF_REGISTRADOPOR")
	private String marfRegistradopor;

	@Column(name="REFI_ID")
	private BigDecimal refiId;

	@Column(name="TIHO_ID")
	private BigDecimal tihoId;

	public Materiarecursofisico() {
	}

	public String getMateCodigomateria() {
		return this.mateCodigomateria;
	}

	public void setMateCodigomateria(String mateCodigomateria) {
		this.mateCodigomateria = mateCodigomateria;
	}

	public Date getMarfFechacambio() {
		return this.marfFechacambio;
	}

	public void setMarfFechacambio(Date marfFechacambio) {
		this.marfFechacambio = marfFechacambio;
	}

	public BigDecimal getMarfHoras() {
		return this.marfHoras;
	}

	public void setMarfHoras(BigDecimal marfHoras) {
		this.marfHoras = marfHoras;
	}

	public String getMarfRegistradopor() {
		return this.marfRegistradopor;
	}

	public void setMarfRegistradopor(String marfRegistradopor) {
		this.marfRegistradopor = marfRegistradopor;
	}

	public BigDecimal getRefiId() {
		return this.refiId;
	}

	public void setRefiId(BigDecimal refiId) {
		this.refiId = refiId;
	}

	public BigDecimal getTihoId() {
		return this.tihoId;
	}

	public void setTihoId(BigDecimal tihoId) {
		this.tihoId = tihoId;
	}

}