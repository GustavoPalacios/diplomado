package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MATERIA database table.
 * 
 */
@Entity

@NamedQueries({
	@NamedQuery(name="Materia.findAll", query="SELECT m FROM Materia m"),
@NamedQuery(name="Materia.findId", query="SELECT m FROM Materia m where m.mateCodigomateria = :mateCodigomateria"),
@NamedQuery(name="Materia.findName", query="SELECT m FROM Materia m where m.mateNombre = :mateNombre")
}) 
public class Materia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MATE_CODIGOMATERIA")
	private String mateCodigomateria;

	@Column(name="ARMA_ID")
	private BigDecimal armaId;

	@Column(name="MATE_BLOQUEHORASPRACTICAS")
	private BigDecimal mateBloquehoraspracticas;

	@Column(name="MATE_BLOQUEHORASTEORICAS")
	private BigDecimal mateBloquehorasteoricas;

	@Column(name="MATE_CAPACIDAD")
	private BigDecimal mateCapacidad;

	@Column(name="MATE_CODIGOORIGINAL")
	private String mateCodigooriginal;

	@Column(name="MATE_CODIGOSNIES")
	private String mateCodigosnies;

	@Column(name="MATE_CUENTAPROMEDIO")
	private String mateCuentapromedio;

	@Column(name="MATE_DURACION")
	private BigDecimal mateDuracion;

	@Column(name="MATE_ESED")
	private String mateEsed;

	@Column(name="MATE_ESEXTENSION")
	private String mateEsextension;

	@Column(name="MATE_ESEXTRACREDITO")
	private String mateEsextracredito;

	@Column(name="MATE_ESOPCIONAL")
	private String mateEsopcional;

	@Column(name="MATE_ESPRACTICA")
	private String mateEspractica;

	@Column(name="MATE_ESPROPEDEUTICA")
	private String mateEspropedeutica;

	@Temporal(TemporalType.DATE)
	@Column(name="MATE_FECHACAMBIO")
	private Date mateFechacambio;

	@Column(name="MATE_HABILITABLE")
	private String mateHabilitable;

	@Column(name="MATE_HOMOLOGABLE")
	private String mateHomologable;

	@Column(name="MATE_HORASASESORIA")
	private BigDecimal mateHorasasesoria;

	@Column(name="MATE_HORASINDEPENDIENTES")
	private BigDecimal mateHorasindependientes;

	@Column(name="MATE_HORASPRACTICAS")
	private BigDecimal mateHoraspracticas;

	@Column(name="MATE_HORASTEORICAS")
	private BigDecimal mateHorasteoricas;

	@Column(name="MATE_HORASTEORICOPRACTICAS")
	private BigDecimal mateHorasteoricopracticas;

	@Column(name="MATE_NOMBRE")
	private String mateNombre;

	@Column(name="MATE_PONDERACIONACADEMICA")
	private BigDecimal matePonderacionacademica;

	@Column(name="MATE_PROYECTODEGRADO")
	private String mateProyectodegrado;

	@Column(name="MATE_REGISTRADOPOR")
	private String mateRegistradopor;

	@Column(name="MATE_TIPO")
	private String mateTipo;

	@Column(name="MATE_VALIDABLE")
	private String mateValidable;

	@Column(name="NATU_ID")
	private BigDecimal natuId;

	@Column(name="TICA_ID")
	private BigDecimal ticaId;

	@Column(name="TIPA_ID")
	private BigDecimal tipaId;

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	public Materia() {
	}

	public String getMateCodigomateria() {
		return this.mateCodigomateria;
	}

	public void setMateCodigomateria(String mateCodigomateria) {
		this.mateCodigomateria = mateCodigomateria;
	}

	public BigDecimal getArmaId() {
		return this.armaId;
	}

	public void setArmaId(BigDecimal armaId) {
		this.armaId = armaId;
	}

	public BigDecimal getMateBloquehoraspracticas() {
		return this.mateBloquehoraspracticas;
	}

	public void setMateBloquehoraspracticas(BigDecimal mateBloquehoraspracticas) {
		this.mateBloquehoraspracticas = mateBloquehoraspracticas;
	}

	public BigDecimal getMateBloquehorasteoricas() {
		return this.mateBloquehorasteoricas;
	}

	public void setMateBloquehorasteoricas(BigDecimal mateBloquehorasteoricas) {
		this.mateBloquehorasteoricas = mateBloquehorasteoricas;
	}

	public BigDecimal getMateCapacidad() {
		return this.mateCapacidad;
	}

	public void setMateCapacidad(BigDecimal mateCapacidad) {
		this.mateCapacidad = mateCapacidad;
	}

	public String getMateCodigooriginal() {
		return this.mateCodigooriginal;
	}

	public void setMateCodigooriginal(String mateCodigooriginal) {
		this.mateCodigooriginal = mateCodigooriginal;
	}

	public String getMateCodigosnies() {
		return this.mateCodigosnies;
	}

	public void setMateCodigosnies(String mateCodigosnies) {
		this.mateCodigosnies = mateCodigosnies;
	}

	public String getMateCuentapromedio() {
		return this.mateCuentapromedio;
	}

	public void setMateCuentapromedio(String mateCuentapromedio) {
		this.mateCuentapromedio = mateCuentapromedio;
	}

	public BigDecimal getMateDuracion() {
		return this.mateDuracion;
	}

	public void setMateDuracion(BigDecimal mateDuracion) {
		this.mateDuracion = mateDuracion;
	}

	public String getMateEsed() {
		return this.mateEsed;
	}

	public void setMateEsed(String mateEsed) {
		this.mateEsed = mateEsed;
	}

	public String getMateEsextension() {
		return this.mateEsextension;
	}

	public void setMateEsextension(String mateEsextension) {
		this.mateEsextension = mateEsextension;
	}

	public String getMateEsextracredito() {
		return this.mateEsextracredito;
	}

	public void setMateEsextracredito(String mateEsextracredito) {
		this.mateEsextracredito = mateEsextracredito;
	}

	public String getMateEsopcional() {
		return this.mateEsopcional;
	}

	public void setMateEsopcional(String mateEsopcional) {
		this.mateEsopcional = mateEsopcional;
	}

	public String getMateEspractica() {
		return this.mateEspractica;
	}

	public void setMateEspractica(String mateEspractica) {
		this.mateEspractica = mateEspractica;
	}

	public String getMateEspropedeutica() {
		return this.mateEspropedeutica;
	}

	public void setMateEspropedeutica(String mateEspropedeutica) {
		this.mateEspropedeutica = mateEspropedeutica;
	}

	public Date getMateFechacambio() {
		return this.mateFechacambio;
	}

	public void setMateFechacambio(Date mateFechacambio) {
		this.mateFechacambio = mateFechacambio;
	}

	public String getMateHabilitable() {
		return this.mateHabilitable;
	}

	public void setMateHabilitable(String mateHabilitable) {
		this.mateHabilitable = mateHabilitable;
	}

	public String getMateHomologable() {
		return this.mateHomologable;
	}

	public void setMateHomologable(String mateHomologable) {
		this.mateHomologable = mateHomologable;
	}

	public BigDecimal getMateHorasasesoria() {
		return this.mateHorasasesoria;
	}

	public void setMateHorasasesoria(BigDecimal mateHorasasesoria) {
		this.mateHorasasesoria = mateHorasasesoria;
	}

	public BigDecimal getMateHorasindependientes() {
		return this.mateHorasindependientes;
	}

	public void setMateHorasindependientes(BigDecimal mateHorasindependientes) {
		this.mateHorasindependientes = mateHorasindependientes;
	}

	public BigDecimal getMateHoraspracticas() {
		return this.mateHoraspracticas;
	}

	public void setMateHoraspracticas(BigDecimal mateHoraspracticas) {
		this.mateHoraspracticas = mateHoraspracticas;
	}

	public BigDecimal getMateHorasteoricas() {
		return this.mateHorasteoricas;
	}

	public void setMateHorasteoricas(BigDecimal mateHorasteoricas) {
		this.mateHorasteoricas = mateHorasteoricas;
	}

	public BigDecimal getMateHorasteoricopracticas() {
		return this.mateHorasteoricopracticas;
	}

	public void setMateHorasteoricopracticas(BigDecimal mateHorasteoricopracticas) {
		this.mateHorasteoricopracticas = mateHorasteoricopracticas;
	}

	public String getMateNombre() {
		return this.mateNombre;
	}

	public void setMateNombre(String mateNombre) {
		this.mateNombre = mateNombre;
	}

	public BigDecimal getMatePonderacionacademica() {
		return this.matePonderacionacademica;
	}

	public void setMatePonderacionacademica(BigDecimal matePonderacionacademica) {
		this.matePonderacionacademica = matePonderacionacademica;
	}

	public String getMateProyectodegrado() {
		return this.mateProyectodegrado;
	}

	public void setMateProyectodegrado(String mateProyectodegrado) {
		this.mateProyectodegrado = mateProyectodegrado;
	}

	public String getMateRegistradopor() {
		return this.mateRegistradopor;
	}

	public void setMateRegistradopor(String mateRegistradopor) {
		this.mateRegistradopor = mateRegistradopor;
	}

	public String getMateTipo() {
		return this.mateTipo;
	}

	public void setMateTipo(String mateTipo) {
		this.mateTipo = mateTipo;
	}

	public String getMateValidable() {
		return this.mateValidable;
	}

	public void setMateValidable(String mateValidable) {
		this.mateValidable = mateValidable;
	}

	public BigDecimal getNatuId() {
		return this.natuId;
	}

	public void setNatuId(BigDecimal natuId) {
		this.natuId = natuId;
	}

	public BigDecimal getTicaId() {
		return this.ticaId;
	}

	public void setTicaId(BigDecimal ticaId) {
		this.ticaId = ticaId;
	}

	public BigDecimal getTipaId() {
		return this.tipaId;
	}

	public void setTipaId(BigDecimal tipaId) {
		this.tipaId = tipaId;
	}

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

}