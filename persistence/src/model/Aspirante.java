package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ASPIRANTE database table.
 * 
 */
@Entity
@NamedQuery(name="Aspirante.findAll", query="SELECT a FROM Aspirante a")
public class Aspirante implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ASPI_ID")
	private BigDecimal aspiId;

	@Column(name="ASPI_BARRIORESIDENCIA")
	private String aspiBarrioresidencia;

	@Column(name="ASPI_CATEGORIAVISA")
	private String aspiCategoriavisa;

	@Column(name="ASPI_CLASELIBRETAMILITAR")
	private String aspiClaselibretamilitar;

	@Column(name="ASPI_DIRECCIONESTUDIO")
	private String aspiDireccionestudio;

	@Column(name="ASPI_DIRECCIONRESIDECONTACTO")
	private String aspiDireccionresidecontacto;

	@Column(name="ASPI_DIRECCIONRESIDENCIA")
	private String aspiDireccionresidencia;

	@Column(name="ASPI_DIRRESIDENCIASECUNDARIA")
	private String aspiDirresidenciasecundaria;

	@Column(name="ASPI_DISTRITOMILITAR")
	private String aspiDistritomilitar;

	@Column(name="ASPI_DPTONACIMIENTO")
	private String aspiDptonacimiento;

	@Column(name="ASPI_DPTORESIDENCIA")
	private String aspiDptoresidencia;

	@Column(name="ASPI_DPTORESIDENCIASECUNDARIA")
	private String aspiDptoresidenciasecundaria;

	@Column(name="ASPI_EMAIL")
	private String aspiEmail;

	@Column(name="ASPI_EMAILCONTACTO")
	private String aspiEmailcontacto;

	@Column(name="ASPI_EPS")
	private String aspiEps;

	@Column(name="ASPI_ESTADO")
	private BigDecimal aspiEstado;

	@Column(name="ASPI_ESTADOVISA")
	private String aspiEstadovisa;

	@Column(name="ASPI_ESTATURA")
	private BigDecimal aspiEstatura;

	@Column(name="ASPI_ETNIA")
	private String aspiEtnia;

	@Temporal(TemporalType.DATE)
	@Column(name="ASPI_FECHACAMBIO")
	private Date aspiFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="ASPI_FECHAEXPEDICION")
	private Date aspiFechaexpedicion;

	@Temporal(TemporalType.DATE)
	@Column(name="ASPI_FECHANACIMIENTO")
	private Date aspiFechanacimiento;

	@Temporal(TemporalType.DATE)
	@Column(name="ASPI_FECHAVENCIMIENTOVISA")
	private Date aspiFechavencimientovisa;

	@Column(name="ASPI_LIBRETAMILITAR")
	private String aspiLibretamilitar;

	@Column(name="ASPI_LUGAREXPEDICION")
	private String aspiLugarexpedicion;

	@Column(name="ASPI_MPIONACIMIENTO")
	private String aspiMpionacimiento;

	@Column(name="ASPI_MPIORESIDENCIA")
	private String aspiMpioresidencia;

	@Column(name="ASPI_MPIORESIDENCIASECUNDARIA")
	private String aspiMpioresidenciasecundaria;

	@Column(name="ASPI_NACIONALIDAD")
	private String aspiNacionalidad;

	@Column(name="ASPI_NIVELACADEMICO")
	private String aspiNivelacademico;

	@Column(name="ASPI_NOMBRECONTACTO")
	private String aspiNombrecontacto;

	@Column(name="ASPI_NUMERODOCUMENTO")
	private String aspiNumerodocumento;

	@Column(name="ASPI_NUMEROVISA")
	private String aspiNumerovisa;

	@Column(name="ASPI_OTRAETNIA")
	private String aspiOtraetnia;

	@Column(name="ASPI_PAISNACIMIENTO")
	private String aspiPaisnacimiento;

	@Column(name="ASPI_PAISRESIDENCIA")
	private String aspiPaisresidencia;

	@Column(name="ASPI_PASAPORTE")
	private String aspiPasaporte;

	@Column(name="ASPI_PRIMERAPELLIDO")
	private String aspiPrimerapellido;

	@Column(name="ASPI_PRIMERNOMBRE")
	private String aspiPrimernombre;

	@Column(name="ASPI_REGISTRADOPOR")
	private String aspiRegistradopor;

	@Column(name="ASPI_SEGUNDOAPELLIDO")
	private String aspiSegundoapellido;

	@Column(name="ASPI_SEGUNDONOMBRE")
	private String aspiSegundonombre;

	@Column(name="ASPI_SEXO")
	private String aspiSexo;

	@Column(name="ASPI_TELEFONOCELULAR")
	private String aspiTelefonocelular;

	@Column(name="ASPI_TELEFONOCELULARCONTACTO")
	private String aspiTelefonocelularcontacto;

	@Column(name="ASPI_TELEFONOESTUDIO")
	private String aspiTelefonoestudio;

	@Column(name="ASPI_TELEFONORESIDECONTACTO")
	private String aspiTelefonoresidecontacto;

	@Column(name="ASPI_TELEFONORESIDENCIA")
	private String aspiTelefonoresidencia;

	@Column(name="ASPI_TIPODOCUMENTO")
	private BigDecimal aspiTipodocumento;

	@Column(name="ASPI_TIPOSANGUINEO")
	private String aspiTiposanguineo;

	@Column(name="ASPI_VEREDARESIDENCIA")
	private String aspiVeredaresidencia;

	@Column(name="ASPI_VIVEZONA")
	private String aspiVivezona;

	@Column(name="BARG_IDUBICACION")
	private BigDecimal bargIdubicacion;

	@Column(name="CIRC_ID")
	private BigDecimal circId;

	@Column(name="ENSA_ID")
	private BigDecimal ensaId;

	@Column(name="ESCG_ID")
	private BigDecimal escgId;

	@Column(name="MEDI_IDCONOCEINSTITUCION")
	private BigDecimal mediIdconoceinstitucion;

	@Column(name="NIED_ID")
	private BigDecimal niedId;

	@Column(name="SECG_IDUBICACION")
	private BigDecimal secgIdubicacion;

	@Column(name="UNID_IDDISTRITO")
	private BigDecimal unidIddistrito;

	public Aspirante() {
	}

	public String getAspiBarrioresidencia() {
		return this.aspiBarrioresidencia;
	}

	public void setAspiBarrioresidencia(String aspiBarrioresidencia) {
		this.aspiBarrioresidencia = aspiBarrioresidencia;
	}

	public String getAspiCategoriavisa() {
		return this.aspiCategoriavisa;
	}

	public void setAspiCategoriavisa(String aspiCategoriavisa) {
		this.aspiCategoriavisa = aspiCategoriavisa;
	}

	public String getAspiClaselibretamilitar() {
		return this.aspiClaselibretamilitar;
	}

	public void setAspiClaselibretamilitar(String aspiClaselibretamilitar) {
		this.aspiClaselibretamilitar = aspiClaselibretamilitar;
	}

	public String getAspiDireccionestudio() {
		return this.aspiDireccionestudio;
	}

	public void setAspiDireccionestudio(String aspiDireccionestudio) {
		this.aspiDireccionestudio = aspiDireccionestudio;
	}

	public String getAspiDireccionresidecontacto() {
		return this.aspiDireccionresidecontacto;
	}

	public void setAspiDireccionresidecontacto(String aspiDireccionresidecontacto) {
		this.aspiDireccionresidecontacto = aspiDireccionresidecontacto;
	}

	public String getAspiDireccionresidencia() {
		return this.aspiDireccionresidencia;
	}

	public void setAspiDireccionresidencia(String aspiDireccionresidencia) {
		this.aspiDireccionresidencia = aspiDireccionresidencia;
	}

	public String getAspiDirresidenciasecundaria() {
		return this.aspiDirresidenciasecundaria;
	}

	public void setAspiDirresidenciasecundaria(String aspiDirresidenciasecundaria) {
		this.aspiDirresidenciasecundaria = aspiDirresidenciasecundaria;
	}

	public String getAspiDistritomilitar() {
		return this.aspiDistritomilitar;
	}

	public void setAspiDistritomilitar(String aspiDistritomilitar) {
		this.aspiDistritomilitar = aspiDistritomilitar;
	}

	public String getAspiDptonacimiento() {
		return this.aspiDptonacimiento;
	}

	public void setAspiDptonacimiento(String aspiDptonacimiento) {
		this.aspiDptonacimiento = aspiDptonacimiento;
	}

	public String getAspiDptoresidencia() {
		return this.aspiDptoresidencia;
	}

	public void setAspiDptoresidencia(String aspiDptoresidencia) {
		this.aspiDptoresidencia = aspiDptoresidencia;
	}

	public String getAspiDptoresidenciasecundaria() {
		return this.aspiDptoresidenciasecundaria;
	}

	public void setAspiDptoresidenciasecundaria(String aspiDptoresidenciasecundaria) {
		this.aspiDptoresidenciasecundaria = aspiDptoresidenciasecundaria;
	}

	public String getAspiEmail() {
		return this.aspiEmail;
	}

	public void setAspiEmail(String aspiEmail) {
		this.aspiEmail = aspiEmail;
	}

	public String getAspiEmailcontacto() {
		return this.aspiEmailcontacto;
	}

	public void setAspiEmailcontacto(String aspiEmailcontacto) {
		this.aspiEmailcontacto = aspiEmailcontacto;
	}

	public String getAspiEps() {
		return this.aspiEps;
	}

	public void setAspiEps(String aspiEps) {
		this.aspiEps = aspiEps;
	}

	public BigDecimal getAspiEstado() {
		return this.aspiEstado;
	}

	public void setAspiEstado(BigDecimal aspiEstado) {
		this.aspiEstado = aspiEstado;
	}

	public String getAspiEstadovisa() {
		return this.aspiEstadovisa;
	}

	public void setAspiEstadovisa(String aspiEstadovisa) {
		this.aspiEstadovisa = aspiEstadovisa;
	}

	public BigDecimal getAspiEstatura() {
		return this.aspiEstatura;
	}

	public void setAspiEstatura(BigDecimal aspiEstatura) {
		this.aspiEstatura = aspiEstatura;
	}

	public String getAspiEtnia() {
		return this.aspiEtnia;
	}

	public void setAspiEtnia(String aspiEtnia) {
		this.aspiEtnia = aspiEtnia;
	}

	public Date getAspiFechacambio() {
		return this.aspiFechacambio;
	}

	public void setAspiFechacambio(Date aspiFechacambio) {
		this.aspiFechacambio = aspiFechacambio;
	}

	public Date getAspiFechaexpedicion() {
		return this.aspiFechaexpedicion;
	}

	public void setAspiFechaexpedicion(Date aspiFechaexpedicion) {
		this.aspiFechaexpedicion = aspiFechaexpedicion;
	}

	public Date getAspiFechanacimiento() {
		return this.aspiFechanacimiento;
	}

	public void setAspiFechanacimiento(Date aspiFechanacimiento) {
		this.aspiFechanacimiento = aspiFechanacimiento;
	}

	public Date getAspiFechavencimientovisa() {
		return this.aspiFechavencimientovisa;
	}

	public void setAspiFechavencimientovisa(Date aspiFechavencimientovisa) {
		this.aspiFechavencimientovisa = aspiFechavencimientovisa;
	}

	public BigDecimal getAspiId() {
		return this.aspiId;
	}

	public void setAspiId(BigDecimal aspiId) {
		this.aspiId = aspiId;
	}

	public String getAspiLibretamilitar() {
		return this.aspiLibretamilitar;
	}

	public void setAspiLibretamilitar(String aspiLibretamilitar) {
		this.aspiLibretamilitar = aspiLibretamilitar;
	}

	public String getAspiLugarexpedicion() {
		return this.aspiLugarexpedicion;
	}

	public void setAspiLugarexpedicion(String aspiLugarexpedicion) {
		this.aspiLugarexpedicion = aspiLugarexpedicion;
	}

	public String getAspiMpionacimiento() {
		return this.aspiMpionacimiento;
	}

	public void setAspiMpionacimiento(String aspiMpionacimiento) {
		this.aspiMpionacimiento = aspiMpionacimiento;
	}

	public String getAspiMpioresidencia() {
		return this.aspiMpioresidencia;
	}

	public void setAspiMpioresidencia(String aspiMpioresidencia) {
		this.aspiMpioresidencia = aspiMpioresidencia;
	}

	public String getAspiMpioresidenciasecundaria() {
		return this.aspiMpioresidenciasecundaria;
	}

	public void setAspiMpioresidenciasecundaria(String aspiMpioresidenciasecundaria) {
		this.aspiMpioresidenciasecundaria = aspiMpioresidenciasecundaria;
	}

	public String getAspiNacionalidad() {
		return this.aspiNacionalidad;
	}

	public void setAspiNacionalidad(String aspiNacionalidad) {
		this.aspiNacionalidad = aspiNacionalidad;
	}

	public String getAspiNivelacademico() {
		return this.aspiNivelacademico;
	}

	public void setAspiNivelacademico(String aspiNivelacademico) {
		this.aspiNivelacademico = aspiNivelacademico;
	}

	public String getAspiNombrecontacto() {
		return this.aspiNombrecontacto;
	}

	public void setAspiNombrecontacto(String aspiNombrecontacto) {
		this.aspiNombrecontacto = aspiNombrecontacto;
	}

	public String getAspiNumerodocumento() {
		return this.aspiNumerodocumento;
	}

	public void setAspiNumerodocumento(String aspiNumerodocumento) {
		this.aspiNumerodocumento = aspiNumerodocumento;
	}

	public String getAspiNumerovisa() {
		return this.aspiNumerovisa;
	}

	public void setAspiNumerovisa(String aspiNumerovisa) {
		this.aspiNumerovisa = aspiNumerovisa;
	}

	public String getAspiOtraetnia() {
		return this.aspiOtraetnia;
	}

	public void setAspiOtraetnia(String aspiOtraetnia) {
		this.aspiOtraetnia = aspiOtraetnia;
	}

	public String getAspiPaisnacimiento() {
		return this.aspiPaisnacimiento;
	}

	public void setAspiPaisnacimiento(String aspiPaisnacimiento) {
		this.aspiPaisnacimiento = aspiPaisnacimiento;
	}

	public String getAspiPaisresidencia() {
		return this.aspiPaisresidencia;
	}

	public void setAspiPaisresidencia(String aspiPaisresidencia) {
		this.aspiPaisresidencia = aspiPaisresidencia;
	}

	public String getAspiPasaporte() {
		return this.aspiPasaporte;
	}

	public void setAspiPasaporte(String aspiPasaporte) {
		this.aspiPasaporte = aspiPasaporte;
	}

	public String getAspiPrimerapellido() {
		return this.aspiPrimerapellido;
	}

	public void setAspiPrimerapellido(String aspiPrimerapellido) {
		this.aspiPrimerapellido = aspiPrimerapellido;
	}

	public String getAspiPrimernombre() {
		return this.aspiPrimernombre;
	}

	public void setAspiPrimernombre(String aspiPrimernombre) {
		this.aspiPrimernombre = aspiPrimernombre;
	}

	public String getAspiRegistradopor() {
		return this.aspiRegistradopor;
	}

	public void setAspiRegistradopor(String aspiRegistradopor) {
		this.aspiRegistradopor = aspiRegistradopor;
	}

	public String getAspiSegundoapellido() {
		return this.aspiSegundoapellido;
	}

	public void setAspiSegundoapellido(String aspiSegundoapellido) {
		this.aspiSegundoapellido = aspiSegundoapellido;
	}

	public String getAspiSegundonombre() {
		return this.aspiSegundonombre;
	}

	public void setAspiSegundonombre(String aspiSegundonombre) {
		this.aspiSegundonombre = aspiSegundonombre;
	}

	public String getAspiSexo() {
		return this.aspiSexo;
	}

	public void setAspiSexo(String aspiSexo) {
		this.aspiSexo = aspiSexo;
	}

	public String getAspiTelefonocelular() {
		return this.aspiTelefonocelular;
	}

	public void setAspiTelefonocelular(String aspiTelefonocelular) {
		this.aspiTelefonocelular = aspiTelefonocelular;
	}

	public String getAspiTelefonocelularcontacto() {
		return this.aspiTelefonocelularcontacto;
	}

	public void setAspiTelefonocelularcontacto(String aspiTelefonocelularcontacto) {
		this.aspiTelefonocelularcontacto = aspiTelefonocelularcontacto;
	}

	public String getAspiTelefonoestudio() {
		return this.aspiTelefonoestudio;
	}

	public void setAspiTelefonoestudio(String aspiTelefonoestudio) {
		this.aspiTelefonoestudio = aspiTelefonoestudio;
	}

	public String getAspiTelefonoresidecontacto() {
		return this.aspiTelefonoresidecontacto;
	}

	public void setAspiTelefonoresidecontacto(String aspiTelefonoresidecontacto) {
		this.aspiTelefonoresidecontacto = aspiTelefonoresidecontacto;
	}

	public String getAspiTelefonoresidencia() {
		return this.aspiTelefonoresidencia;
	}

	public void setAspiTelefonoresidencia(String aspiTelefonoresidencia) {
		this.aspiTelefonoresidencia = aspiTelefonoresidencia;
	}

	public BigDecimal getAspiTipodocumento() {
		return this.aspiTipodocumento;
	}

	public void setAspiTipodocumento(BigDecimal aspiTipodocumento) {
		this.aspiTipodocumento = aspiTipodocumento;
	}

	public String getAspiTiposanguineo() {
		return this.aspiTiposanguineo;
	}

	public void setAspiTiposanguineo(String aspiTiposanguineo) {
		this.aspiTiposanguineo = aspiTiposanguineo;
	}

	public String getAspiVeredaresidencia() {
		return this.aspiVeredaresidencia;
	}

	public void setAspiVeredaresidencia(String aspiVeredaresidencia) {
		this.aspiVeredaresidencia = aspiVeredaresidencia;
	}

	public String getAspiVivezona() {
		return this.aspiVivezona;
	}

	public void setAspiVivezona(String aspiVivezona) {
		this.aspiVivezona = aspiVivezona;
	}

	public BigDecimal getBargIdubicacion() {
		return this.bargIdubicacion;
	}

	public void setBargIdubicacion(BigDecimal bargIdubicacion) {
		this.bargIdubicacion = bargIdubicacion;
	}

	public BigDecimal getCircId() {
		return this.circId;
	}

	public void setCircId(BigDecimal circId) {
		this.circId = circId;
	}

	public BigDecimal getEnsaId() {
		return this.ensaId;
	}

	public void setEnsaId(BigDecimal ensaId) {
		this.ensaId = ensaId;
	}

	public BigDecimal getEscgId() {
		return this.escgId;
	}

	public void setEscgId(BigDecimal escgId) {
		this.escgId = escgId;
	}

	public BigDecimal getMediIdconoceinstitucion() {
		return this.mediIdconoceinstitucion;
	}

	public void setMediIdconoceinstitucion(BigDecimal mediIdconoceinstitucion) {
		this.mediIdconoceinstitucion = mediIdconoceinstitucion;
	}

	public BigDecimal getNiedId() {
		return this.niedId;
	}

	public void setNiedId(BigDecimal niedId) {
		this.niedId = niedId;
	}

	public BigDecimal getSecgIdubicacion() {
		return this.secgIdubicacion;
	}

	public void setSecgIdubicacion(BigDecimal secgIdubicacion) {
		this.secgIdubicacion = secgIdubicacion;
	}

	public BigDecimal getUnidIddistrito() {
		return this.unidIddistrito;
	}

	public void setUnidIddistrito(BigDecimal unidIddistrito) {
		this.unidIddistrito = unidIddistrito;
	}

}