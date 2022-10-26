package com.nttdata.bootcamp.starter.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.crear.librerias.Saludo;

@RestController
public class PruebaController {

	@Autowired
	private Saludo saludo;

	@GetMapping(path = "/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}
}
