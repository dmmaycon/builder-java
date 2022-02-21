package dmmaycon.com.github.domain;

import java.math.BigDecimal;

public class Produto {

	private String codigo;
	private String nome;
	private String descricao;
	private Integer quantidade;
	private BigDecimal valor;
	
	public Produto(String codigo, String nome, String descricao, Integer quantidade, BigDecimal valor) {
		this.codigo 		= codigo;
		this.nome 			= nome;
		this.descricao 		= descricao;
		this.quantidade 	= quantidade;
		this.valor 			= valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
