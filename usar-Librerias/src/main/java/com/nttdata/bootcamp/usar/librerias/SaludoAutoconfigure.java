package com.nttdata.bootcamp.usar.librerias;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.crear.librerias.Saludo;

@Configuration
@ConditionalOnClass(Saludo.class)
@EnableConfigurationProperties(SaludosProperties.class)
public class SaludoAutoconfigure {
	private final SaludosProperties properties;

	public SaludoAutoconfigure(SaludosProperties properties) {
		this.properties = properties;
	}

	@Bean
	public Saludo saludo() {
		return new Saludo(properties.getIdioma());
	}
}
