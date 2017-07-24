package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the NORMACONCEPTO database table.
 * 
 */
@Entity
@NamedQuery(name="Normaconcepto.findAll", query="SELECT n FROM Normaconcepto n")
public class Normaconcepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NOCO_ID")
	private long nocoId;

	@Column(name="CATE_ID")
	private BigDecimal cateId;

	@Column(name="COMA_ID")
	private BigDecimal comaId;

	@Column(name="FOCO_ID")
	private BigDecimal focoId;

	@Column(name="FRAN_ID")
	private BigDecimal franId;

	@Column(name="MELI_ID")
	private BigDecimal meliId;

	@Column(name="NOCO_BASELIQUIDACION")
	private String nocoBaseliquidacion;

	@Column(name="NOCO_COBROALTERNATIVO")
	private String nocoCobroalternativo;

	@Temporal(TemporalType.DATE)
	@Column(name="NOCO_FECHACAMBIO")
	private Date nocoFechacambio;

	@Column(name="NOCO_ORDEN")
	private BigDecimal nocoOrden;

	@Column(name="NOCO_PERMANENTE")
	private BigDecimal nocoPermanente;

	@Column(name="NOCO_PORCENTAJE")
	private BigDecimal nocoPorcentaje;

	@Column(name="NOCO_REGISTRADOPOR")
	private String nocoRegistradopor;

	@Column(name="NOCO_TIPOLIQUIDACION")
	private String nocoTipoliquidacion;

	@Column(name="NOCO_VALORFIJO")
	private BigDecimal nocoValorfijo;

	@Column(name="NOCO_VIGENTE")
	private String nocoVigente;

	@Column(name="NORG_ID")
	private BigDecimal norgId;

	@Column(name="PRAC_ID")
	private BigDecimal pracId;

	@Column(name="UNPR_ID")
	private BigDecimal unprId;

	public Normaconcepto() {
	}

	public long getNocoId() {
		return this.nocoId;
	}

	public void setNocoId(long nocoId) {
		this.nocoId = nocoId;
	}

	public BigDecimal getCateId() {
		return this.cateId;
	}

	public void setCateId(BigDecimal cateId) {
		this.cateId = cateId;
	}

	public BigDecimal getComaId() {
		return this.comaId;
	}

	public void setComaId(BigDecimal comaId) {
		this.comaId = comaId;
	}

	public BigDecimal getFocoId() {
		return this.focoId;
	}

	public void setFocoId(BigDecimal focoId) {
		this.focoId = focoId;
	}

	public BigDecimal getFranId() {
		return this.franId;
	}

	public void setFranId(BigDecimal franId) {
		this.franId = franId;
	}

	public BigDecimal getMeliId() {
		return this.meliId;
	}

	public void setMeliId(BigDecimal meliId) {
		this.meliId = meliId;
	}

	public String getNocoBaseliquidacion() {
		return this.nocoBaseliquidacion;
	}

	public void setNocoBaseliquidacion(String nocoBaseliquidacion) {
		this.nocoBaseliquidacion = nocoBaseliquidacion;
	}

	public String getNocoCobroalternativo() {
		return this.nocoCobroalternativo;
	}

	public void setNocoCobroalternativo(String nocoCobroalternativo) {
		this.nocoCobroalternativo = nocoCobroalternativo;
	}

	public Date getNocoFechacambio() {
		return this.nocoFechacambio;
	}

	public void setNocoFechacambio(Date nocoFechacambio) {
		this.nocoFechacambio = nocoFechacambio;
	}

	public BigDecimal getNocoOrden() {
		return this.nocoOrden;
	}

	public void setNocoOrden(BigDecimal nocoOrden) {
		this.nocoOrden = nocoOrden;
	}

	public BigDecimal getNocoPermanente() {
		return this.nocoPermanente;
	}

	public void setNocoPermanente(BigDecimal nocoPermanente) {
		this.nocoPermanente = nocoPermanente;
	}

	public BigDecimal getNocoPorcentaje() {
		return this.nocoPorcentaje;
	}

	public void setNocoPorcentaje(BigDecimal nocoPorcentaje) {
		this.nocoPorcentaje = nocoPorcentaje;
	}

	public String getNocoRegistradopor() {
		return this.nocoRegistradopor;
	}

	public void setNocoRegistradopor(String nocoRegistradopor) {
		this.nocoRegistradopor = nocoRegistradopor;
	}

	public String getNocoTipoliquidacion() {
		return this.nocoTipoliquidacion;
	}

	public void setNocoTipoliquidacion(String nocoTipoliquidacion) {
		this.nocoTipoliquidacion = nocoTipoliquidacion;
	}

	public BigDecimal getNocoValorfijo() {
		return this.nocoValorfijo;
	}

	public void setNocoValorfijo(BigDecimal nocoValorfijo) {
		this.nocoValorfijo = nocoValorfijo;
	}

	public String getNocoVigente() {
		return this.nocoVigente;
	}

	public void setNocoVigente(String nocoVigente) {
		this.nocoVigente = nocoVigente;
	}

	public BigDecimal getNorgId() {
		return this.norgId;
	}

	public void setNorgId(BigDecimal norgId) {
		this.norgId = norgId;
	}

	public BigDecimal getPracId() {
		return this.pracId;
	}

	public void setPracId(BigDecimal pracId) {
		this.pracId = pracId;
	}

	public BigDecimal getUnprId() {
		return this.unprId;
	}

	public void setUnprId(BigDecimal unprId) {
		this.unprId = unprId;
	}

}