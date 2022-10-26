package com.nttdata.bootcamp.usar.librerias;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("saludo.mensaje")
public class SaludosProperties {
	private String idioma = "Castellano";

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
