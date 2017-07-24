package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MODALIDAD database table.
 * 
 */
@Entity
@NamedQuery(name="Modalidad.findAll", query="SELECT m FROM Modalidad m")
public class Modalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MODA_ID")
	private long modaId;

	@Column(name="MODA_CODIGO")
	private String modaCodigo;

	@Column(name="MODA_DESCRIPCION")
	private String modaDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="MODA_FECHACAMBIO")
	private Date modaFechacambio;

	@Column(name="MODA_PUNTOS")
	private BigDecimal modaPuntos;

	@Column(name="MODA_REGISTRADOPOR")
	private String modaRegistradopor;

	@Column(name="NIED_ID")
	private BigDecimal niedId;

	public Modalidad() {
	}

	public long getModaId() {
		return this.modaId;
	}

	public void setModaId(long modaId) {
		this.modaId = modaId;
	}

	public String getModaCodigo() {
		return this.modaCodigo;
	}

	public void setModaCodigo(String modaCodigo) {
		this.modaCodigo = modaCodigo;
	}

	public String getModaDescripcion() {
		return this.modaDescripcion;
	}

	public void setModaDescripcion(String modaDescripcion) {
		this.modaDescripcion = modaDescripcion;
	}

	public Date getModaFechacambio() {
		return this.modaFechacambio;
	}

	public void setModaFechacambio(Date modaFechacambio) {
		this.modaFechacambio = modaFechacambio;
	}

	public BigDecimal getModaPuntos() {
		return this.modaPuntos;
	}

	public void setModaPuntos(BigDecimal modaPuntos) {
		this.modaPuntos = modaPuntos;
	}

	public String getModaRegistradopor() {
		return this.modaRegistradopor;
	}

	public void setModaRegistradopor(String modaRegistradopor) {
		this.modaRegistradopor = modaRegistradopor;
	}

	public BigDecimal getNiedId() {
		return this.niedId;
	}

	public void setNiedId(BigDecimal niedId) {
		this.niedId = niedId;
	}

}