package ar.edu.unju.edm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Barrio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3612824470756797049L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native", strategy="native")
	private Long id;
	@Column
	String barrio;
	public Barrio(String barrio) {
		super();
		this.barrio = barrio;
	}
	public Barrio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Barrio(Long id, String barrio) {
		super();
		this.id = id;
		this.barrio = barrio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barrio == null) ? 0 : barrio.hashCode());
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
		Barrio other = (Barrio) obj;
		if (barrio == null) {
			if (other.barrio != null)
				return false;
		} else if (!barrio.equals(other.barrio))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Barrio [barrio=" + barrio + "]";
	}

}
