package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DOCENTECLASESEMANAL database table.
 * 
 */
@Entity
@NamedQuery(name="Docenteclasesemanal.findAll", query="SELECT d FROM Docenteclasesemanal d")
public class Docenteclasesemanal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocenteclasesemanalPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="DOCS_FECHACAMBIO")
	private Date docsFechacambio;

	@Column(name="DOCS_REGISTRADOPOR")
	private String docsRegistradopor;

	@Column(name="DOCS_SOBRECARGA")
	private String docsSobrecarga;

	public Docenteclasesemanal() {
	}

	public DocenteclasesemanalPK getId() {
		return this.id;
	}

	public void setId(DocenteclasesemanalPK id) {
		this.id = id;
	}

	public Date getDocsFechacambio() {
		return this.docsFechacambio;
	}

	public void setDocsFechacambio(Date docsFechacambio) {
		this.docsFechacambio = docsFechacambio;
	}

	public String getDocsRegistradopor() {
		return this.docsRegistradopor;
	}

	public void setDocsRegistradopor(String docsRegistradopor) {
		this.docsRegistradopor = docsRegistradopor;
	}

	public String getDocsSobrecarga() {
		return this.docsSobrecarga;
	}

	public void setDocsSobrecarga(String docsSobrecarga) {
		this.docsSobrecarga = docsSobrecarga;
	}

}