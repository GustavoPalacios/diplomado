package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the INFORMACIONSOCIOECONOMICA database table.
 * 
 */
@Entity
@NamedQuery(name="Informacionsocioeconomica.findAll", query="SELECT i FROM Informacionsocioeconomica i")
public class Informacionsocioeconomica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ASPI_ID")
	private long aspiId;

	@Column(name="CACF_ID")
	private BigDecimal cacfId;

	@Column(name="INSO_CACFCATEGORIA")
	private String insoCacfcategoria;

	@Column(name="INSO_CONQUIENRESIDE")
	private String insoConquienreside;

	@Column(name="INSO_ESTRATO")
	private BigDecimal insoEstrato;

	@Temporal(TemporalType.DATE)
	@Column(name="INSO_FECHACAMBIO")
	private Date insoFechacambio;

	@Column(name="INSO_HERMANOSESTUDIANDOU")
	private BigDecimal insoHermanosestudiandou;

	@Column(name="INSO_INGRESOBRUTO")
	private String insoIngresobruto;

	@Column(name="INSO_INGRESOSGRAVABLES")
	private String insoIngresosgravables;

	@Column(name="INSO_INGRESOSNOGRAVABLES")
	private String insoIngresosnogravables;

	@Column(name="INSO_INGRESOSRETENCIONES")
	private String insoIngresosretenciones;

	@Column(name="INSO_NIVELSISBEN")
	private String insoNivelsisben;

	@Column(name="INSO_NROHERMANOSESTUDIANDOUNIV")
	private String insoNrohermanosestudiandouniv;

	@Column(name="INSO_NUMEROFAMILIARES")
	private BigDecimal insoNumerofamiliares;

	@Column(name="INSO_NUMEROHERMANOS")
	private BigDecimal insoNumerohermanos;

	@Column(name="INSO_NUMMIEMBROSTRABAJA")
	private BigDecimal insoNummiembrostrabaja;

	@Column(name="INSO_PATRIMONIOBRUTO")
	private String insoPatrimoniobruto;

	@Column(name="INSO_PATRIMONIOGRAVABLE")
	private String insoPatrimoniogravable;

	@Column(name="INSO_POSICIONENHERMANOS")
	private BigDecimal insoPosicionenhermanos;

	@Column(name="INSO_QUIENCOSTEAESTUDIOS")
	private String insoQuiencosteaestudios;

	@Column(name="INSO_REGISTRADOPOR")
	private String insoRegistradopor;

	@Column(name="INSO_RENTAGRAVABLE")
	private String insoRentagravable;

	@Column(name="INSO_RENTANOGRAVABLE")
	private String insoRentanogravable;

	@Column(name="INSO_SISBEN")
	private String insoSisben;

	@Column(name="INSO_SITUACIONECONOMICA")
	private String insoSituacioneconomica;

	@Column(name="INSO_SITUACIONPADRES")
	private String insoSituacionpadres;

	@Column(name="INSO_SUFRAGOELECCIONES")
	private String insoSufragoelecciones;

	@Column(name="INSO_VIVECONFAMILIA")
	private String insoViveconfamilia;

	@Column(name="INSO_VREGRESMENSUFAMIL")
	private BigDecimal insoVregresmensufamil;

	@Column(name="INSO_VRINGRESMENSUFAMIL")
	private BigDecimal insoVringresmensufamil;

	public Informacionsocioeconomica() {
	}

	public long getAspiId() {
		return this.aspiId;
	}

	public void setAspiId(long aspiId) {
		this.aspiId = aspiId;
	}

	public BigDecimal getCacfId() {
		return this.cacfId;
	}

	public void setCacfId(BigDecimal cacfId) {
		this.cacfId = cacfId;
	}

	public String getInsoCacfcategoria() {
		return this.insoCacfcategoria;
	}

	public void setInsoCacfcategoria(String insoCacfcategoria) {
		this.insoCacfcategoria = insoCacfcategoria;
	}

	public String getInsoConquienreside() {
		return this.insoConquienreside;
	}

	public void setInsoConquienreside(String insoConquienreside) {
		this.insoConquienreside = insoConquienreside;
	}

	public BigDecimal getInsoEstrato() {
		return this.insoEstrato;
	}

	public void setInsoEstrato(BigDecimal insoEstrato) {
		this.insoEstrato = insoEstrato;
	}

	public Date getInsoFechacambio() {
		return this.insoFechacambio;
	}

	public void setInsoFechacambio(Date insoFechacambio) {
		this.insoFechacambio = insoFechacambio;
	}

	public BigDecimal getInsoHermanosestudiandou() {
		return this.insoHermanosestudiandou;
	}

	public void setInsoHermanosestudiandou(BigDecimal insoHermanosestudiandou) {
		this.insoHermanosestudiandou = insoHermanosestudiandou;
	}

	public String getInsoIngresobruto() {
		return this.insoIngresobruto;
	}

	public void setInsoIngresobruto(String insoIngresobruto) {
		this.insoIngresobruto = insoIngresobruto;
	}

	public String getInsoIngresosgravables() {
		return this.insoIngresosgravables;
	}

	public void setInsoIngresosgravables(String insoIngresosgravables) {
		this.insoIngresosgravables = insoIngresosgravables;
	}

	public String getInsoIngresosnogravables() {
		return this.insoIngresosnogravables;
	}

	public void setInsoIngresosnogravables(String insoIngresosnogravables) {
		this.insoIngresosnogravables = insoIngresosnogravables;
	}

	public String getInsoIngresosretenciones() {
		return this.insoIngresosretenciones;
	}

	public void setInsoIngresosretenciones(String insoIngresosretenciones) {
		this.insoIngresosretenciones = insoIngresosretenciones;
	}

	public String getInsoNivelsisben() {
		return this.insoNivelsisben;
	}

	public void setInsoNivelsisben(String insoNivelsisben) {
		this.insoNivelsisben = insoNivelsisben;
	}

	public String getInsoNrohermanosestudiandouniv() {
		return this.insoNrohermanosestudiandouniv;
	}

	public void setInsoNrohermanosestudiandouniv(String insoNrohermanosestudiandouniv) {
		this.insoNrohermanosestudiandouniv = insoNrohermanosestudiandouniv;
	}

	public BigDecimal getInsoNumerofamiliares() {
		return this.insoNumerofamiliares;
	}

	public void setInsoNumerofamiliares(BigDecimal insoNumerofamiliares) {
		this.insoNumerofamiliares = insoNumerofamiliares;
	}

	public BigDecimal getInsoNumerohermanos() {
		return this.insoNumerohermanos;
	}

	public void setInsoNumerohermanos(BigDecimal insoNumerohermanos) {
		this.insoNumerohermanos = insoNumerohermanos;
	}

	public BigDecimal getInsoNummiembrostrabaja() {
		return this.insoNummiembrostrabaja;
	}

	public void setInsoNummiembrostrabaja(BigDecimal insoNummiembrostrabaja) {
		this.insoNummiembrostrabaja = insoNummiembrostrabaja;
	}

	public String getInsoPatrimoniobruto() {
		return this.insoPatrimoniobruto;
	}

	public void setInsoPatrimoniobruto(String insoPatrimoniobruto) {
		this.insoPatrimoniobruto = insoPatrimoniobruto;
	}

	public String getInsoPatrimoniogravable() {
		return this.insoPatrimoniogravable;
	}

	public void setInsoPatrimoniogravable(String insoPatrimoniogravable) {
		this.insoPatrimoniogravable = insoPatrimoniogravable;
	}

	public BigDecimal getInsoPosicionenhermanos() {
		return this.insoPosicionenhermanos;
	}

	public void setInsoPosicionenhermanos(BigDecimal insoPosicionenhermanos) {
		this.insoPosicionenhermanos = insoPosicionenhermanos;
	}

	public String getInsoQuiencosteaestudios() {
		return this.insoQuiencosteaestudios;
	}

	public void setInsoQuiencosteaestudios(String insoQuiencosteaestudios) {
		this.insoQuiencosteaestudios = insoQuiencosteaestudios;
	}

	public String getInsoRegistradopor() {
		return this.insoRegistradopor;
	}

	public void setInsoRegistradopor(String insoRegistradopor) {
		this.insoRegistradopor = insoRegistradopor;
	}

	public String getInsoRentagravable() {
		return this.insoRentagravable;
	}

	public void setInsoRentagravable(String insoRentagravable) {
		this.insoRentagravable = insoRentagravable;
	}

	public String getInsoRentanogravable() {
		return this.insoRentanogravable;
	}

	public void setInsoRentanogravable(String insoRentanogravable) {
		this.insoRentanogravable = insoRentanogravable;
	}

	public String getInsoSisben() {
		return this.insoSisben;
	}

	public void setInsoSisben(String insoSisben) {
		this.insoSisben = insoSisben;
	}

	public String getInsoSituacioneconomica() {
		return this.insoSituacioneconomica;
	}

	public void setInsoSituacioneconomica(String insoSituacioneconomica) {
		this.insoSituacioneconomica = insoSituacioneconomica;
	}

	public String getInsoSituacionpadres() {
		return this.insoSituacionpadres;
	}

	public void setInsoSituacionpadres(String insoSituacionpadres) {
		this.insoSituacionpadres = insoSituacionpadres;
	}

	public String getInsoSufragoelecciones() {
		return this.insoSufragoelecciones;
	}

	public void setInsoSufragoelecciones(String insoSufragoelecciones) {
		this.insoSufragoelecciones = insoSufragoelecciones;
	}

	public String getInsoViveconfamilia() {
		return this.insoViveconfamilia;
	}

	public void setInsoViveconfamilia(String insoViveconfamilia) {
		this.insoViveconfamilia = insoViveconfamilia;
	}

	public BigDecimal getInsoVregresmensufamil() {
		return this.insoVregresmensufamil;
	}

	public void setInsoVregresmensufamil(BigDecimal insoVregresmensufamil) {
		this.insoVregresmensufamil = insoVregresmensufamil;
	}

	public BigDecimal getInsoVringresmensufamil() {
		return this.insoVringresmensufamil;
	}

	public void setInsoVringresmensufamil(BigDecimal insoVringresmensufamil) {
		this.insoVringresmensufamil = insoVringresmensufamil;
	}

}