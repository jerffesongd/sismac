package br.ufrn.imd.web1.sismac.values;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.ufrn.imd.web1.sismac.domain.Medico;
import br.ufrn.imd.web1.sismac.repository.MedicoRepository;

@Component
public class InserirMedicos {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@PostConstruct
	public void init() {
				
		Medico medico1 = new Medico(1, "João Maria", "111.222.333-44");
		Medico medico2 = new Medico(2, "José da Silva", "555.666.777-88");
		
		medicoRepository.save(medico1);
		medicoRepository.save(medico2);
	}
}
