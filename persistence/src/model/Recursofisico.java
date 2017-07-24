package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RECURSOFISICO database table.
 * 
 */
@Entity
@NamedQuery(name="Recursofisico.findAll", query="SELECT r FROM Recursofisico r")
public class Recursofisico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFI_ID")
	private long refiId;

	@Column(name="ESFI_ID")
	private BigDecimal esfiId;

	@Column(name="REFI_AREAREAL")
	private BigDecimal refiAreareal;

	@Column(name="REFI_AREAUSADA")
	private BigDecimal refiAreausada;

	@Column(name="REFI_CAPACIDADMAXIMA")
	private BigDecimal refiCapacidadmaxima;

	@Column(name="REFI_CAPACIDADREAL")
	private BigDecimal refiCapacidadreal;

	@Column(name="REFI_DESCRIPCION")
	private String refiDescripcion;

	@Column(name="REFI_ESTADO")
	private String refiEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="REFI_FECHACAMBIO")
	private Date refiFechacambio;

	@Column(name="REFI_NIVEL")
	private String refiNivel;

	@Column(name="REFI_NOMENCLATURA")
	private String refiNomenclatura;

	@Column(name="REFI_PRESTABLE")
	private String refiPrestable;

	@Column(name="REFI_REGISTRADOPOR")
	private String refiRegistradopor;

	@Column(name="REFI_TIPOASIGNACION")
	private String refiTipoasignacion;

	@Column(name="SIRF_ID")
	private BigDecimal sirfId;

	@Column(name="TIPO_ID")
	private BigDecimal tipoId;

	@Column(name="TIRF_ID")
	private BigDecimal tirfId;

	public Recursofisico() {
	}

	public long getRefiId() {
		return this.refiId;
	}

	public void setRefiId(long refiId) {
		this.refiId = refiId;
	}

	public BigDecimal getEsfiId() {
		return this.esfiId;
	}

	public void setEsfiId(BigDecimal esfiId) {
		this.esfiId = esfiId;
	}

	public BigDecimal getRefiAreareal() {
		return this.refiAreareal;
	}

	public void setRefiAreareal(BigDecimal refiAreareal) {
		this.refiAreareal = refiAreareal;
	}

	public BigDecimal getRefiAreausada() {
		return this.refiAreausada;
	}

	public void setRefiAreausada(BigDecimal refiAreausada) {
		this.refiAreausada = refiAreausada;
	}

	public BigDecimal getRefiCapacidadmaxima() {
		return this.refiCapacidadmaxima;
	}

	public void setRefiCapacidadmaxima(BigDecimal refiCapacidadmaxima) {
		this.refiCapacidadmaxima = refiCapacidadmaxima;
	}

	public BigDecimal getRefiCapacidadreal() {
		return this.refiCapacidadreal;
	}

	public void setRefiCapacidadreal(BigDecimal refiCapacidadreal) {
		this.refiCapacidadreal = refiCapacidadreal;
	}

	public String getRefiDescripcion() {
		return this.refiDescripcion;
	}

	public void setRefiDescripcion(String refiDescripcion) {
		this.refiDescripcion = refiDescripcion;
	}

	public String getRefiEstado() {
		return this.refiEstado;
	}

	public void setRefiEstado(String refiEstado) {
		this.refiEstado = refiEstado;
	}

	public Date getRefiFechacambio() {
		return this.refiFechacambio;
	}

	public void setRefiFechacambio(Date refiFechacambio) {
		this.refiFechacambio = refiFechacambio;
	}

	public String getRefiNivel() {
		return this.refiNivel;
	}

	public void setRefiNivel(String refiNivel) {
		this.refiNivel = refiNivel;
	}

	public String getRefiNomenclatura() {
		return this.refiNomenclatura;
	}

	public void setRefiNomenclatura(String refiNomenclatura) {
		this.refiNomenclatura = refiNomenclatura;
	}

	public String getRefiPrestable() {
		return this.refiPrestable;
	}

	public void setRefiPrestable(String refiPrestable) {
		this.refiPrestable = refiPrestable;
	}

	public String getRefiRegistradopor() {
		return this.refiRegistradopor;
	}

	public void setRefiRegistradopor(String refiRegistradopor) {
		this.refiRegistradopor = refiRegistradopor;
	}

	public String getRefiTipoasignacion() {
		return this.refiTipoasignacion;
	}

	public void setRefiTipoasignacion(String refiTipoasignacion) {
		this.refiTipoasignacion = refiTipoasignacion;
	}

	public BigDecimal getSirfId() {
		return this.sirfId;
	}

	public void setSirfId(BigDecimal sirfId) {
		this.sirfId = sirfId;
	}

	public BigDecimal getTipoId() {
		return this.tipoId;
	}

	public void setTipoId(BigDecimal tipoId) {
		this.tipoId = tipoId;
	}

	public BigDecimal getTirfId() {
		return this.tirfId;
	}

	public void setTirfId(BigDecimal tirfId) {
		this.tirfId = tirfId;
	}

}