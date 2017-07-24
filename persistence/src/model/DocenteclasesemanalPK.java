package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DOCENTECLASESEMANAL database table.
 * 
 */
@Embeddable
public class DocenteclasesemanalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PEGE_ID")
	private long pegeId;

	@Column(name="CLSE_ID")
	private long clseId;

	public DocenteclasesemanalPK() {
	}
	public long getPegeId() {
		return this.pegeId;
	}
	public void setPegeId(long pegeId) {
		this.pegeId = pegeId;
	}
	public long getClseId() {
		return this.clseId;
	}
	public void setClseId(long clseId) {
		this.clseId = clseId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocenteclasesemanalPK)) {
			return false;
		}
		DocenteclasesemanalPK castOther = (DocenteclasesemanalPK)other;
		return 
			(this.pegeId == castOther.pegeId)
			&& (this.clseId == castOther.clseId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pegeId ^ (this.pegeId >>> 32)));
		hash = hash * prime + ((int) (this.clseId ^ (this.clseId >>> 32)));
		
		return hash;
	}
}