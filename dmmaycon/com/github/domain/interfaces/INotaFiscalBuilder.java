package dmmaycon.com.github.domain.interfaces;

import java.util.Date;
import java.util.List;

import dmmaycon.com.github.domain.Cliente;
import dmmaycon.com.github.domain.Emissor;
import dmmaycon.com.github.domain.Produto;

public interface INotaFiscalBuilder {

	public void setDataEmissao(Date dataEmissao);
	public void setNumero(String numero);
	public void setChave(String chave);
	public void setEmissor(Emissor emissor);
	public void setCliente(Cliente cliente);
	public void setListaProdutos(List<Produto> listaProdutos);
	
}
