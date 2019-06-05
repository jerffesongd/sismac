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
		
		Paciente p = new Paciente();
		p.setNome("Jerffeson");
		p.setIdade(24);
		
		pacienteRepository.save(p);
		
		List<Paciente> a  = pacienteRepository.findAll();
		
		for (Paciente h : a ) {
			System.out.println(h.getNome());
		}
		
		return modelAndView;
	}
}
