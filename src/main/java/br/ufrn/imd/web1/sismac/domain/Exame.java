
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
public class Exame {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_exame")
    private Integer id;
	
	@Column(name ="titulo_exame")
	private String tituloExame;
	
	@Column(name ="qtd_disponivel")
	private int qtdDisponivel;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
	
	@Column(nullable = true, updatable = false, name="DATA_EXAME")
	@CreatedDate
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataExame;
	
	@Column(nullable = true, updatable = false, name="DATA_AGENDAMENTO")
	@CreatedDate
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAgendamento = new Date();

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the tituloExame
	 */
	public String getTituloExame() {
		return tituloExame;
	}

	/**
	 * @param tituloExame the tituloExame to set
	 */
	public void setTituloExame(String tituloExame) {
		this.tituloExame = tituloExame;
	}

	/**
	 * @return the qtdDisponivel
	 */
	public int getQtdDisponivel() {
		return qtdDisponivel;
	}

	/**
	 * @param qtdDisponivel the qtdDisponivel to set
	 */
	public void setQtdDisponivel(int qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}
	
	
	
}
