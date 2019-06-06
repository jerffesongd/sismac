package br.ufrn.imd.web1.sismac.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exame {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Column(name ="titulo_exame")
	private String tituloExame;
	
	@Column(name ="qtd_disponivel")
	private int qtdDisponivel;

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
