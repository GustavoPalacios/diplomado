package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FORMULARIOINSCRIPCION database table.
 * 
 */
@Entity
@NamedQuery(name="Formularioinscripcion.findAll", query="SELECT f FROM Formularioinscripcion f")
public class Formularioinscripcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FOIN_ID")
	private long foinId;

	@Column(name="ASPI_ID")
	private BigDecimal aspiId;

	@Column(name="CONS_NUMERO")
	private String consNumero;

	@Column(name="ESTP_ID")
	private BigDecimal estpId;

	@Column(name="FOIN_CODIGO")
	private String foinCodigo;

	@Column(name="FOIN_CONSECUTIVO")
	private BigDecimal foinConsecutivo;

	@Column(name="FOIN_ESTADOADMISION")
	private String foinEstadoadmision;

	@Column(name="FOIN_ESTADOADMISIONANTERIOR")
	private String foinEstadoadmisionanterior;

	@Temporal(TemporalType.DATE)
	@Column(name="FOIN_FECHACAMBIO")
	private Date foinFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="FOIN_FECHAHORAVERIFICACION")
	private Date foinFechahoraverificacion;

	@Column(name="FOIN_INSCRIPCION")
	private String foinInscripcion;

	@Column(name="FOIN_MEDIOINSCRIPCION")
	private String foinMedioinscripcion;

	@Lob
	@Column(name="FOIN_MOTIVOANULACION")
	private String foinMotivoanulacion;

	@Lob
	@Column(name="FOIN_OBSERVACION")
	private String foinObservacion;

	@Column(name="FOIN_OTRACIRCUNSCRIPCION")
	private String foinOtracircunscripcion;

	@Column(name="FOIN_PROGRAMAADMITIDO")
	private String foinProgramaadmitido;

	@Column(name="FOIN_REFERENCIAPAGO")
	private String foinReferenciapago;

	@Column(name="FOIN_REGISTRADOPOR")
	private String foinRegistradopor;

	@Column(name="FOIN_SIMULTANEIDAD")
	private String foinSimultaneidad;

	@Column(name="LLAM_ID")
	private BigDecimal llamId;

	@Column(name="PIN_ID")
	private BigDecimal pinId;

	@Column(name="SEPE_ID")
	private BigDecimal sepeId;

	@Column(name="TIAD_ID")
	private BigDecimal tiadId;

	@Column(name="TIIN_ID")
	private BigDecimal tiinId;

	public Formularioinscripcion() {
	}

	public long getFoinId() {
		return this.foinId;
	}

	public void setFoinId(long foinId) {
		this.foinId = foinId;
	}

	public BigDecimal getAspiId() {
		return this.aspiId;
	}

	public void setAspiId(BigDecimal aspiId) {
		this.aspiId = aspiId;
	}

	public String getConsNumero() {
		return this.consNumero;
	}

	public void setConsNumero(String consNumero) {
		this.consNumero = consNumero;
	}

	public BigDecimal getEstpId() {
		return this.estpId;
	}

	public void setEstpId(BigDecimal estpId) {
		this.estpId = estpId;
	}

	public String getFoinCodigo() {
		return this.foinCodigo;
	}

	public void setFoinCodigo(String foinCodigo) {
		this.foinCodigo = foinCodigo;
	}

	public BigDecimal getFoinConsecutivo() {
		return this.foinConsecutivo;
	}

	public void setFoinConsecutivo(BigDecimal foinConsecutivo) {
		this.foinConsecutivo = foinConsecutivo;
	}

	public String getFoinEstadoadmision() {
		return this.foinEstadoadmision;
	}

	public void setFoinEstadoadmision(String foinEstadoadmision) {
		this.foinEstadoadmision = foinEstadoadmision;
	}

	public String getFoinEstadoadmisionanterior() {
		return this.foinEstadoadmisionanterior;
	}

	public void setFoinEstadoadmisionanterior(String foinEstadoadmisionanterior) {
		this.foinEstadoadmisionanterior = foinEstadoadmisionanterior;
	}

	public Date getFoinFechacambio() {
		return this.foinFechacambio;
	}

	public void setFoinFechacambio(Date foinFechacambio) {
		this.foinFechacambio = foinFechacambio;
	}

	public Date getFoinFechahoraverificacion() {
		return this.foinFechahoraverificacion;
	}

	public void setFoinFechahoraverificacion(Date foinFechahoraverificacion) {
		this.foinFechahoraverificacion = foinFechahoraverificacion;
	}

	public String getFoinInscripcion() {
		return this.foinInscripcion;
	}

	public void setFoinInscripcion(String foinInscripcion) {
		this.foinInscripcion = foinInscripcion;
	}

	public String getFoinMedioinscripcion() {
		return this.foinMedioinscripcion;
	}

	public void setFoinMedioinscripcion(String foinMedioinscripcion) {
		this.foinMedioinscripcion = foinMedioinscripcion;
	}

	public String getFoinMotivoanulacion() {
		return this.foinMotivoanulacion;
	}

	public void setFoinMotivoanulacion(String foinMotivoanulacion) {
		this.foinMotivoanulacion = foinMotivoanulacion;
	}

	public String getFoinObservacion() {
		return this.foinObservacion;
	}

	public void setFoinObservacion(String foinObservacion) {
		this.foinObservacion = foinObservacion;
	}

	public String getFoinOtracircunscripcion() {
		return this.foinOtracircunscripcion;
	}

	public void setFoinOtracircunscripcion(String foinOtracircunscripcion) {
		this.foinOtracircunscripcion = foinOtracircunscripcion;
	}

	public String getFoinProgramaadmitido() {
		return this.foinProgramaadmitido;
	}

	public void setFoinProgramaadmitido(String foinProgramaadmitido) {
		this.foinProgramaadmitido = foinProgramaadmitido;
	}

	public String getFoinReferenciapago() {
		return this.foinReferenciapago;
	}

	public void setFoinReferenciapago(String foinReferenciapago) {
		this.foinReferenciapago = foinReferenciapago;
	}

	public String getFoinRegistradopor() {
		return this.foinRegistradopor;
	}

	public void setFoinRegistradopor(String foinRegistradopor) {
		this.foinRegistradopor = foinRegistradopor;
	}

	public String getFoinSimultaneidad() {
		return this.foinSimultaneidad;
	}

	public void setFoinSimultaneidad(String foinSimultaneidad) {
		this.foinSimultaneidad = foinSimultaneidad;
	}

	public BigDecimal getLlamId() {
		return this.llamId;
	}

	public void setLlamId(BigDecimal llamId) {
		this.llamId = llamId;
	}

	public BigDecimal getPinId() {
		return this.pinId;
	}

	public void setPinId(BigDecimal pinId) {
		this.pinId = pinId;
	}

	public BigDecimal getSepeId() {
		return this.sepeId;
	}

	public void setSepeId(BigDecimal sepeId) {
		this.sepeId = sepeId;
	}

	public BigDecimal getTiadId() {
		return this.tiadId;
	}

	public void setTiadId(BigDecimal tiadId) {
		this.tiadId = tiadId;
	}

	public BigDecimal getTiinId() {
		return this.tiinId;
	}

	public void setTiinId(BigDecimal tiinId) {
		this.tiinId = tiinId;
	}

}