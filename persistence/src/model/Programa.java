package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PROGRAMA database table.
 * 
 */
@Entity
@NamedQuery(name="Programa.findAll", query="SELECT p FROM Programa p")
public class Programa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROG_ID")
	private long progId;

	@Column(name="JORN_ID")
	private BigDecimal jornId;

	@Column(name="METO_ID")
	private BigDecimal metoId;

	@Column(name="MODA_ID")
	private BigDecimal modaId;

	@Column(name="NORG_ID")
	private BigDecimal norgId;

	@Column(name="PROG_ABREVIATURA")
	private String progAbreviatura;

	@Column(name="PROG_CICLOPROPEDEUTICO")
	private BigDecimal progCiclopropedeutico;

	@Column(name="PROG_CODIGOICFES")
	private String progCodigoicfes;

	@Column(name="PROG_CODIGOPROGRAMA")
	private String progCodigoprograma;

	@Column(name="PROG_CODIGOSNIES")
	private String progCodigosnies;

	@Column(name="PROG_COMPLEJIDAD")
	private String progComplejidad;

	@Column(name="PROG_ESTADO")
	private String progEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="PROG_FECHAAPROBACIONICFES")
	private Date progFechaaprobacionicfes;

	@Temporal(TemporalType.DATE)
	@Column(name="PROG_FECHACAMBIO")
	private Date progFechacambio;

	@Column(name="PROG_NOMBRE")
	private String progNombre;

	@Column(name="PROG_NUMPERIODOS")
	private BigDecimal progNumperiodos;

	@Column(name="PROG_REGISTRADOPOR")
	private String progRegistradopor;

	@Column(name="PROG_TIENECONVENIO")
	private String progTieneconvenio;

	@Column(name="PROG_TIPOPROGRAMA")
	private String progTipoprograma;

	@Column(name="PROG_TITULOOTORGA")
	private String progTitulootorga;

	@Column(name="PROM_ID")
	private BigDecimal promId;

	@Column(name="TPPA_ID")
	private BigDecimal tppaId;

	public Programa() {
	}

	public long getProgId() {
		return this.progId;
	}

	public void setProgId(long progId) {
		this.progId = progId;
	}

	public BigDecimal getJornId() {
		return this.jornId;
	}

	public void setJornId(BigDecimal jornId) {
		this.jornId = jornId;
	}

	public BigDecimal getMetoId() {
		return this.metoId;
	}

	public void setMetoId(BigDecimal metoId) {
		this.metoId = metoId;
	}

	public BigDecimal getModaId() {
		return this.modaId;
	}

	public void setModaId(BigDecimal modaId) {
		this.modaId = modaId;
	}

	public BigDecimal getNorgId() {
		return this.norgId;
	}

	public void setNorgId(BigDecimal norgId) {
		this.norgId = norgId;
	}

	public String getProgAbreviatura() {
		return this.progAbreviatura;
	}

	public void setProgAbreviatura(String progAbreviatura) {
		this.progAbreviatura = progAbreviatura;
	}

	public BigDecimal getProgCiclopropedeutico() {
		return this.progCiclopropedeutico;
	}

	public void setProgCiclopropedeutico(BigDecimal progCiclopropedeutico) {
		this.progCiclopropedeutico = progCiclopropedeutico;
	}

	public String getProgCodigoicfes() {
		return this.progCodigoicfes;
	}

	public void setProgCodigoicfes(String progCodigoicfes) {
		this.progCodigoicfes = progCodigoicfes;
	}

	public String getProgCodigoprograma() {
		return this.progCodigoprograma;
	}

	public void setProgCodigoprograma(String progCodigoprograma) {
		this.progCodigoprograma = progCodigoprograma;
	}

	public String getProgCodigosnies() {
		return this.progCodigosnies;
	}

	public void setProgCodigosnies(String progCodigosnies) {
		this.progCodigosnies = progCodigosnies;
	}

	public String getProgComplejidad() {
		return this.progComplejidad;
	}

	public void setProgComplejidad(String progComplejidad) {
		this.progComplejidad = progComplejidad;
	}

	public String getProgEstado() {
		return this.progEstado;
	}

	public void setProgEstado(String progEstado) {
		this.progEstado = progEstado;
	}

	public Date getProgFechaaprobacionicfes() {
		return this.progFechaaprobacionicfes;
	}

	public void setProgFechaaprobacionicfes(Date progFechaaprobacionicfes) {
		this.progFechaaprobacionicfes = progFechaaprobacionicfes;
	}

	public Date getProgFechacambio() {
		return this.progFechacambio;
	}

	public void setProgFechacambio(Date progFechacambio) {
		this.progFechacambio = progFechacambio;
	}

	public String getProgNombre() {
		return this.progNombre;
	}

	public void setProgNombre(String progNombre) {
		this.progNombre = progNombre;
	}

	public BigDecimal getProgNumperiodos() {
		return this.progNumperiodos;
	}

	public void setProgNumperiodos(BigDecimal progNumperiodos) {
		this.progNumperiodos = progNumperiodos;
	}

	public String getProgRegistradopor() {
		return this.progRegistradopor;
	}

	public void setProgRegistradopor(String progRegistradopor) {
		this.progRegistradopor = progRegistradopor;
	}

	public String getProgTieneconvenio() {
		return this.progTieneconvenio;
	}

	public void setProgTieneconvenio(String progTieneconvenio) {
		this.progTieneconvenio = progTieneconvenio;
	}

	public String getProgTipoprograma() {
		return this.progTipoprograma;
	}

	public void setProgTipoprograma(String progTipoprograma) {
		this.progTipoprograma = progTipoprograma;
	}

	public String getProgTitulootorga() {
		return this.progTitulootorga;
	}

	public void setProgTitulootorga(String progTitulootorga) {
		this.progTitulootorga = progTitulootorga;
	}

	public BigDecimal getPromId() {
		return this.promId;
	}

	public void setPromId(BigDecimal promId) {
		this.promId = promId;
	}

	public BigDecimal getTppaId() {
		return this.tppaId;
	}

	public void setTppaId(BigDecimal tppaId) {
		this.tppaId = tppaId;
	}

}