package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the UNIDAD database table.
 * 
 */
@Entity
@NamedQuery(name="Unidad.findAll", query="SELECT u FROM Unidad u")
public class Unidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UNID_ID")
	private long unidId;

	@Column(name="CIGE_ID")
	private BigDecimal cigeId;

	@Column(name="TIUN_ID")
	private BigDecimal tiunId;

	@Column(name="UNID_ACTIVA")
	private String unidActiva;

	@Column(name="UNID_ASOCIAMATERIADIRECTA")
	private String unidAsociamateriadirecta;

	@Column(name="UNID_ASOCIAPROGRAMADIRECTA")
	private String unidAsociaprogramadirecta;

	@Column(name="UNID_CODIGO")
	private String unidCodigo;

	@Column(name="UNID_EMAIL")
	private String unidEmail;

	@Column(name="UNID_EXTTELEFONO")
	private String unidExttelefono;

	@Temporal(TemporalType.DATE)
	@Column(name="UNID_FECHACAMBIO")
	private Date unidFechacambio;

	@Column(name="UNID_NIVEL")
	private String unidNivel;

	@Column(name="UNID_NOMBRE")
	private String unidNombre;

	@Column(name="UNID_REGIONAL")
	private String unidRegional;

	@Column(name="UNID_REGISTRADOPOR")
	private String unidRegistradopor;

	@Column(name="UNID_TELEFONO")
	private String unidTelefono;

	@Column(name="UNID_UBICACION")
	private String unidUbicacion;

	public Unidad() {
	}

	public long getUnidId() {
		return this.unidId;
	}

	public void setUnidId(long unidId) {
		this.unidId = unidId;
	}

	public BigDecimal getCigeId() {
		return this.cigeId;
	}

	public void setCigeId(BigDecimal cigeId) {
		this.cigeId = cigeId;
	}

	public BigDecimal getTiunId() {
		return this.tiunId;
	}

	public void setTiunId(BigDecimal tiunId) {
		this.tiunId = tiunId;
	}

	public String getUnidActiva() {
		return this.unidActiva;
	}

	public void setUnidActiva(String unidActiva) {
		this.unidActiva = unidActiva;
	}

	public String getUnidAsociamateriadirecta() {
		return this.unidAsociamateriadirecta;
	}

	public void setUnidAsociamateriadirecta(String unidAsociamateriadirecta) {
		this.unidAsociamateriadirecta = unidAsociamateriadirecta;
	}

	public String getUnidAsociaprogramadirecta() {
		return this.unidAsociaprogramadirecta;
	}

	public void setUnidAsociaprogramadirecta(String unidAsociaprogramadirecta) {
		this.unidAsociaprogramadirecta = unidAsociaprogramadirecta;
	}

	public String getUnidCodigo() {
		return this.unidCodigo;
	}

	public void setUnidCodigo(String unidCodigo) {
		this.unidCodigo = unidCodigo;
	}

	public String getUnidEmail() {
		return this.unidEmail;
	}

	public void setUnidEmail(String unidEmail) {
		this.unidEmail = unidEmail;
	}

	public String getUnidExttelefono() {
		return this.unidExttelefono;
	}

	public void setUnidExttelefono(String unidExttelefono) {
		this.unidExttelefono = unidExttelefono;
	}

	public Date getUnidFechacambio() {
		return this.unidFechacambio;
	}

	public void setUnidFechacambio(Date unidFechacambio) {
		this.unidFechacambio = unidFechacambio;
	}

	public String getUnidNivel() {
		return this.unidNivel;
	}

	public void setUnidNivel(String unidNivel) {
		this.unidNivel = unidNivel;
	}

	public String getUnidNombre() {
		return this.unidNombre;
	}

	public void setUnidNombre(String unidNombre) {
		this.unidNombre = unidNombre;
	}

	public String getUnidRegional() {
		return this.unidRegional;
	}

	public void setUnidRegional(String unidRegional) {
		this.unidRegional = unidRegional;
	}

	public String getUnidRegistradopor() {
		return this.unidRegistradopor;
	}

	public void setUnidRegistradopor(String unidRegistradopor) {
		this.unidRegistradopor = unidRegistradopor;
	}

	public String getUnidTelefono() {
		return this.unidTelefono;
	}

	public void setUnidTelefono(String unidTelefono) {
		this.unidTelefono = unidTelefono;
	}

	public String getUnidUbicacion() {
		return this.unidUbicacion;
	}

	public void setUnidUbicacion(String unidUbicacion) {
		this.unidUbicacion = unidUbicacion;
	}

}