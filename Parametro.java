package br.com.empresa.domain.entities;

import br.com.empresa.domain.exceptions.ParametroException;

public class Parametro {
	private String idParametro;
	private String chave;
	private String valor;
	private String descricao;
	
	private Parametro(Builder builder) {
		this.idParametro = builder.idParametro;
		this.chave = builder.chave;
		this.valor = builder.valor;
		this.descricao = builder.descricao;
	}
	public static class Builder {
		private String idParametro;
		private String chave;
		private String valor;
		private String descricao;
		public Builder setIdParametro(String idParametro) {
			this.idParametro = idParametro;
			return this;
		}
		public Builder setChave(String chave) {
			this.chave = chave;
			return this;
		}
		public Builder setValor(String valor) {
			this.valor = valor;
			return this;
		}
		public Builder setDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}
		public Parametro build() {
			return new Parametro(this);
		}
	}
	
	public String getIdParametro() {
		return idParametro;
	}
	public void setIdParametro(String idParametro) {
		this.idParametro = idParametro;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void isValorExiste() throws ParametroException {
		if (this.getValor()!=null && !"".equals(this.getValor()) ) {
			throw new ParametroException("Campo VALOR não definido para o parâmetro: "+this.chave);
		}
	}
}
