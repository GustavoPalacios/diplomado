package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CATEGORIA database table.
 * 
 */
@Entity
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CATE_ID")
	private long cateId;

	@Column(name="CATE_DESCRIPCION")
	private String cateDescripcion;

	@Column(name="CATE_DESCRIPCIONACADEMUSOFT")
	private String cateDescripcionacademusoft;

	@Temporal(TemporalType.DATE)
	@Column(name="CATE_FECHACAMBIO")
	private Date cateFechacambio;

	@Column(name="CATE_REGISTRADOPOR")
	private String cateRegistradopor;

	public Categoria() {
	}

	public long getCateId() {
		return this.cateId;
	}

	public void setCateId(long cateId) {
		this.cateId = cateId;
	}

	public String getCateDescripcion() {
		return this.cateDescripcion;
	}

	public void setCateDescripcion(String cateDescripcion) {
		this.cateDescripcion = cateDescripcion;
	}

	public String getCateDescripcionacademusoft() {
		return this.cateDescripcionacademusoft;
	}

	public void setCateDescripcionacademusoft(String cateDescripcionacademusoft) {
		this.cateDescripcionacademusoft = cateDescripcionacademusoft;
	}

	public Date getCateFechacambio() {
		return this.cateFechacambio;
	}

	public void setCateFechacambio(Date cateFechacambio) {
		this.cateFechacambio = cateFechacambio;
	}

	public String getCateRegistradopor() {
		return this.cateRegistradopor;
	}

	public void setCateRegistradopor(String cateRegistradopor) {
		this.cateRegistradopor = cateRegistradopor;
	}

}