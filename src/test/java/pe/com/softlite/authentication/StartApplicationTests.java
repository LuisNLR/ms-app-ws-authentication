package pe.com.softlite.authentication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.com.softlite.authentication.repository.UsuarioDependenciaRepository;
import pe.com.softlite.authentication.repository.UsuarioRepository;

@SpringBootTest
class StartApplicationTests {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	UsuarioDependenciaRepository usuarioDependenciaRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void getUsuario() {
		String nombreUsuario = usuarioRepository.findByUserUsuario("llizanar").getUserUsuario();
		assertEquals(nombreUsuario, "llizanar");
	}
	
	@Test
	void getUsuarioDependencia() {
		String nombreUsuario = usuarioDependenciaRepository.findByUsuario("llizanar").getUsuario().getUserUsuario();
		assertEquals(nombreUsuario, "llizanar");
	}
	
}
