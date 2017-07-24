package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CLASESEMANAL database table.
 * 
 */
@Entity
@NamedQuery(name="Clasesemanal.findAll", query="SELECT c FROM Clasesemanal c")
public class Clasesemanal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLSE_ID")
	private long clseId;

	@Column(name="BLHO_IDFINAL")
	private BigDecimal blhoIdfinal;

	@Column(name="BLHO_IDINICIAL")
	private BigDecimal blhoIdinicial;

	@Column(name="CLSE_DIA")
	private BigDecimal clseDia;

	@Temporal(TemporalType.DATE)
	@Column(name="CLSE_FECHACAMBIO")
	private Date clseFechacambio;

	@Temporal(TemporalType.DATE)
	@Column(name="CLSE_FECHAFINAL")
	private Date clseFechafinal;

	@Temporal(TemporalType.DATE)
	@Column(name="CLSE_FECHAINICIO")
	private Date clseFechainicio;

	@Column(name="CLSE_REGISTRADOPOR")
	private String clseRegistradopor;

	@Column(name="GRUP_ID")
	private BigDecimal grupId;

	public Clasesemanal() {
	}

	public long getClseId() {
		return this.clseId;
	}

	public void setClseId(long clseId) {
		this.clseId = clseId;
	}

	public BigDecimal getBlhoIdfinal() {
		return this.blhoIdfinal;
	}

	public void setBlhoIdfinal(BigDecimal blhoIdfinal) {
		this.blhoIdfinal = blhoIdfinal;
	}

	public BigDecimal getBlhoIdinicial() {
		return this.blhoIdinicial;
	}

	public void setBlhoIdinicial(BigDecimal blhoIdinicial) {
		this.blhoIdinicial = blhoIdinicial;
	}

	public BigDecimal getClseDia() {
		return this.clseDia;
	}

	public void setClseDia(BigDecimal clseDia) {
		this.clseDia = clseDia;
	}

	public Date getClseFechacambio() {
		return this.clseFechacambio;
	}

	public void setClseFechacambio(Date clseFechacambio) {
		this.clseFechacambio = clseFechacambio;
	}

	public Date getClseFechafinal() {
		return this.clseFechafinal;
	}

	public void setClseFechafinal(Date clseFechafinal) {
		this.clseFechafinal = clseFechafinal;
	}

	public Date getClseFechainicio() {
		return this.clseFechainicio;
	}

	public void setClseFechainicio(Date clseFechainicio) {
		this.clseFechainicio = clseFechainicio;
	}

	public String getClseRegistradopor() {
		return this.clseRegistradopor;
	}

	public void setClseRegistradopor(String clseRegistradopor) {
		this.clseRegistradopor = clseRegistradopor;
	}

	public BigDecimal getGrupId() {
		return this.grupId;
	}

	public void setGrupId(BigDecimal grupId) {
		this.grupId = grupId;
	}

}