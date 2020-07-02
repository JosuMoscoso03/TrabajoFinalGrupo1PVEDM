package ar.edu.unju.edm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="condicionSanitaria")

public class ValidarCondicionSanitaria implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9002047256638366756L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native", strategy="native")
	long codValidacion;
	@Column
	Persona persona;
	@Column
	boolean usaTapaBoca;
	@Column
	boolean cumpleTerminacionDNI;
	@Column
	boolean poseePermisoCirculacion;
	@Column
	boolean estaAcompañado;
	public ValidarCondicionSanitaria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ValidarCondicionSanitaria(Persona persona, boolean usaTapaBoca, boolean cumpleTerminacionDNI,
			boolean poseePermisoCirculacion, boolean estaAcompañado) {
		super();
		this.persona = persona;
		this.usaTapaBoca = usaTapaBoca;
		this.cumpleTerminacionDNI = cumpleTerminacionDNI;
		this.poseePermisoCirculacion = poseePermisoCirculacion;
		this.estaAcompañado = estaAcompañado;
	}
	@Override
	public String toString() {
		return "ValidarCondicionSanitaria [persona=" + persona + ", usaTapaBoca=" + usaTapaBoca
				+ ", cumpleTerminacionDNI=" + cumpleTerminacionDNI + ", poseePermisoCirculacion="
				+ poseePermisoCirculacion + ", estaAcompañado=" + estaAcompañado + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (cumpleTerminacionDNI ? 1231 : 1237);
		result = prime * result + (estaAcompañado ? 1231 : 1237);
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		result = prime * result + (poseePermisoCirculacion ? 1231 : 1237);
		result = prime * result + (usaTapaBoca ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValidarCondicionSanitaria other = (ValidarCondicionSanitaria) obj;
		if (cumpleTerminacionDNI != other.cumpleTerminacionDNI)
			return false;
		if (estaAcompañado != other.estaAcompañado)
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		if (poseePermisoCirculacion != other.poseePermisoCirculacion)
			return false;
		if (usaTapaBoca != other.usaTapaBoca)
			return false;
		return true;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public boolean isUsaTapaBoca() {
		return usaTapaBoca;
	}
	public void setUsaTapaBoca(boolean usaTapaBoca) {
		this.usaTapaBoca = usaTapaBoca;
	}
	public boolean isCumpleTerminacionDNI() {
		return cumpleTerminacionDNI;
	}
	public void setCumpleTerminacionDNI(boolean cumpleTerminacionDNI) {
		this.cumpleTerminacionDNI = cumpleTerminacionDNI;
	}
	public boolean isPoseePermisoCirculacion() {
		return poseePermisoCirculacion;
	}
	public void setPoseePermisoCirculacion(boolean poseePermisoCirculacion) {
		this.poseePermisoCirculacion = poseePermisoCirculacion;
	}
	public boolean isEstaAcompañado() {
		return estaAcompañado;
	}
	public void setEstaAcompañado(boolean estaAcompañado) {
		this.estaAcompañado = estaAcompañado;
	}
	
}