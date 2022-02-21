package dmmaycon.com.github.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotaFiscal {

	private String numero;
	private Date dataEmissao;
	private String chave;

	private Emissor emissor;
	private Cliente cliente;

	private List<Produto> produtos = new ArrayList<>();

	public NotaFiscal(Date dataEmissao, String numero, String chave, Emissor emissor, Cliente cliente,
			List<Produto> produtos) {
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.chave = chave;
		this.emissor = emissor;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public Emissor getEmissor() {
		return emissor;
	}

	public void setEmissor(Emissor emissor) {
		this.emissor = emissor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Número: " + getNumero() + "\n");
		sb.append("Data de Emissão: " + getDataEmissao() + "\n");
		sb.append("Chave: " + getChave() + "\n");
		sb.append("Emissor Nome: " + getEmissor().getNome() + "\n");
		return sb.toString();
	}

}
