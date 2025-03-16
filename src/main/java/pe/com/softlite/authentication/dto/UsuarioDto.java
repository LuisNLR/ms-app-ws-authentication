package pe.com.softlite.authentication.dto;

public class UsuarioDto {

	private String user;
	private String password;
	
	public UsuarioDto() {
		super();
	}

	public UsuarioDto(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
