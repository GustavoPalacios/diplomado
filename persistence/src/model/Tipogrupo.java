package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TIPOGRUPO database table.
 * 
 */
@Entity
@NamedQuery(name="Tipogrupo.findAll", query="SELECT t FROM Tipogrupo t")
public class Tipogrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TIGR_ID")
	private long tigrId;

	@Column(name="TIGR_DESCRIPCION")
	private String tigrDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="TIGR_FECHACAMBIO")
	private Date tigrFechacambio;

	@Column(name="TIGR_REGISTRADOPOR")
	private String tigrRegistradopor;

	public Tipogrupo() {
	}

	public long getTigrId() {
		return this.tigrId;
	}

	public void setTigrId(long tigrId) {
		this.tigrId = tigrId;
	}

	public String getTigrDescripcion() {
		return this.tigrDescripcion;
	}

	public void setTigrDescripcion(String tigrDescripcion) {
		this.tigrDescripcion = tigrDescripcion;
	}

	public Date getTigrFechacambio() {
		return this.tigrFechacambio;
	}

	public void setTigrFechacambio(Date tigrFechacambio) {
		this.tigrFechacambio = tigrFechacambio;
	}

	public String getTigrRegistradopor() {
		return this.tigrRegistradopor;
	}

	public void setTigrRegistradopor(String tigrRegistradopor) {
		this.tigrRegistradopor = tigrRegistradopor;
	}

}