package pe.com.softlite.authentication.service;

import pe.com.softlite.authentication.dto.UsuarioDto;
import pe.com.softlite.authentication.utils.ValidateService;

public interface AuthService {
	
	public ValidateService authenticate(UsuarioDto usuarioDto);

}
