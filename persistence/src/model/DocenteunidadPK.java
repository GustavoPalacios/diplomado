package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the DOCENTEUNIDAD database table.
 * 
 */
@Embeddable
public class DocenteunidadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PEGE_ID")
	private long pegeId;

	@Column(name="DOUN_ID")
	private long dounId;

	public DocenteunidadPK() {
	}
	public long getPegeId() {
		return this.pegeId;
	}
	public void setPegeId(long pegeId) {
		this.pegeId = pegeId;
	}
	public long getDounId() {
		return this.dounId;
	}
	public void setDounId(long dounId) {
		this.dounId = dounId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DocenteunidadPK)) {
			return false;
		}
		DocenteunidadPK castOther = (DocenteunidadPK)other;
		return 
			(this.pegeId == castOther.pegeId)
			&& (this.dounId == castOther.dounId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pegeId ^ (this.pegeId >>> 32)));
		hash = hash * prime + ((int) (this.dounId ^ (this.dounId >>> 32)));
		
		return hash;
	}
}