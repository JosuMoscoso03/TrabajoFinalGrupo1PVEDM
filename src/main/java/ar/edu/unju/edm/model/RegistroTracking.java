package ar.edu.unju.edm.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Registro")

public class RegistroTracking implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 811119566591507661L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native", strategy="native")
	Long idRegistro;
	@Column
	List<Persona> personas;
	@Column 
	@DateTimeFormat(pattern="dd/MM/yyyy")
	LocalDateTime fechaHora;
	@Column
	Barrio localidad;
	@Column
	String detalleLugarRegistro;
	
	public RegistroTracking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegistroTracking(LocalDateTime fechaHora, Barrio localidad, List<Persona> personas,
			String detalleLugarRegistro) {
		super();
		this.fechaHora = fechaHora;
		this.localidad = localidad;
		this.personas = personas;
		this.detalleLugarRegistro = detalleLugarRegistro;
	}
	@Override
	public String toString() {
		return "RegistroTraking [fechaHora=" + fechaHora + ", localidad=" + localidad + ", personas=" + personas
				+ ", detalleLugarRegistro=" + detalleLugarRegistro + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((detalleLugarRegistro == null) ? 0 : detalleLugarRegistro.hashCode());
		result = prime * result + ((fechaHora == null) ? 0 : fechaHora.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		result = prime * result + ((personas == null) ? 0 : personas.hashCode());
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
		RegistroTracking other = (RegistroTracking) obj;
		if (detalleLugarRegistro == null) {
			if (other.detalleLugarRegistro != null)
				return false;
		} else if (!detalleLugarRegistro.equals(other.detalleLugarRegistro))
			return false;
		if (fechaHora == null) {
			if (other.fechaHora != null)
				return false;
		} else if (!fechaHora.equals(other.fechaHora))
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (personas == null) {
			if (other.personas != null)
				return false;
		} else if (!personas.equals(other.personas))
			return false;
		return true;
	}
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	public Barrio getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Barrio localidad) {
		this.localidad = localidad;
	}
	public List<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	public String getDetalleLugarRegistro() {
		return detalleLugarRegistro;
	}
	public void setDetalleLugarRegistro(String detalleLugarRegistro) {
		this.detalleLugarRegistro = detalleLugarRegistro;
	}
	
	
}
