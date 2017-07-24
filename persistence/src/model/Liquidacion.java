package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LIQUIDACION database table.
 * 
 */
@Entity
@NamedQuery(name="Liquidacion.findAll", query="SELECT l FROM Liquidacion l")
public class Liquidacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LIQU_ID")
	private long liquId;

	@Column(name="ESTP_ID")
	private BigDecimal estpId;

	@Column(name="FINA_ID")
	private BigDecimal finaId;

	@Column(name="INLI_ID")
	private BigDecimal inliId;

	@Column(name="LIQU_ESTADO")
	private String liquEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="LIQU_FECHACAMBIO")
	private Date liquFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="LIQU_FECHAPAGO")
	private Date liquFechapago;

	@Column(name="LIQU_FECHASPROPIAS")
	private String liquFechaspropias;

	@Column(name="LIQU_NIVELLIQUIDACION")
	private String liquNivelliquidacion;

	@Column(name="LIQU_NUMEROCUOTA")
	private String liquNumerocuota;

	@Column(name="LIQU_REFERENCIA")
	private String liquReferencia;

	@Column(name="LIQU_REGISTRADOPOR")
	private String liquRegistradopor;

	@Column(name="LIQU_SALDOAFAVOR")
	private BigDecimal liquSaldoafavor;

	@Column(name="LIQU_SALDOENCONTRA")
	private BigDecimal liquSaldoencontra;

	@Column(name="LIQU_TIPOGENERACION")
	private String liquTipogeneracion;

	@Column(name="LIQU_TIPOLIQUIDACION")
	private String liquTipoliquidacion;

	@Column(name="LIQU_TOTALDESCUENTO")
	private BigDecimal liquTotaldescuento;

	@Column(name="LIQU_TOTALLIQUIDADO")
	private BigDecimal liquTotalliquidado;

	@Column(name="LIQU_VALORANTICIPO")
	private BigDecimal liquValoranticipo;

	@Column(name="LIQU_VALORCUOTAORIGINAL")
	private BigDecimal liquValorcuotaoriginal;

	@Column(name="LIQU_VALORPAGADO")
	private BigDecimal liquValorpagado;

	@Column(name="PEUN_ID")
	private BigDecimal peunId;

	@Column(name="PRAC_ID")
	private BigDecimal pracId;

	@Column(name="PSLI_ID")
	private BigDecimal psliId;

	@Column(name="TIPL_ID")
	private BigDecimal tiplId;

	@Column(name="UNID_ID")
	private BigDecimal unidId;

	public Liquidacion() {
	}

	public long getLiquId() {
		return this.liquId;
	}

	public void setLiquId(long liquId) {
		this.liquId = liquId;
	}

	public BigDecimal getEstpId() {
		return this.estpId;
	}

	public void setEstpId(BigDecimal estpId) {
		this.estpId = estpId;
	}

	public BigDecimal getFinaId() {
		return this.finaId;
	}

	public void setFinaId(BigDecimal finaId) {
		this.finaId = finaId;
	}

	public BigDecimal getInliId() {
		return this.inliId;
	}

	public void setInliId(BigDecimal inliId) {
		this.inliId = inliId;
	}

	public String getLiquEstado() {
		return this.liquEstado;
	}

	public void setLiquEstado(String liquEstado) {
		this.liquEstado = liquEstado;
	}

	public Date getLiquFechacambio() {
		return this.liquFechacambio;
	}

	public void setLiquFechacambio(Date liquFechacambio) {
		this.liquFechacambio = liquFechacambio;
	}

	public Date getLiquFechapago() {
		return this.liquFechapago;
	}

	public void setLiquFechapago(Date liquFechapago) {
		this.liquFechapago = liquFechapago;
	}

	public String getLiquFechaspropias() {
		return this.liquFechaspropias;
	}

	public void setLiquFechaspropias(String liquFechaspropias) {
		this.liquFechaspropias = liquFechaspropias;
	}

	public String getLiquNivelliquidacion() {
		return this.liquNivelliquidacion;
	}

	public void setLiquNivelliquidacion(String liquNivelliquidacion) {
		this.liquNivelliquidacion = liquNivelliquidacion;
	}

	public String getLiquNumerocuota() {
		return this.liquNumerocuota;
	}

	public void setLiquNumerocuota(String liquNumerocuota) {
		this.liquNumerocuota = liquNumerocuota;
	}

	public String getLiquReferencia() {
		return this.liquReferencia;
	}

	public void setLiquReferencia(String liquReferencia) {
		this.liquReferencia = liquReferencia;
	}

	public String getLiquRegistradopor() {
		return this.liquRegistradopor;
	}

	public void setLiquRegistradopor(String liquRegistradopor) {
		this.liquRegistradopor = liquRegistradopor;
	}

	public BigDecimal getLiquSaldoafavor() {
		return this.liquSaldoafavor;
	}

	public void setLiquSaldoafavor(BigDecimal liquSaldoafavor) {
		this.liquSaldoafavor = liquSaldoafavor;
	}

	public BigDecimal getLiquSaldoencontra() {
		return this.liquSaldoencontra;
	}

	public void setLiquSaldoencontra(BigDecimal liquSaldoencontra) {
		this.liquSaldoencontra = liquSaldoencontra;
	}

	public String getLiquTipogeneracion() {
		return this.liquTipogeneracion;
	}

	public void setLiquTipogeneracion(String liquTipogeneracion) {
		this.liquTipogeneracion = liquTipogeneracion;
	}

	public String getLiquTipoliquidacion() {
		return this.liquTipoliquidacion;
	}

	public void setLiquTipoliquidacion(String liquTipoliquidacion) {
		this.liquTipoliquidacion = liquTipoliquidacion;
	}

	public BigDecimal getLiquTotaldescuento() {
		return this.liquTotaldescuento;
	}

	public void setLiquTotaldescuento(BigDecimal liquTotaldescuento) {
		this.liquTotaldescuento = liquTotaldescuento;
	}

	public BigDecimal getLiquTotalliquidado() {
		return this.liquTotalliquidado;
	}

	public void setLiquTotalliquidado(BigDecimal liquTotalliquidado) {
		this.liquTotalliquidado = liquTotalliquidado;
	}

	public BigDecimal getLiquValoranticipo() {
		return this.liquValoranticipo;
	}

	public void setLiquValoranticipo(BigDecimal liquValoranticipo) {
		this.liquValoranticipo = liquValoranticipo;
	}

	public BigDecimal getLiquValorcuotaoriginal() {
		return this.liquValorcuotaoriginal;
	}

	public void setLiquValorcuotaoriginal(BigDecimal liquValorcuotaoriginal) {
		this.liquValorcuotaoriginal = liquValorcuotaoriginal;
	}

	public BigDecimal getLiquValorpagado() {
		return this.liquValorpagado;
	}

	public void setLiquValorpagado(BigDecimal liquValorpagado) {
		this.liquValorpagado = liquValorpagado;
	}

	public BigDecimal getPeunId() {
		return this.peunId;
	}

	public void setPeunId(BigDecimal peunId) {
		this.peunId = peunId;
	}

	public BigDecimal getPracId() {
		return this.pracId;
	}

	public void setPracId(BigDecimal pracId) {
		this.pracId = pracId;
	}

	public BigDecimal getPsliId() {
		return this.psliId;
	}

	public void setPsliId(BigDecimal psliId) {
		this.psliId = psliId;
	}

	public BigDecimal getTiplId() {
		return this.tiplId;
	}

	public void setTiplId(BigDecimal tiplId) {
		this.tiplId = tiplId;
	}

	public BigDecimal getUnidId() {
		return this.unidId;
	}

	public void setUnidId(BigDecimal unidId) {
		this.unidId = unidId;
	}

}