package pe.com.softlite.authentication.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioResponseDto {
	
	private String usuario;
	private String nombreUsuario;
	private Long idDependencia;
	private String dependencia;
	private String area;
	private String token;

	public UsuarioResponseDto() {
		super();
	}

	public UsuarioResponseDto(String usuario, String nombreUsuario, Long idDependencia, String dependencia, String area, String token) {
		super();
		this.usuario = usuario;
		this.nombreUsuario = nombreUsuario;
		this.idDependencia = idDependencia;
		this.dependencia = dependencia;
		this.area = area;
		this.token = token;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Long getIdDependencia() {
		return idDependencia;
	}

	public void setIdDependencia(Long idDependencia) {
		this.idDependencia = idDependencia;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
