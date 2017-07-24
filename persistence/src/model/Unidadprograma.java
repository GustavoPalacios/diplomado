package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the UNIDADPROGRAMA database table.
 * 
 */
@Entity
@NamedQuery(name="Unidadprograma.findAll", query="SELECT u FROM Unidadprograma u")
public class Unidadprograma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UNPR_ID")
	private long unprId;

	@Column(name="PROG_ID")
	private BigDecimal progId;

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	@Column(name="UNPR_CUPOMAXIMO")
	private BigDecimal unprCupomaximo;

	@Column(name="UNPR_CUPOMINIMO")
	private BigDecimal unprCupominimo;

	@Column(name="UNPR_ESFACULTAD")
	private String unprEsfacultad;

	@Temporal(TemporalType.DATE)
	@Column(name="UNPR_FECHACAMBIO")
	private Date unprFechacambio;

	@Column(name="UNPR_NUMEROOPCIONADOS")
	private BigDecimal unprNumeroopcionados;

	@Column(name="UNPR_REGISTRADOPOR")
	private String unprRegistradopor;

	@Column(name="UNPR_RELACION")
	private String unprRelacion;

	public Unidadprograma() {
	}

	public long getUnprId() {
		return this.unprId;
	}

	public void setUnprId(long unprId) {
		this.unprId = unprId;
	}

	public BigDecimal getProgId() {
		return this.progId;
	}

	public void setProgId(BigDecimal progId) {
		this.progId = progId;
	}

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

	public BigDecimal getUnprCupomaximo() {
		return this.unprCupomaximo;
	}

	public void setUnprCupomaximo(BigDecimal unprCupomaximo) {
		this.unprCupomaximo = unprCupomaximo;
	}

	public BigDecimal getUnprCupominimo() {
		return this.unprCupominimo;
	}

	public void setUnprCupominimo(BigDecimal unprCupominimo) {
		this.unprCupominimo = unprCupominimo;
	}

	public String getUnprEsfacultad() {
		return this.unprEsfacultad;
	}

	public void setUnprEsfacultad(String unprEsfacultad) {
		this.unprEsfacultad = unprEsfacultad;
	}

	public Date getUnprFechacambio() {
		return this.unprFechacambio;
	}

	public void setUnprFechacambio(Date unprFechacambio) {
		this.unprFechacambio = unprFechacambio;
	}

	public BigDecimal getUnprNumeroopcionados() {
		return this.unprNumeroopcionados;
	}

	public void setUnprNumeroopcionados(BigDecimal unprNumeroopcionados) {
		this.unprNumeroopcionados = unprNumeroopcionados;
	}

	public String getUnprRegistradopor() {
		return this.unprRegistradopor;
	}

	public void setUnprRegistradopor(String unprRegistradopor) {
		this.unprRegistradopor = unprRegistradopor;
	}

	public String getUnprRelacion() {
		return this.unprRelacion;
	}

	public void setUnprRelacion(String unprRelacion) {
		this.unprRelacion = unprRelacion;
	}

}