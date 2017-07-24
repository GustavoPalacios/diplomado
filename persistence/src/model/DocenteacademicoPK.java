package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DOCENTEACADEMICO database table.
 * 
 */
@Embeddable
public class DocenteacademicoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PEGE_ID")
	private long pegeId;

	@Column(name="DOCE_CODIGO")
	private String doceCodigo;

	public DocenteacademicoPK() {
	}
	public long getPegeId() {
		return this.pegeId;
	}
	public void setPegeId(long pegeId) {
		this.pegeId = pegeId;
	}
	public String getDoceCodigo() {
		return this.doceCodigo;
	}
	public void setDoceCodigo(String doceCodigo) {
		this.doceCodigo = doceCodigo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocenteacademicoPK)) {
			return false;
		}
		DocenteacademicoPK castOther = (DocenteacademicoPK)other;
		return 
			(this.pegeId == castOther.pegeId)
			&& this.doceCodigo.equals(castOther.doceCodigo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pegeId ^ (this.pegeId >>> 32)));
		hash = hash * prime + this.doceCodigo.hashCode();
		
		return hash;
	}
}