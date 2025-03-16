package pe.com.softlite.authentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "tb_depe_enti")
public class Dependencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDX_DEPE_ENTI")
	private Long idDependencia;
	
	@Column(name = "TXT_NOMB_DEPE")
	private String nombreDependencia;
	
	@Column(name = "TXT_NOMB_AREA")
	private String nombreArea;
	
	@Column(name = "FLG_ESTA_DEPE")
	private Integer flgEstado;

	public Dependencia() {
		super();
	}

	public Dependencia(Long idDependencia, String nombreDependencia, String nombreArea, Integer flgEstado) {
		super();
		this.idDependencia = idDependencia;
		this.nombreDependencia = nombreDependencia;
		this.nombreArea = nombreArea;
		this.flgEstado = flgEstado;
	}

	public Long getIdDependencia() {
		return idDependencia;
	}

	public void setIdDependencia(Long idDependencia) {
		this.idDependencia = idDependencia;
	}

	public String getNombreDependencia() {
		return nombreDependencia;
	}

	public void setNombreDependencia(String nombreDependencia) {
		this.nombreDependencia = nombreDependencia;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public Integer getFlgEstado() {
		return flgEstado;
	}

	public void setFlgEstado(Integer flgEstado) {
		this.flgEstado = flgEstado;
	}
	
}
