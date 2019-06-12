package br.ufrn.imd.web1.sismac.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Consulta {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_consulta")
    private Integer id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_medico")
	private Medico medico;
	
	@Column(nullable = true, updatable = false, name="DATA_CONSULTA")
	@CreatedDate
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataConsulta;
	
	@Column(nullable = true, updatable = false, name="DATA_AGENDAMENTO")
	@CreatedDate
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAgendamento = new Date();

	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}

	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}

	/**
	 * @param medico the medico to set
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	/**
	 * @return the dataConsulta
	 */
	public Date getDataConsulta() {
		return dataConsulta;
	}

	/**
	 * @param dataConsulta the dataConsulta to set
	 */
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	/**
	 * @return the dataAgendamento
	 */
	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	/**
	 * @param dataAgendamento the dataAgendamento to set
	 */
	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
}
