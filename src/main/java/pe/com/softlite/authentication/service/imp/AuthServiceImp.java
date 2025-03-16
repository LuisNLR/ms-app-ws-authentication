package pe.com.softlite.authentication.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import pe.com.softlite.authentication.dto.UsuarioDto;
import pe.com.softlite.authentication.dto.UsuarioResponseDto;
import pe.com.softlite.authentication.model.UsuarioDependencia;
import pe.com.softlite.authentication.repository.UsuarioDependenciaRepository;
import pe.com.softlite.authentication.repository.UsuarioRepository;
import pe.com.softlite.authentication.service.AuthService;
import pe.com.softlite.authentication.utils.PasswordUtils;
import pe.com.softlite.authentication.utils.ValidateService;
import pe.com.softlite.authentication.utils.ValidateServiceImp;

import java.security.Key;
import java.util.Date;

@Service
public class AuthServiceImp implements AuthService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioDependenciaRepository usuarioDependenciaRepository;
	
	private final String SECRET_KEY = "2D4A614E645267556B58703273357638792F423F4428472B4B6250655368566D";

	@Override
	public ValidateService authenticate(UsuarioDto usuarioDto) {
		ValidateService validate = new ValidateServiceImp();
		validate.setIsvalid(true);
		validate.setMsj("Login exitoso");
		UsuarioDependencia usuarioDependencia = null;
		if(usuarioDto.getUser() != null && !usuarioDto.getUser().isEmpty()) {
			usuarioDependencia = usuarioDependenciaRepository.findByUsuario(usuarioDto.getUser());
		}
		
		if (usuarioDto == null) {
			validate.setIsvalid(false);
			validate.setMsj("No se ha creado el usuario");
		} else if (usuarioDto.getUser() == null || usuarioDto.getUser().isEmpty()) {
			validate.setIsvalid(false);
			validate.setMsj("Ingrese el usuario");
		} else if (usuarioDto.getPassword() == null || usuarioDto.getPassword().isEmpty()) {
			validate.setIsvalid(false);
			validate.setMsj("Ingrese el password");
		} else if (usuarioDependencia==null) {
			validate.setIsvalid(false);
			validate.setMsj("El usuario ingresado no existe");
		} else if (!PasswordUtils.matchPassword(usuarioDto.getPassword(), usuarioDependencia.getUsuario().getPasswordUsuario())) {
			validate.setIsvalid(false);
			validate.setMsj("El password ingresado es incorrecto");
		}
		// Simula una validación básica (usa una base de datos en entornos reales)
		//else if ("usuario".equals(usuarioDto.getUser()) && "contrasena".equals(usuarioDto.getPassword())) {
		else {
			// String token = generateToken(usuarioDto.getUser());
			UsuarioResponseDto response = new UsuarioResponseDto(usuarioDto.getUser()
																,usuarioDependencia.getUsuario().getNombreUsuario()
																,usuarioDependencia.getDependencia().getIdDependencia()
																,usuarioDependencia.getDependencia().getNombreDependencia()
																,usuarioDependencia.getDependencia().getNombreArea()
																,generateToken(usuarioDto.getUser())
																);
			validate.setData(response);
		}
		return validate;
	}

	private String generateToken(String username) {
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 día
				.signWith(getSignInKey(), SignatureAlgorithm.HS256)
				.compact();
	}

	private Key getSignInKey() {
		byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
		return Keys.hmacShaKeyFor(keyBytes);
	}
	
}
