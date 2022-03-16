package co.com.proteccion.pruebaTecnica.PruebaTecnica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.com.proteccion.pruebaTecnica.PruebaTecnica.service.IenviarCorreoService;

@Controller
@RequestMapping("/email")
public class enviarCorreoController {
	
	@Autowired
	private IenviarCorreoService enviarCorreo;
	
	@PostMapping(produces = {"application/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public void testCorreos() {
		enviarCorreo.enviarCorreo();
	}
}
