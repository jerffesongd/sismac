package br.ufrn.imd.web1.sismac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.ufrn.imd.web1.sismac.domain.Consulta;
import br.ufrn.imd.web1.sismac.domain.Mensagem;
import br.ufrn.imd.web1.sismac.repository.ConsultaRepository;
import br.ufrn.imd.web1.sismac.repository.MedicoRepository;
import br.ufrn.imd.web1.sismac.repository.PacienteRepository;

@Controller
@RequestMapping("/consultas")
public class ConsultaController {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@GetMapping("/listar")
	public ModelAndView listar(Model model) {
		
		ModelAndView modelAndView = new ModelAndView("consultas/listar");
		modelAndView.addObject("consultas", consultaRepository.findAll());
		
		return modelAndView;
	}
	
	@GetMapping("/form")
	public ModelAndView form() {
		
		ModelAndView modelAndView = new ModelAndView("consultas/form");
		modelAndView.addObject("consulta", new Consulta());
		modelAndView.addObject("pacientes", pacienteRepository.findAll());
		modelAndView.addObject("medicos", medicoRepository.findAll());
		
		return modelAndView;
	}
	
	@GetMapping("/salvar")
	public ModelAndView salvar(Consulta consulta, RedirectAttributes  ra) {		
		
		consultaRepository.save(consulta);
		ModelAndView modelAndView = new ModelAndView(new RedirectView("listar", true));
		ra.addFlashAttribute("success", Mensagem.sucesso());
		return modelAndView;
		
	}
}
