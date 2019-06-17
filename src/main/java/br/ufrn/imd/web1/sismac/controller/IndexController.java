package br.ufrn.imd.web1.sismac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufrn.imd.web1.sismac.repository.ConsultaRepository;


@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	@GetMapping
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView("consultas/listar");
		modelAndView.addObject("consultas", consultaRepository.findAll());
		
		return modelAndView;
		
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		
		ModelAndView modelAndView = new ModelAndView("login");
		
		return modelAndView;
		
	}
	
}

