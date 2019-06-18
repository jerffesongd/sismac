package br.ufrn.imd.web1.sismac.domain;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

public class Mensagem {
	
	private String tipo;
	private String conteudo;
	
	public Mensagem(String tipo, String conteudo) {
		this.tipo = tipo;
		this.conteudo = conteudo;
	}
	
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the conteudo
	 */
	public String getConteudo() {
		return conteudo;
	}
	/**
	 * @param conteudo the conteudo to set
	 */
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public static Mensagem sucesso() {
		return new Mensagem("success", "Ação realizada com sucesso");
	}
	
}
