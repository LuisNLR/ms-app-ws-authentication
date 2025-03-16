package pe.com.softlite.authentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usua_tram")
public class Usuario {
	
	@Id
	@Column(name = "TXT_USUA_USUA")
	private String userUsuario;
	
	@Column(name = "TXT_NOMB_USUA")
	private String nombreUsuario;
	
	@Column(name = "TXT_PASS_USUA")
	private String passwordUsuario;
	
	@Column(name = "TXT_MAIL_USUA")
	private String mailUsuario;
	
	public Usuario() {
		super();
	}

	public Usuario(String userUsuario, String nombreUsuario, String passwordUsuario, String mailUsuario) {
		super();
		this.userUsuario = userUsuario;
		this.nombreUsuario = nombreUsuario;
		this.passwordUsuario = passwordUsuario;
		this.mailUsuario = mailUsuario;
	}

	public String getUserUsuario() {
		return userUsuario;
	}

	public void setUserUsuario(String userUsuario) {
		this.userUsuario = userUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	public String getMailUsuario() {
		return mailUsuario;
	}

	public void setMailUsuario(String mailUsuario) {
		this.mailUsuario = mailUsuario;
	}
	
}
