package br.ufrn.imd.web1.sismac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.ufrn.imd.web1.sismac.domain.Exame;
import br.ufrn.imd.web1.sismac.domain.Mensagem;
import br.ufrn.imd.web1.sismac.repository.ExameRepository;
import br.ufrn.imd.web1.sismac.repository.PacienteRepository;

@Controller
@RequestMapping("/exames")
public class ExameController {
	
	@Autowired
	private ExameRepository exameRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping("/listar")
	public ModelAndView listar(Model model) {
		
		ModelAndView modelAndView = new ModelAndView("exames/listar");
		modelAndView.addObject("exames", exameRepository.findAll());
		
		return modelAndView;
	}
	
	@GetMapping("/form")
	public ModelAndView form() {
		
		ModelAndView modelAndView = new ModelAndView("exames/form");
		modelAndView.addObject("exame", new Exame());
		modelAndView.addObject("pacientes", pacienteRepository.findAll());
		
		return modelAndView;
	}
	
	@GetMapping("/salvar")
	public ModelAndView salvar(Exame exame, RedirectAttributes  ra) {		
		
		exameRepository.save(exame);
		ModelAndView modelAndView = new ModelAndView(new RedirectView("listar", true));
		ra.addFlashAttribute("success", Mensagem.sucesso());
		return modelAndView;
	}
}
