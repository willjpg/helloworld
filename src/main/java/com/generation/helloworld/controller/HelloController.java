package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping
	public String hello() {
		return"Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {  /*<br />  pula uma linha */
		return"Comunicação <br /> Persistência <br /> Adaptabilidade <br /> Trabalho em equipe"
				+ "<br /> Proatividade <br /> Orientação ao futuro <br /> Mentalidade de crescimento "
				+ "<br /> Responsabilidade pessoal";
	}
	
	@GetMapping("/objective")
	public String objective() {  /*<br />  pula uma linha */
		return"Consolidar o aprendizado sobre MySQL <br /> e começar o blog pessoal";
	}
}
