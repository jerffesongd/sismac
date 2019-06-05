package br.ufrn.imd.web1.sismac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufrn.imd.web1.sismac.domain.Paciente;
import br.ufrn.imd.web1.sismac.repository.PacienteRepository;

@Controller
@RequestMapping("/pacientes")
public class PacientesController {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping("/form")
	public ModelAndView form() {
		
		ModelAndView modelAndView = new ModelAndView("pacientes/form");
		modelAndView.addObject("paciente", new Paciente());
		
		return modelAndView;
	}
	
	@GetMapping("/salvar")
	public ModelAndView salvar(Paciente paciente) {		
		
		pacienteRepository.save(paciente);
		
		List<Paciente> pacientes  = pacienteRepository.findAll();
		
		for (Paciente p : pacientes ) {
			System.out.println(p.getNome());
		}
		
		return form();
	}
	
}
