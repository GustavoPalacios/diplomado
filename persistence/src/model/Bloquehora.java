package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the BLOQUEHORAS database table.
 * 
 */
@Entity
@Table(name="BLOQUEHORAS")
@NamedQueries({
@NamedQuery(name="Bloquehora.findAll", query="SELECT b FROM Bloquehora b"),
@NamedQuery(name="Bloquehora.findId", query="SELECT b FROM Bloquehora b where b.blhoId = :blhoId")
}) 
public class Bloquehora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BLHO_ID")
	private long blhoId;

	@Temporal(TemporalType.DATE)
	@Column(name="BLHO_FECHACAMBIO")
	private Date blhoFechacambio;

	@Column(name="BLHO_HORAFINAL")
	private String blhoHorafinal;

	@Column(name="BLHO_HORAINICIO")
	private String blhoHorainicio;

	@Column(name="BLHO_NOMBRE")
	private String blhoNombre;

	@Column(name="BLHO_REGISTRADOPOR")
	private String blhoRegistradopor;

	@Column(name="TIHO_ID")
	private BigDecimal tihoId;

	public Bloquehora() {
	}

	public long getBlhoId() {
		return this.blhoId;
	}

	public void setBlhoId(long blhoId) {
		this.blhoId = blhoId;
	}

	public Date getBlhoFechacambio() {
		return this.blhoFechacambio;
	}

	public void setBlhoFechacambio(Date blhoFechacambio) {
		this.blhoFechacambio = blhoFechacambio;
	}

	public String getBlhoHorafinal() {
		return this.blhoHorafinal;
	}

	public void setBlhoHorafinal(String blhoHorafinal) {
		this.blhoHorafinal = blhoHorafinal;
	}

	public String getBlhoHorainicio() {
		return this.blhoHorainicio;
	}

	public void setBlhoHorainicio(String blhoHorainicio) {
		this.blhoHorainicio = blhoHorainicio;
	}

	public String getBlhoNombre() {
		return this.blhoNombre;
	}

	public void setBlhoNombre(String blhoNombre) {
		this.blhoNombre = blhoNombre;
	}

	public String getBlhoRegistradopor() {
		return this.blhoRegistradopor;
	}

	public void setBlhoRegistradopor(String blhoRegistradopor) {
		this.blhoRegistradopor = blhoRegistradopor;
	}

	public BigDecimal getTihoId() {
		return this.tihoId;
	}

	public void setTihoId(BigDecimal tihoId) {
		this.tihoId = tihoId;
	}

}