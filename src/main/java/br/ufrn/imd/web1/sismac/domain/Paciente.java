package br.ufrn.imd.web1.sismac.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Paciente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_paciente")
    private Integer id;
	
	private String nome;
	
	private String cpf;
	
	private int idade;
	
	private String sexo;
	
	private String CNS;
	
	@Column(nullable=true)
	private String telefone;
	
	@Column(name ="nome_mae")
	private String nomeMae;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Exame> exames;
	
	@OneToMany(fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SELECT)
	private List<Consulta> consultas;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the cNS
	 */
	public String getCNS() {
		return CNS;
	}

	/**
	 * @param cNS the cNS to set
	 */
	public void setCNS(String cNS) {
		CNS = cNS;
	}

	/**
	 * @return the nomeMae
	 */
	public String getNomeMae() {
		return nomeMae;
	}

	/**
	 * @param nomeMae the nomeMae to set
	 */
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	/**
	 * @return the exames
	 */
	public List<Exame> getExames() {
		return exames;
	}

	/**
	 * @param exames the exames to set
	 */
	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

	/**
	 * @return the consultas
	 */
	public List<Consulta> getConsultas() {
		return consultas;
	}

	/**
	 * @param consultas the consultas to set
	 */
	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

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
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
