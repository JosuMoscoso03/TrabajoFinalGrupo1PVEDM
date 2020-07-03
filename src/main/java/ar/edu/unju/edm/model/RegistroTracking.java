package ar.edu.unju.edm.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity

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
	private Long id;
	@OneToMany (mappedBy = "registro" )
	List<ValidarCondicionSanitaria> validadores;
	@Column 
	@DateTimeFormat(pattern="dd/MM/yyyy")
	LocalDateTime fechaHora;
	@ManyToOne
	@JoinColumn (name = "LocalidadId")
	Barrio localidad;
	@Column
	String detalleLugarRegistro;
	
	public RegistroTracking() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDetalleLugarRegistro() {
		return detalleLugarRegistro;
	}
	public void setDetalleLugarRegistro(String detalleLugarRegistro) {
		this.detalleLugarRegistro = detalleLugarRegistro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ValidarCondicionSanitaria> getValidadores() {
		return validadores;
	}

	public void setValidadores(List<ValidarCondicionSanitaria> validadores) {
		this.validadores = validadores;
	}
	
	
}
