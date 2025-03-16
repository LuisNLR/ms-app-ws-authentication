package pe.com.softlite.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.softlite.authentication.dto.ResponseService;
import pe.com.softlite.authentication.dto.UsuarioDto;
import pe.com.softlite.authentication.service.AuthService;
import pe.com.softlite.authentication.utils.ValidateService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
    private AuthService authService;
	
	@PostMapping("/login")
	public ResponseEntity<ResponseService> login(@RequestBody UsuarioDto user) {
		ResponseService response = new ResponseService();
		
		try {
			ValidateService validate = authService.authenticate(user);
			if(validate.isIsvalid()) {
				response.setStatus(200);
			}
			response.setMensaje(validate.getMsj());
			response.setFlag(validate.isIsvalid());
			response.setData(validate.getData());
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
