package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the JORNADA database table.
 * 
 */
@Entity
@NamedQuery(name="Jornada.findAll", query="SELECT j FROM Jornada j")
public class Jornada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="JORN_ID")
	private long jornId;

	@Column(name="JORN_DESCRIPCION")
	private String jornDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="JORN_FECHACAMBIO")
	private Date jornFechacambio;

	@Column(name="JORN_FINDESEMANA")
	private String jornFindesemana;

	@Column(name="JORN_HORAFIN")
	private String jornHorafin;

	@Column(name="JORN_HORAINICIO")
	private String jornHorainicio;

	@Column(name="JORN_JORNADAESNIES")
	private String jornJornadaesnies;

	@Column(name="JORN_REGISTRADOPOR")
	private String jornRegistradopor;

	public Jornada() {
	}

	public long getJornId() {
		return this.jornId;
	}

	public void setJornId(long jornId) {
		this.jornId = jornId;
	}

	public String getJornDescripcion() {
		return this.jornDescripcion;
	}

	public void setJornDescripcion(String jornDescripcion) {
		this.jornDescripcion = jornDescripcion;
	}

	public Date getJornFechacambio() {
		return this.jornFechacambio;
	}

	public void setJornFechacambio(Date jornFechacambio) {
		this.jornFechacambio = jornFechacambio;
	}

	public String getJornFindesemana() {
		return this.jornFindesemana;
	}

	public void setJornFindesemana(String jornFindesemana) {
		this.jornFindesemana = jornFindesemana;
	}

	public String getJornHorafin() {
		return this.jornHorafin;
	}

	public void setJornHorafin(String jornHorafin) {
		this.jornHorafin = jornHorafin;
	}

	public String getJornHorainicio() {
		return this.jornHorainicio;
	}

	public void setJornHorainicio(String jornHorainicio) {
		this.jornHorainicio = jornHorainicio;
	}

	public String getJornJornadaesnies() {
		return this.jornJornadaesnies;
	}

	public void setJornJornadaesnies(String jornJornadaesnies) {
		this.jornJornadaesnies = jornJornadaesnies;
	}

	public String getJornRegistradopor() {
		return this.jornRegistradopor;
	}

	public void setJornRegistradopor(String jornRegistradopor) {
		this.jornRegistradopor = jornRegistradopor;
	}

}