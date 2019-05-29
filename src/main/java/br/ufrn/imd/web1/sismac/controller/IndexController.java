package br.ufrn.imd.web1.sismac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping(value={"index", "home"})
	public ModelAndView index () {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		return modelAndView;
		
	}
	
	@GetMapping("login")
	public ModelAndView login() {
		
		ModelAndView modelAndView = new ModelAndView("login");
		
		return modelAndView;
	}
}
