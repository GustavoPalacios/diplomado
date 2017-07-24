package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GRUPO database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Grupo.findAll", query="SELECT g FROM Grupo g"),
@NamedQuery(name="Grupo.findEstado", query="SELECT g FROM Grupo g where g.grupActivo = :grupActivo"),
@NamedQuery(name="Grupo.findId", query="SELECT g FROM Grupo g where g.grupId = :grupId"),
@NamedQuery(name="Grupo.findName", query="SELECT g FROM Grupo g where g.grupNombre = :grupNombre"),
@NamedQuery(name="Grupo.findMateria", query="SELECT g FROM Grupo g where g.mateCodigomateria = :mateCodigomateria"),
@NamedQuery(name="Grupo.findUnidad", query="SELECT g FROM Grupo g where g.unidIdregional = :unidIdregional")
}) 
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GRUP_ID")
	private long grupId;

	@Column(name="GRUP_ACTIVO")
	private String grupActivo;

	@Column(name="GRUP_CAPACIDAD")
	private BigDecimal grupCapacidad;

	@Column(name="GRUP_COPIADO")
	private String grupCopiado;

	@Column(name="GRUP_CREADOPRE")
	private String grupCreadopre;

	@Column(name="GRUP_CUPOMINIMO")
	private BigDecimal grupCupominimo;

	@Column(name="GRUP_CUPOS")
	private BigDecimal grupCupos;

	@Temporal(TemporalType.DATE)
	@Column(name="GRUP_FECHACAMBIO")
	private Date grupFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="GRUP_FECHAFINAL")
	private Date grupFechafinal;

	@Temporal(TemporalType.DATE)
	@Column(name="GRUP_FECHAINICIAL")
	private Date grupFechainicial;

	@Column(name="GRUP_HISTORICO")
	private String grupHistorico;

	@Column(name="GRUP_HORARIOXDIA")
	private String grupHorarioxdia;

	@Column(name="GRUP_IDPADRE")
	private BigDecimal grupIdpadre;

	@Column(name="GRUP_NOMBRE")
	private String grupNombre;

	@Column(name="GRUP_PEUNDESTINO")
	private BigDecimal grupPeundestino;

	@Column(name="GRUP_REGISTRADOPOR")
	private String grupRegistradopor;

	@Column(name="MATE_CODIGOMATERIA")
	private String mateCodigomateria;

	@Column(name="PEUN_ID")
	private BigDecimal peunId;

	@Column(name="SIEV_ID")
	private BigDecimal sievId;

	@Column(name="SUBM_ID")
	private BigDecimal submId;

	@Column(name="TIGR_ID")
	private BigDecimal tigrId;

	@Column(name="UNID_IDREGIONAL")
	private BigDecimal unidIdregional;

	public Grupo() {
	}

	public long getGrupId() {
		return this.grupId;
	}

	public void setGrupId(long grupId) {
		this.grupId = grupId;
	}

	public String getGrupActivo() {
		return this.grupActivo;
	}

	public void setGrupActivo(String grupActivo) {
		this.grupActivo = grupActivo;
	}

	public BigDecimal getGrupCapacidad() {
		return this.grupCapacidad;
	}

	public void setGrupCapacidad(BigDecimal grupCapacidad) {
		this.grupCapacidad = grupCapacidad;
	}

	public String getGrupCopiado() {
		return this.grupCopiado;
	}

	public void setGrupCopiado(String grupCopiado) {
		this.grupCopiado = grupCopiado;
	}

	public String getGrupCreadopre() {
		return this.grupCreadopre;
	}

	public void setGrupCreadopre(String grupCreadopre) {
		this.grupCreadopre = grupCreadopre;
	}

	public BigDecimal getGrupCupominimo() {
		return this.grupCupominimo;
	}

	public void setGrupCupominimo(BigDecimal grupCupominimo) {
		this.grupCupominimo = grupCupominimo;
	}

	public BigDecimal getGrupCupos() {
		return this.grupCupos;
	}

	public void setGrupCupos(BigDecimal grupCupos) {
		this.grupCupos = grupCupos;
	}

	public Date getGrupFechacambio() {
		return this.grupFechacambio;
	}

	public void setGrupFechacambio(Date grupFechacambio) {
		this.grupFechacambio = grupFechacambio;
	}

	public Date getGrupFechafinal() {
		return this.grupFechafinal;
	}

	public void setGrupFechafinal(Date grupFechafinal) {
		this.grupFechafinal = grupFechafinal;
	}

	public Date getGrupFechainicial() {
		return this.grupFechainicial;
	}

	public void setGrupFechainicial(Date grupFechainicial) {
		this.grupFechainicial = grupFechainicial;
	}

	public String getGrupHistorico() {
		return this.grupHistorico;
	}

	public void setGrupHistorico(String grupHistorico) {
		this.grupHistorico = grupHistorico;
	}

	public String getGrupHorarioxdia() {
		return this.grupHorarioxdia;
	}

	public void setGrupHorarioxdia(String grupHorarioxdia) {
		this.grupHorarioxdia = grupHorarioxdia;
	}

	public BigDecimal getGrupIdpadre() {
		return this.grupIdpadre;
	}

	public void setGrupIdpadre(BigDecimal grupIdpadre) {
		this.grupIdpadre = grupIdpadre;
	}

	public String getGrupNombre() {
		return this.grupNombre;
	}

	public void setGrupNombre(String grupNombre) {
		this.grupNombre = grupNombre;
	}

	public BigDecimal getGrupPeundestino() {
		return this.grupPeundestino;
	}

	public void setGrupPeundestino(BigDecimal grupPeundestino) {
		this.grupPeundestino = grupPeundestino;
	}

	public String getGrupRegistradopor() {
		return this.grupRegistradopor;
	}

	public void setGrupRegistradopor(String grupRegistradopor) {
		this.grupRegistradopor = grupRegistradopor;
	}

	public String getMateCodigomateria() {
		return this.mateCodigomateria;
	}

	public void setMateCodigomateria(String mateCodigomateria) {
		this.mateCodigomateria = mateCodigomateria;
	}

	public BigDecimal getPeunId() {
		return this.peunId;
	}

	public void setPeunId(BigDecimal peunId) {
		this.peunId = peunId;
	}

	public BigDecimal getSievId() {
		return this.sievId;
	}

	public void setSievId(BigDecimal sievId) {
		this.sievId = sievId;
	}

	public BigDecimal getSubmId() {
		return this.submId;
	}

	public void setSubmId(BigDecimal submId) {
		this.submId = submId;
	}

	public BigDecimal getTigrId() {
		return this.tigrId;
	}

	public void setTigrId(BigDecimal tigrId) {
		this.tigrId = tigrId;
	}

	public BigDecimal getUnidIdregional() {
		return this.unidIdregional;
	}

	public void setUnidIdregional(BigDecimal unidIdregional) {
		this.unidIdregional = unidIdregional;
	}

}