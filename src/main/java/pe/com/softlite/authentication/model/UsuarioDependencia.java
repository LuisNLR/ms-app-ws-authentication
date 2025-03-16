package pe.com.softlite.authentication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usua_depe_logi")
public class UsuarioDependencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDX_USUA_DEPE")
	private Long idUsuarioDependencia;
	
	@Column(name = "FEC_INGR_DEPE")
	private Date fechaRegistro;
	
	@Column(name = "FEC_TERM_DEPE")
	private Date fechaTermino;
	
	@Column(name = "FLG_ACTU_LOGI")
	private Integer flgActual;
	
	@OneToOne
	@JoinColumn(name = "FK0_USUA_USUA_IDX")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "FK1_DEPE_ENTI_IDX")
	private Dependencia dependencia;

	public UsuarioDependencia() {
		super();
	}

	public UsuarioDependencia(Date fechaRegistro, Integer flgActual, Usuario usuario, Dependencia dependencia) {
		super();
		this.fechaRegistro = fechaRegistro;
		this.flgActual = flgActual;
		this.usuario = usuario;
		this.dependencia = dependencia;
	}

	public Long getIdUsuarioDependencia() {
		return idUsuarioDependencia;
	}

	public void setIdUsuarioDependencia(Long idUsuarioDependencia) {
		this.idUsuarioDependencia = idUsuarioDependencia;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Integer getFlgActual() {
		return flgActual;
	}

	public void setFlgActual(Integer flgActual) {
		this.flgActual = flgActual;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Dependencia getDependencia() {
		return dependencia;
	}

	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}

}
